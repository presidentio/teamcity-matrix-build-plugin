package com.presidentio.teamcity.matrix.build.agent.plan;

import com.presidentio.teamcity.rest.dto.Build;
import com.presidentio.teamcity.rest.resource.AppRestBuildQueueResource;
import com.presidentio.teamcity.rest.resource.AppRestBuildsResource;
import jetbrains.buildServer.agent.BuildProgressLogger;

import java.util.Map;

public class PlannedBuild {

    private Build build;

    private Map<String, String> parameters;

    public PlannedBuild(Build build, Map<String, String> parameters) {
        this.build = build;
        this.parameters = parameters;
    }

    public QueuedBuild startBuild(AppRestBuildQueueResource buildQueueResource, AppRestBuildsResource buildsResource,
                                   BuildProgressLogger buildLogger) {
        Build build = buildQueueResource.queueNewBuild(getBuild());

        buildLogger.message("Build " + build.getId() + " is triggered with parameters " + getParameters());
        com.presidentio.teamcity.matrix.build.common.dto.Build reportBuild =
                new com.presidentio.teamcity.matrix.build.common.dto.Build(build.getId(), getParameters());
        return new QueuedBuild(buildLogger, reportBuild, buildsResource,
                buildQueueResource);
    }

    public Build getBuild() {
        return build;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

}
