/**
 * Copyright 2015 presidentio
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.presidentio.teamcity.matrix.build.server;

import com.presidentio.teamcity.matrix.build.common.cons.Dictionary;
import com.presidentio.teamcity.matrix.build.common.cons.PluginConst;
import com.presidentio.teamcity.matrix.build.common.cons.SettingsConst;
import jetbrains.buildServer.serverSide.*;
import jetbrains.buildServer.web.openapi.PluginDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vitaliy on 14.04.2015.
 */
public class MatrixBuildRunType extends RunType {

    private final PluginDescriptor pluginDescriptor;

    private ProjectManager projectManager;

    public MatrixBuildRunType(final RunTypeRegistry runTypeRegistry, final PluginDescriptor pluginDescriptor,
                              ProjectManager projectManager) {
        this.pluginDescriptor = pluginDescriptor;
        this.projectManager = projectManager;
        runTypeRegistry.registerRunType(this);
    }

    @NotNull
    @Override
    public String describeParameters(@NotNull Map<String, String> parameters) {
        String buildTypeId = parameters.get(SettingsConst.PROP_BUILD_TYPE_ID);
        SBuildType buildType = projectManager.findBuildTypeById(buildTypeId);
        assert buildType != null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Build type: ").append(buildType.getProjectName()).append(" > ")
                .append(buildType.getName()).append("\n");
        String properties = parameters.get(SettingsConst.PROP_BUILD_PARAMETERS);
        stringBuilder.append("Properties:\n").append(properties);
        return stringBuilder.toString();
    }

    @NotNull
    @Override
    public String getType() {
        return PluginConst.RUNNER_TYPE;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return Dictionary.DISPLAY_NAME;
    }

    @NotNull
    @Override
    public String getDescription() {
        return Dictionary.DESCRIPTION;
    }

    @Nullable
    @Override
    public PropertiesProcessor getRunnerPropertiesProcessor() {
        return new MatrixBuildRunTypePropertiesProcessor(projectManager);
    }

    @Nullable
    @Override
    public String getEditRunnerParamsJspFilePath() {
        return pluginDescriptor.getPluginResourcesPath("editMatrixBuildParams.jsp");
    }

    @Nullable
    @Override
    public String getViewRunnerParamsJspFilePath() {
        return pluginDescriptor.getPluginResourcesPath("viewMatrixBuildParams.jsp");
    }

    @Nullable
    @Override
    public Map<String, String> getDefaultRunnerProperties() {
        Map<String, String> map = new HashMap<>(1);
        map.put(SettingsConst.PROP_WAIT_BUILDS_FINISH, "true");
        return map;
    }
}
