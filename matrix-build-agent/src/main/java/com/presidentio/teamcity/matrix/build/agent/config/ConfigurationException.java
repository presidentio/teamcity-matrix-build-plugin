package com.presidentio.teamcity.matrix.build.agent.config;

public class ConfigurationException extends Exception {

    private static final String MESSAGE = "Failed to parse configuration parameter %s. Original value: %s";

    public ConfigurationException(String name, String originalValue) {
        super(String.format(MESSAGE, name, originalValue));
    }

    public ConfigurationException(String name, String originalValue, Throwable cause) {
        super(String.format(MESSAGE, name, originalValue), cause);
    }
}
