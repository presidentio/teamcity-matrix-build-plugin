package com.presidentio.teamcity.matrix.build.agent;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intellij.openapi.diagnostic.Logger;
import com.presidentio.teamcity.matrix.build.agent.config.ConfigurationException;
import com.presidentio.teamcity.matrix.build.agent.config.MatrixBuildConfiguration;
import com.presidentio.teamcity.matrix.build.agent.plan.BuildPlan;
import com.presidentio.teamcity.matrix.build.agent.plan.PlannedBuild;
import com.presidentio.teamcity.matrix.build.agent.plan.QueuedBuild;
import com.presidentio.teamcity.matrix.build.common.cons.PluginConst;
import com.presidentio.teamcity.matrix.build.common.cons.SettingsConst;
import com.presidentio.teamcity.matrix.build.common.dto.Report;
import com.presidentio.teamcity.rest.client.TeamcityServerClient;
import com.presidentio.teamcity.rest.client.TeamcityServerClientImpl;
import com.presidentio.teamcity.rest.resource.AppRestBuildQueueResource;
import com.presidentio.teamcity.rest.resource.AppRestBuildTypesResource;
import com.presidentio.teamcity.rest.resource.AppRestBuildsResource;
import jetbrains.buildServer.RunBuildException;
import jetbrains.buildServer.agent.BuildFinishedStatus;
import jetbrains.buildServer.agent.BuildProcess;
import jetbrains.buildServer.agent.BuildRunnerContext;
import jetbrains.buildServer.agent.artifacts.ArtifactsWatcher;
import jetbrains.buildServer.log.Loggers;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by presidentio on 10/30/15.
 */
public class MatrixBuildProcess implements BuildProcess, Runnable {

    private static final Logger LOGGER = Loggers.AGENT;

    private ObjectMapper objectMapper = new ObjectMapper();
    private Thread processThread;
    private BuildRunnerContext buildRunnerContext;
    private BuildFinishedStatus buildFinishedStatus = BuildFinishedStatus.FINISHED_SUCCESS;
    private ArtifactsWatcher artifactsWatcher;
    private AppRestBuildQueueResource buildQueueResource;
    private AppRestBuildsResource buildsResource;
    private AppRestBuildTypesResource buildTypesResource;
    private Report report;
    private volatile boolean canceled = false;
    private MatrixBuildConfiguration configuration;
    private List<QueuedBuild> queuedBuilds = new ArrayList<>();

    public MatrixBuildProcess(ArtifactsWatcher artifactsWatcher, BuildRunnerContext buildRunnerContext) {
        this.buildRunnerContext = buildRunnerContext;
        this.artifactsWatcher = artifactsWatcher;
    }

    @Override
    public void start() throws RunBuildException {
        processThread = new Thread(this);
        processThread.start();
        processThread.setContextClassLoader(MatrixBuildProcess.class.getClassLoader());
    }

    @Override
    public boolean isInterrupted() {
        return processThread.isInterrupted();
    }

    @Override
    public boolean isFinished() {
        return !processThread.isAlive();
    }

    @Override
    public void interrupt() {
        canceled = true;
        for (QueuedBuild queuedBuild : queuedBuilds) {
            queuedBuild.cancelBuild();
        }
        processThread.interrupt();
    }

    @NotNull
    @Override
    public BuildFinishedStatus waitFor() throws RunBuildException {
        try {
            processThread.join();
            return buildFinishedStatus;
        } catch (InterruptedException e) {
            buildRunnerContext.getBuild().getBuildLogger().error("Failed on waiting process finished");
            buildRunnerContext.getBuild().getBuildLogger().exception(e);
            return BuildFinishedStatus.INTERRUPTED;
        }
    }

    @Override
    public void run() {
        buildRunnerContext.getBuild().getBuildLogger().message("Started matrix build");
        initRestResources();
        try {
            configuration = new MatrixBuildConfiguration(buildRunnerContext.getRunnerParameters());
        } catch (ConfigurationException e) {
            buildRunnerContext.getBuild().getBuildLogger().error(e.getMessage());
            buildRunnerContext.getBuild().getBuildLogger().exception(e);
            buildFinishedStatus = BuildFinishedStatus.FINISHED_FAILED;
        }

        List<QueuedBuild> builds = new ArrayList<>();
        BuildPlan buildPlan = new BuildPlan(configuration);
        for (PlannedBuild plannedBuild : buildPlan.getBuilds()) {
            builds.add(plannedBuild.startBuild(buildQueueResource, buildsResource,
                    buildRunnerContext.getBuild().getBuildLogger()));
        }

        makeReport(builds);

        if (configuration.isWaitBuildsFinish()) {
            try {
                for (QueuedBuild build : builds) {
                    BuildFinishedStatus buildFinishedStatus = build.waitBuildFinish();
                    if (buildFinishedStatus != BuildFinishedStatus.FINISHED_SUCCESS) {
                        this.buildFinishedStatus = buildFinishedStatus;
                    }
                }
            } catch (InterruptedException e) {
                buildRunnerContext.getBuild().getBuildLogger().error("Build was interrupted");
            }
        }

        buildRunnerContext.getBuild().getBuildLogger().message("Matrix build is finished");
    }

    private void initRestResources() {
        TeamcityServerClient teamcityServerClient = new TeamcityServerClientImpl(
                buildRunnerContext.getRunnerParameters().get(SettingsConst.PROP_TEAMCITY_SERVER_URL),
                buildRunnerContext.getRunnerParameters().get(SettingsConst.PROP_TEAMCITY_SERVER_USERNAME),
                buildRunnerContext.getRunnerParameters().get(SettingsConst.PROP_TEAMCITY_SERVER_PASSWORD));
        buildQueueResource = teamcityServerClient.getResource(AppRestBuildQueueResource.class);
        buildsResource = teamcityServerClient.getResource(AppRestBuildsResource.class);
        buildTypesResource = teamcityServerClient.getResource(AppRestBuildTypesResource.class);
    }

    private void makeReport(List<QueuedBuild> queuedBuilds) {
        List<com.presidentio.teamcity.matrix.build.common.dto.Build> builds = new ArrayList<>(queuedBuilds.size());
        for (QueuedBuild queuedBuild : queuedBuilds) {
            builds.add(queuedBuild.getBuild());
        }

        try {
            report = new Report(builds, configuration.getParameters());
            saveReport(report);
        } catch (IOException e) {
            buildRunnerContext.getBuild().getBuildLogger().error("Failed to save report");
            buildRunnerContext.getBuild().getBuildLogger().exception(e);
            buildFinishedStatus = BuildFinishedStatus.FINISHED_FAILED;
        }
    }

    private void saveReport(Report report) throws IOException {
        File reportFile = new File(buildRunnerContext.getWorkingDirectory(), PluginConst.REPORT_FILE);
        objectMapper.writeValue(reportFile, report);
        artifactsWatcher.addNewArtifactsPath(reportFile.getAbsolutePath() + " => " + PluginConst.REPORT_DIRECTORY);
    }

}
