package com.presidentio.teamcity.matrix.build.agent.plan;

import com.presidentio.teamcity.rest.cons.BuildStateConst;
import com.presidentio.teamcity.rest.cons.BuildStatusConst;
import com.presidentio.teamcity.rest.dto.Build;
import com.presidentio.teamcity.rest.dto.BuildCancelRequest;
import com.presidentio.teamcity.rest.resource.AppRestBuildQueueResource;
import com.presidentio.teamcity.rest.resource.AppRestBuildsResource;
import jetbrains.buildServer.agent.BuildFinishedStatus;
import jetbrains.buildServer.agent.BuildProgressLogger;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;

public class QueuedBuild {

    private BuildProgressLogger buildProgressLogger;

    private boolean canceled;
    private com.presidentio.teamcity.matrix.build.common.dto.Build build;

    private AppRestBuildsResource buildsResource;
    private AppRestBuildQueueResource buildQueueResource;

    public QueuedBuild(BuildProgressLogger buildProgressLogger,
                       com.presidentio.teamcity.matrix.build.common.dto.Build build,
                       AppRestBuildsResource buildsResource, AppRestBuildQueueResource buildQueueResource) {
        this.buildProgressLogger = buildProgressLogger;
        this.build = build;
        this.buildsResource = buildsResource;
        this.buildQueueResource = buildQueueResource;
    }

    public BuildFinishedStatus waitBuildFinish()
            throws InterruptedException {
        boolean buildFinished = false;
        Build childBuild = null;
        while (!buildFinished && !canceled) {
            childBuild = buildsResource.serveBuild(build.getBuildId().toString(), "");
            buildFinished = isBuildFinished(childBuild);
            Thread.sleep(100L);
        }
        buildProgressLogger.message("Build " + build.getBuildId()
                + " is finished with success");
        if (!canceled) {
            if (childBuild.getStatus().equalsIgnoreCase(BuildStatusConst.ERROR)
                    || childBuild.getStatus().equalsIgnoreCase(BuildStatusConst.FAILURE)) {
                return BuildFinishedStatus.FINISHED_WITH_PROBLEMS;
            }
        }
        return canceled ? BuildFinishedStatus.INTERRUPTED : BuildFinishedStatus.FINISHED_SUCCESS;
    }

    public boolean isBuildFinished(Build build) {
        return BuildStateConst.DELETED.equals(build.getState()) || BuildStateConst.FINISHED.equals(build.getState());
    }

    public void cancelBuild() {
        canceled = true;
        try {
            buildQueueResource.cancelBuild("" + build.getBuildId(), new BuildCancelRequest());
        } catch (NotFoundException e) {
            buildProgressLogger.message("Build with id " + build.getBuildId() + " does not found in queue");
        }
        try {
            buildsResource.cancelBuild("" + build.getBuildId(), null, new BuildCancelRequest());
        } catch (BadRequestException e) {
            buildProgressLogger.message("Build with id " + build.getBuildId() + " does not found in running builds");
        }
        buildProgressLogger.message("Build " + build.getBuildId() + " is canceled");
    }

    public com.presidentio.teamcity.matrix.build.common.dto.Build getBuild() {
        return build;
    }
}
