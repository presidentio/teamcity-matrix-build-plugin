package com.presidentio.teamcity.matrix.build.common.dto;

import java.util.Map;

/**
 * Created by presidentio on 1/3/16.
 */
public class Build {

    private Long buildId;

    private Map<String, String> parameters;

    public Build() {
    }

    public Build(Long buildId, Map<String, String> parameters) {
        this.buildId = buildId;
        this.parameters = parameters;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public Build setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public Long getBuildId() {
        return buildId;
    }

    public Build setBuildId(Long buildId) {
        this.buildId = buildId;
        return this;
    }
}
