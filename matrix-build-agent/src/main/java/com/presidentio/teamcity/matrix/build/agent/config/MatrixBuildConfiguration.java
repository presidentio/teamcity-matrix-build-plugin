package com.presidentio.teamcity.matrix.build.agent.config;

import com.presidentio.teamcity.matrix.build.common.cons.SettingsConst;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MatrixBuildConfiguration {

    private Map<String, String[]> parameters;

    private Properties consts;

    private boolean onlyDiagonal;

    private String buildType;

    private boolean waitBuildsFinish;

    public MatrixBuildConfiguration(Map<String, String> runnerParameters) throws ConfigurationException {
        parameters = loadParameters(runnerParameters);
        consts = loadConsts(runnerParameters);
        onlyDiagonal = loadOnlyDiagonal(runnerParameters);
        buildType = loadBuildType(runnerParameters);
        waitBuildsFinish = loadWaitBuildsFinish(runnerParameters);
    }

    private java.util.Properties loadConsts(Map<String, String> runnerParameters) throws ConfigurationException {
        java.util.Properties consts = new java.util.Properties();
        String constParameters = runnerParameters.get(SettingsConst.PROP_CONST_BUILD_PARAMETERS);
        try {
            consts.load(new StringReader(constParameters));
        } catch (IOException e) {
            throw new ConfigurationException(SettingsConst.PROP_CONST_BUILD_PARAMETERS, constParameters, e);
        }
        return consts;
    }

    private boolean loadOnlyDiagonal(Map<String, String> runnerParameters) {
        return Boolean.parseBoolean(runnerParameters.get(SettingsConst.PROP_ONLY_DIAGONAL));
    }

    private String loadBuildType(Map<String, String> runnerParameters) {
        return runnerParameters.get(SettingsConst.PROP_BUILD_TYPE_ID);
    }

    private Map<String, String[]> loadParameters(Map<String, String> runnerParameters) throws ConfigurationException {
        String buildConfigurationParameters = runnerParameters.get(SettingsConst.PROP_BUILD_PARAMETERS);
        try {
            return parseProperties(buildConfigurationParameters);
        } catch (IOException e) {
            throw new ConfigurationException(SettingsConst.PROP_CONST_BUILD_PARAMETERS,
                    buildConfigurationParameters, e);
        }
    }

    private Map<String, String[]> parseProperties(String buildConfigurationParameters) throws IOException {
        java.util.Properties properties = new java.util.Properties();
        properties.load(new ByteArrayInputStream(buildConfigurationParameters.getBytes()));
        Map<String, String[]> parameters = new HashMap<>();
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            String[] values = entry.getValue().toString().split(",");
            parameters.put(entry.getKey().toString(), values);
        }
        return parameters;
    }

    private boolean loadWaitBuildsFinish(Map<String, String> runnerParameters) {
        return Boolean.parseBoolean(runnerParameters.get(SettingsConst.PROP_WAIT_BUILDS_FINISH));
    }

    public Map<String, String[]> getParameters() {
        return parameters;
    }

    public Properties getConsts() {
        return consts;
    }

    public boolean isOnlyDiagonal() {
        return onlyDiagonal;
    }

    public String getBuildType() {
        return buildType;
    }

    public boolean isWaitBuildsFinish() {
        return waitBuildsFinish;
    }
}
