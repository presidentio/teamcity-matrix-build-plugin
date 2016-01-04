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
package com.presidentio.teamcity.matrix.build.view;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intellij.openapi.diagnostic.Logger;
import com.presidentio.teamcity.matrix.build.common.cons.Dictionary;
import com.presidentio.teamcity.matrix.build.common.cons.PluginConst;
import com.presidentio.teamcity.matrix.build.common.dto.Report;
import jetbrains.buildServer.log.Loggers;
import jetbrains.buildServer.serverSide.BuildsManager;
import jetbrains.buildServer.serverSide.SBuild;
import jetbrains.buildServer.serverSide.artifacts.BuildArtifactsViewMode;
import jetbrains.buildServer.web.openapi.BuildTab;
import jetbrains.buildServer.web.openapi.PluginDescriptor;
import jetbrains.buildServer.web.openapi.WebControllerManager;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Vitaliy on 09.04.2015.
 */
public class MatrixBuildTab extends BuildTab {

    private static final Logger LOGGER = Loggers.SERVER;

    private ObjectMapper objectMapper = new ObjectMapper();

    public MatrixBuildTab(@NotNull WebControllerManager webControllerManager,
                          @NotNull BuildsManager buildsManager,
                          @NotNull PluginDescriptor descriptor) {
        super(PluginConst.TAB_ID, Dictionary.TAB_TITLE, webControllerManager,
                buildsManager, descriptor.getPluginResourcesPath("tabMatrixBuild.jsp"));
    }

    @Override
    protected boolean isAvailableFor(@NotNull SBuild build) {
        return build.getArtifacts(BuildArtifactsViewMode.VIEW_HIDDEN_ONLY)
                .findArtifact(PluginConst.REPORT_DIRECTORY + "/" + PluginConst.REPORT_FILE).isAccessible();
    }

    @Override
    protected void fillModel(@NotNull Map<String, Object> model, @NotNull SBuild build) {
        File reportFile = new File(new File(build.getArtifactsDirectory(), PluginConst.REPORT_DIRECTORY),
                PluginConst.REPORT_FILE);
        try {
            Report report = objectMapper.readValue(reportFile, Report.class);
            model.put("report", report);
        } catch (IOException e) {
            model.put("error", Dictionary.ERROR_FAILED_TO_PARSE_REPORT);
            LOGGER.error(Dictionary.ERROR_FAILED_TO_PARSE_REPORT, e);
        }

    }

}
