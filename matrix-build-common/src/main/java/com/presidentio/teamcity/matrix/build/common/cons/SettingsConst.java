/**
 * Copyright 2015 presidentio
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.presidentio.teamcity.matrix.build.common.cons;

/**
 * Created by presidentio on 07.05.15.
 */
public class SettingsConst {

    public static final String PROP_BUILD_TYPE_ID = "build.type.id";
    public static final String PROP_BUILD_PARAMETERS = "matrix.parameters";
    public static final String PROP_TEAMCITY_SERVER_URL = "teamcity.server.url";
    public static final String PROP_TEAMCITY_SERVER_USERNAME = "teamcity.server.username";
    public static final String PROP_TEAMCITY_SERVER_PASSWORD = "teamcity.server.password";
    public static final String PROP_WAIT_BUILDS_FINISH = "wait.builds.finish";

    public String getPROP_BUILD_TYPE_ID() {
        return PROP_BUILD_TYPE_ID;
    }

    public String getPROP_BUILD_PARAMETERS() {
        return PROP_BUILD_PARAMETERS;
    }

    public String getPROP_TEAMCITY_SERVER_URL() {
        return PROP_TEAMCITY_SERVER_URL;
    }

    public String getPROP_TEAMCITY_SERVER_USERNAME() {
        return PROP_TEAMCITY_SERVER_USERNAME;
    }

    public String getPROP_TEAMCITY_SERVER_PASSWORD() {
        return PROP_TEAMCITY_SERVER_PASSWORD;
    }

    public String getPROP_WAIT_BUILDS_FINISH() {
        return PROP_WAIT_BUILDS_FINISH;
    }
}
