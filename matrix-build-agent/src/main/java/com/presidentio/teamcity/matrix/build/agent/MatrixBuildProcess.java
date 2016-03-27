package com.presidentio.teamcity.matrix.build.agent;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intellij.openapi.diagnostic.Logger;
import com.presidentio.teamcity.matrix.build.common.cons.PluginConst;
import com.presidentio.teamcity.matrix.build.common.cons.SettingsConst;
import com.presidentio.teamcity.matrix.build.common.dto.Report;
import com.presidentio.teamcity.rest.client.TeamcityServerClient;
import com.presidentio.teamcity.rest.client.TeamcityServerClientImpl;
import com.presidentio.teamcity.rest.cons.BuildStateConst;
import com.presidentio.teamcity.rest.cons.BuildStatusConst;
import com.presidentio.teamcity.rest.dto.*;
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

import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private java.util.Properties consts;

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

    public void saveReport(Report report) throws IOException {
        File reportFile = new File(buildRunnerContext.getWorkingDirectory(), PluginConst.REPORT_FILE);
        objectMapper.writeValue(reportFile, report);
        artifactsWatcher.addNewArtifactsPath(reportFile.getAbsolutePath() + " => " + PluginConst.REPORT_DIRECTORY);
    }

    @Override
    public void run() {
        buildRunnerContext.getBuild().getBuildLogger().message("Started matrix build");
        initRestResources();

        consts = new java.util.Properties();
        String constParamters = buildRunnerContext.getRunnerParameters().get(SettingsConst.PROP_CONST_BUILD_PARAMETERS);
        try {
            consts.load(new StringReader(constParamters));
        } catch (IOException e) {
            buildRunnerContext.getBuild().getBuildLogger().error("Failed to parse const parameters: " + constParamters);
            buildRunnerContext.getBuild().getBuildLogger().exception(e);
            buildFinishedStatus = BuildFinishedStatus.FINISHED_FAILED;
            return;
        }

        String buildConfigurationParameters = buildRunnerContext.getRunnerParameters().get(SettingsConst.PROP_BUILD_PARAMETERS);
        Map<String, String[]> parameters;
        try {
            parameters = parseProperties(buildConfigurationParameters);
        } catch (IOException e) {
            buildFinishedStatus = BuildFinishedStatus.FINISHED_FAILED;
            buildRunnerContext.getBuild().getBuildLogger().exception(e);
            return;
        }

        boolean onlyDiagonal = Boolean.parseBoolean(buildRunnerContext.getRunnerParameters().get(SettingsConst.PROP_ONLY_DIAGONAL));
        int buildCount = calcBuildCount(parameters, onlyDiagonal);
        String buildTypeId = buildRunnerContext.getRunnerParameters().get(SettingsConst.PROP_BUILD_TYPE_ID);
        List<com.presidentio.teamcity.matrix.build.common.dto.Build> builds = new ArrayList<>(buildCount);
        for (int buildNumber = 0; buildNumber < buildCount; buildNumber++) {
            Map<String, String> buildParameters;
            if (onlyDiagonal) {
                buildParameters = getDiagonalBuildParameters(buildNumber, parameters);
            } else {
                buildParameters = getMatrixBuildParameters(buildNumber, parameters);
            }
            builds.add(startBuild(buildTypeId, buildNumber, buildParameters));
        }

        try {
            report = new Report(builds, parameters);
            saveReport(report);
        } catch (IOException e) {
            buildRunnerContext.getBuild().getBuildLogger().error("Failed to save report");
            buildRunnerContext.getBuild().getBuildLogger().exception(e);
            buildFinishedStatus = BuildFinishedStatus.FINISHED_FAILED;
            return;
        }

        boolean waitBuildsFinish = Boolean.parseBoolean(buildRunnerContext.getRunnerParameters()
                .get(SettingsConst.PROP_WAIT_BUILDS_FINISH));
        if (waitBuildsFinish) {
            waitBuildsFinish(builds);
        }

        buildRunnerContext.getBuild().getBuildLogger().message("Matrix build is finished");
    }


    private boolean isBuildFinished(Build build) {
        return BuildStateConst.DELETED.equals(build.getState()) || BuildStateConst.FINISHED.equals(build.getState());
    }

    private Map<String, String> getMatrixBuildParameters(int buildNumber, Map<String, String[]> parameters) {
        int parametersIdentifier = buildNumber;
        Map<String, String> buildParameters = new HashMap<>();
        for (Map.Entry<String, String[]> entry : parameters.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue()[parametersIdentifier % entry.getValue().length];
            parametersIdentifier /= entry.getValue().length;
            buildParameters.put(key, value);
        }
        return buildParameters;
    }

    private Map<String, String> getDiagonalBuildParameters(int buildNumber, Map<String, String[]> parameters) {
        Map<String, String> buildParameters = new HashMap<>();
        for (Map.Entry<String, String[]> entry : parameters.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue()[buildNumber];
            buildParameters.put(key, value);
        }
        return buildParameters;
    }

    private com.presidentio.teamcity.matrix.build.common.dto.Build startBuild(String buildTypeId, Integer buildNumber,
                                                                              Map<String, String> parameters) {
        Build build = new Build();

        //set build type
        BuildType buildType = new BuildType();
        buildType.setInternalId(buildTypeId);
        build.setBuildType(buildType);

        //generate properties
        com.presidentio.teamcity.rest.dto.Properties childBuildProperties = new com.presidentio.teamcity.rest.dto.Properties();
        for (Map.Entry<String, String> stringStringEntry : parameters.entrySet()) {
            Property property = new Property();
            property.setName(stringStringEntry.getKey());
            property.setValue(stringStringEntry.getValue());
            childBuildProperties.getProperty().add(property);
        }
        build.setProperties(childBuildProperties);

        //add const properties
        for (String name : consts.stringPropertyNames()) {
            Property property = new Property();
            property.setName(name);
            property.setValue(consts.getProperty(name));
            childBuildProperties.getProperty().add(property);
        }

        //add tag
        Tags tags = new Tags();
        Tag tag = new Tag();
        tag.setName("matrix");
        tags.getTag().add(tag);
        build.setTags(tags);

        VcsRootEntries childBuildVcsRootEntries = buildTypesResource.getVcsRootEntries(buildTypeId, null);
        Revisions revisions = new Revisions();
        for (Map.Entry<String, String> systemProperty : buildRunnerContext.getBuildParameters()
                .getSystemProperties().entrySet()) {
            if (systemProperty.getKey().startsWith("build.vcs.number.")) {
                String vcsRootId = systemProperty.getKey().replace("build.vcs.number.", "");
                String revisionVersion = systemProperty.getValue();
                for (com.presidentio.teamcity.rest.dto.VcsRootEntry vcsRootEntry : childBuildVcsRootEntries.getVcsRootEntry()) {
                    if (vcsRootEntry.getId().equals(vcsRootId)) {
                        Revision revision = new Revision();
                        revision.setVersion(revisionVersion);
                        VcsRootInstance vcsRootInstance = new VcsRootInstance();
                        vcsRootInstance.setVcsRootId(vcsRootId);
                        revision.setVcsRootInstance(vcsRootInstance);
                        revisions.getRevision().add(revision);
                        break;
                    }
                }
            }
        }
        build.setRevisions(revisions);

        build = buildQueueResource.queueNewBuild(build);

        buildRunnerContext.getBuild().getBuildLogger().message("Build " + build.getId() + " is triggered with "
                + "parameters " + childBuildProperties.toString());
        return new com.presidentio.teamcity.matrix.build.common.dto.Build(build.getId(), parameters);
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

    private Map<String, String[]> parseProperties(String buildConfigurationParameters) throws IOException {
        java.util.Properties properties = new java.util.Properties();
        properties.load(new ByteArrayInputStream(buildConfigurationParameters.getBytes()));
        Map<String, String[]> parameters = new HashMap<>();
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            String[] values = entry.getValue().toString().split(",");
            parameters.put(entry.getKey().toString(), values);
        }
        return parameters;
    }

    private int calcBuildCount(Map<String, String[]> parameters, boolean onlyDiagonal) {
        int buildCount = 1;
        for (String[] values : parameters.values()) {
            buildCount *= values.length;
            if (onlyDiagonal) {
                return buildCount;
            }
        }
        return buildCount;
    }

    private void waitBuildsFinish(List<com.presidentio.teamcity.matrix.build.common.dto.Build> builds) {
        for (com.presidentio.teamcity.matrix.build.common.dto.Build reportBuild : builds) {
            boolean buildFinished = false;
            Build childBuild = null;
            while (!buildFinished && !canceled) {
                childBuild = buildsResource.serveBuild(reportBuild.getBuildId().toString(), "");
                buildFinished = isBuildFinished(childBuild);
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    buildRunnerContext.getBuild().getBuildLogger().warning("Build is interrupted");
                }
            }
            if (canceled) {
                cancelBuild(reportBuild.getBuildId().toString());
                buildRunnerContext.getBuild().getBuildLogger().message("Build " + reportBuild.getBuildId()
                        + " is canceled");
                buildFinishedStatus = BuildFinishedStatus.INTERRUPTED;
            }
            if (!canceled) {
                if (childBuild.getStatus().equalsIgnoreCase(BuildStatusConst.ERROR)
                        || childBuild.getStatus().equalsIgnoreCase(BuildStatusConst.FAILURE)) {
                    buildFinishedStatus = BuildFinishedStatus.FINISHED_WITH_PROBLEMS;
                }
            }
            buildRunnerContext.getBuild().getBuildLogger().message("Build " + reportBuild.getBuildId()
                    + " is finished with success");
        }
    }

    private void cancelBuild(String buildId) {
        try {
            buildQueueResource.cancelBuild(buildId, new BuildCancelRequest());
        } catch (NotFoundException e) {
            LOGGER.info("Build with id " + buildId + " does not found in queue");
        }
        try {
            buildsResource.cancelBuild(buildId, null, new BuildCancelRequest());
        } catch (BadRequestException e) {
            LOGGER.info("Build with id " + buildId + " does not found in running builds");
        }
    }

}
