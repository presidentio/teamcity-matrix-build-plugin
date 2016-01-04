/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.presidentio.teamcity.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import com.presidentio.teamcity.rest.dto.Test;
import com.presidentio.teamcity.rest.dto.Tests;

@Path("/app/rest/tests")
public interface AppRestTestsResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Tests getTests(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{testLocator}")
    Test serveInstance(@PathParam("testLocator") String testLocator, @QueryParam("fields") String fields);

}