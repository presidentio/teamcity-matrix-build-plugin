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
import com.presidentio.teamcity.matrix.build.common.cons.SettingsConst;
import jetbrains.buildServer.log.Loggers;
import jetbrains.buildServer.serverSide.InvalidProperty;
import jetbrains.buildServer.serverSide.ProjectManager;
import jetbrains.buildServer.serverSide.PropertiesProcessor;
import jetbrains.buildServer.util.PropertiesUtil;

import java.io.IOException;
import java.io.StringReader;
import java.util.*;


/**
 * Created by Vitaliy on 14.04.2015.
 */
public class MatrixBuildRunTypePropertiesProcessor implements PropertiesProcessor {

    private ProjectManager projectManager;

    public MatrixBuildRunTypePropertiesProcessor(ProjectManager projectManager) {
        this.projectManager = projectManager;
    }

    @Override
    public Collection<InvalidProperty> process(Map<String, String> map) {
        List<InvalidProperty> result = new ArrayList<>();
        Loggers.SERVER.info(map.toString());
        String buildTypeId = map.get(SettingsConst.PROP_BUILD_TYPE_ID);
        if (PropertiesUtil.isEmptyOrNull(buildTypeId)) {
            result.add(new InvalidProperty(SettingsConst.PROP_BUILD_TYPE_ID, Dictionary.ERROR_BUILD_TYPE_IS_EMPTY));
        } else {
            if (projectManager.findBuildTypeById(buildTypeId) == null) {
                result.add(new InvalidProperty(SettingsConst.PROP_BUILD_TYPE_ID, Dictionary.ERROR_BUILD_TYPE_NOT_FOUND));
            }
        }

        boolean onlyDiagonal = Boolean.valueOf(map.get(SettingsConst.PROP_ONLY_DIAGONAL));
        String parameters = map.get(SettingsConst.PROP_BUILD_PARAMETERS);
        Properties properties = new Properties();
        try {
            properties.load(new StringReader(parameters));
            if (properties.isEmpty()) {
                result.add(new InvalidProperty(SettingsConst.PROP_BUILD_PARAMETERS, Dictionary.ERROR_PROPERTIES_IS_EMPTY));
            }
            if (onlyDiagonal) {
                int propCount = -1;
                for (String propName : properties.stringPropertyNames()) {
                    if (propCount == -1) {
                        propCount = properties.getProperty(propName).split(",").length;
                    } else {
                        if (propCount != properties.getProperty(propName).split(",").length) {
                            result.add(new InvalidProperty(SettingsConst.PROP_BUILD_PARAMETERS, Dictionary.ERROR_PROPERTIES_VALUES_COUNT));
                            break;
                        }
                    }
                }
            }
        } catch (IOException e) {
            result.add(new InvalidProperty(SettingsConst.PROP_BUILD_PARAMETERS, Dictionary.ERROR_INVALID_PROPERTIES));
        }

        return result;
    }

}
