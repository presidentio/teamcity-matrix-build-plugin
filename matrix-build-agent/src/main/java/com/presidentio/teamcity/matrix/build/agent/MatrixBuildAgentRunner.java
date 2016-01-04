package com.presidentio.teamcity.matrix.build.agent;

import com.presidentio.teamcity.matrix.build.common.cons.PluginConst;
import jetbrains.buildServer.RunBuildException;
import jetbrains.buildServer.agent.*;
import jetbrains.buildServer.agent.artifacts.ArtifactsWatcher;
import org.jetbrains.annotations.NotNull;

/**
 * Created by presidentio on 10/30/15.
 */
public class MatrixBuildAgentRunner implements AgentBuildRunner {

    private ArtifactsWatcher artifactsWatcher;

    public MatrixBuildAgentRunner(ArtifactsWatcher artifactsWatcher) {
        this.artifactsWatcher = artifactsWatcher;
    }

    @NotNull
    @Override
    public BuildProcess createBuildProcess(AgentRunningBuild agentRunningBuild,
                                           BuildRunnerContext buildRunnerContext) throws RunBuildException {
        return new MatrixBuildProcess(artifactsWatcher, buildRunnerContext);
    }

    @NotNull
    @Override
    public AgentBuildRunnerInfo getRunnerInfo() {
        return new AgentBuildRunnerInfo() {
            @NotNull
            public String getType() {
                return PluginConst.RUNNER_TYPE;
            }

            public boolean canRun(@NotNull final BuildAgentConfiguration buildAgentConfiguration) {
                return true;
            }
        };
    }

}
