package com.presidentio.teamcity.matrix.build.agent;

import com.intellij.openapi.diagnostic.Logger;
import jetbrains.buildServer.agent.BuildProgressLogger;

import java.io.*;

/**
 * Created by presidentio on 10/30/15.
 */
public class StreamToBuildLog extends Thread {

    private static final Logger LOGGER = Logger.getInstance("matrix-build-agent");

    private BufferedReader bufferedReader;

    private BuildProgressLogger buildProgressLogger;

    public StreamToBuildLog(InputStream inputStream, BuildProgressLogger buildProgressLogger) {
        this.bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        this.buildProgressLogger = buildProgressLogger;
        setDaemon(true);
    }

    @Override
    public void run() {
        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                buildProgressLogger.message(line);
            }
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
}
