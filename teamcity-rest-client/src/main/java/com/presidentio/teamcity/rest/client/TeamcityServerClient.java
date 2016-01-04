package com.presidentio.teamcity.rest.client;

/**
 * Created by presidentio on 12/23/15.
 */
public interface TeamcityServerClient {

    <T> T getResource(Class<T> resourceClass);

}
