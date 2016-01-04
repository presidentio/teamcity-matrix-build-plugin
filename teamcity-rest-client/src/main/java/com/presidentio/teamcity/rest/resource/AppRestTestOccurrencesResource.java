/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.presidentio.teamcity.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import com.presidentio.teamcity.rest.dto.TestOccurrence;
import com.presidentio.teamcity.rest.dto.TestOccurrences;

@Path("/app/rest/testOccurrences")
public interface AppRestTestOccurrencesResource {

    @GET
    @Produces({"application/xml", "application/json" })
    TestOccurrences getTestOccurrences(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{testLocator}")
    TestOccurrence serveInstance(@PathParam("testLocator") String testLocator, @QueryParam("fields") String fields);

}