/**
 * Copyright (C) Zoomdata, Inc. 2012-2017. All rights reserved.
 */
package com.presidentio.teamcity.matrix.build.agent.plan;

import com.presidentio.teamcity.matrix.build.agent.config.MatrixBuildConfiguration;
import com.presidentio.teamcity.rest.dto.Build;
import com.presidentio.teamcity.rest.dto.BuildType;
import com.presidentio.teamcity.rest.dto.Property;
import com.presidentio.teamcity.rest.dto.Tag;
import com.presidentio.teamcity.rest.dto.Tags;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class BuildPlan {

    private List<PlannedBuild> builds = new ArrayList<>();

    public BuildPlan(MatrixBuildConfiguration configuration) {
        init(configuration);
    }

    private void init(MatrixBuildConfiguration configuration) {
        int buildCount = calcBuildCount(configuration.getParameters(), configuration.isOnlyDiagonal());
        for (int buildNumber = 0; buildNumber < buildCount; buildNumber++) {
            Map<String, String> buildParameters;
            if (configuration.isOnlyDiagonal()) {
                buildParameters = getDiagonalBuildParameters(buildNumber, configuration.getParameters());
            } else {
                buildParameters = getMatrixBuildParameters(buildNumber, configuration.getParameters());
            }
            builds.add(new PlannedBuild(
                    createBuild(configuration.getBuildType(), buildNumber, buildParameters, configuration.getConsts()),
                    buildParameters));
        }
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

    private Map<String, String> getDiagonalBuildParameters(int buildNumber, Map<String, String[]> parameters) {
        Map<String, String> buildParameters = new HashMap<>();
        for (Map.Entry<String, String[]> entry : parameters.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue()[buildNumber];
            buildParameters.put(key, value);
        }
        return buildParameters;
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

    private Build createBuild(String buildTypeId, Integer buildNumber, Map<String, String> parameters,
                              Properties consts) {
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

        enrichWithRevision(build);

        return build;
    }

    private void enrichWithRevision(Build build) {
        //TODO: implement
    }

    public List<PlannedBuild> getBuilds() {
        return builds;
    }
}
