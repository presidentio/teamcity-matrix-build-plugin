package com.presidentio.teamcity.rest.client;

import com.presidentio.teamcity.rest.dto.BuildCancelRequest;
import com.presidentio.teamcity.rest.resource.AppRestBuildQueueResource;
import com.presidentio.teamcity.rest.resource.AppRestBuildTypesResource;
import com.presidentio.teamcity.rest.resource.AppRestBuildsResource;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by presidentio on 12/27/15.
 */
public class TeamcityServerClientImplTest {

    @Test
    @Ignore
    public void testGetResource() throws Exception {
        TeamcityServerClient teamcityServerClient = new TeamcityServerClientImpl("http://home.presidentio.com:8111",
                "presidentio", "wrong_password");
        AppRestBuildQueueResource queueResource = teamcityServerClient.getResource(AppRestBuildQueueResource.class);
    }

    @Test
    @Ignore
    public void testGetVcsRoot() throws Exception {
        TeamcityServerClient teamcityServerClient = new TeamcityServerClientImpl("http://home.presidentio.com:8111",
                "presidentio", "wrong_password");
        AppRestBuildTypesResource buildTypesResource = teamcityServerClient.getResource(AppRestBuildTypesResource.class);
        System.out.println(buildTypesResource.getVcsRootEntries("prairie_test", null));
    }

    @Test
    @Ignore
    public void testCancelBuild() throws Exception {
        TeamcityServerClient teamcityServerClient = new TeamcityServerClientImpl("http://home.presidentio.com:8111",
                "presidentio", "wrong_password");
        AppRestBuildQueueResource buildQueueResource = teamcityServerClient.getResource(AppRestBuildQueueResource.class);
        AppRestBuildsResource buildsResource = teamcityServerClient.getResource(AppRestBuildsResource.class);
        buildsResource.cancelBuild("527", null, new BuildCancelRequest());
    }
}