package com.presidentio.teamcity.matrix.build.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by presidentio on 1/3/16.
 */
@XmlRootElement
public class Report {

    private List<Build> builds = new ArrayList<>();

    private Map<String, String[]> parameters;

    public Report() {
    }

    public Report(List<Build> builds, Map<String, String[]> parameters) {
        this.builds = builds;
        this.parameters = parameters;
    }

    public List<Build> getBuilds() {
        return builds;
    }

    public Report setBuilds(List<Build> builds) {
        this.builds = builds;
        return this;
    }

    public Map<String, String[]> getParameters() {
        return parameters;
    }

    public Report setParameters(Map<String, String[]> parameters) {
        this.parameters = parameters;
        return this;
    }
}
