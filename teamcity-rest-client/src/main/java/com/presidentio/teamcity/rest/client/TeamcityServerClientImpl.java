package com.presidentio.teamcity.rest.client;

import org.apache.cxf.jaxrs.client.Client;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;

/**
 * Created by presidentio on 12/23/15.
 */
public class TeamcityServerClientImpl implements TeamcityServerClient {

    private Client client;

    public TeamcityServerClientImpl(String basePath, String username, String password) {
        this.client = WebClient.create(basePath, username, password, "jaxb.xml");
    }

    @Override
    public <T> T getResource(Class<T> resourceClass) {
        T teamcityServerResource = JAXRSClientFactory.fromClient(client, resourceClass);
        return teamcityServerResource;
    }
}
