/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.presidentio.teamcity.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import com.presidentio.teamcity.rest.dto.Investigation;
import com.presidentio.teamcity.rest.dto.Investigations;

@Path("/app/rest/investigations")
public interface AppRestInvestigationsResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Investigations getInvestigations(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{investigationLocator}")
    Investigation serveInstance(@PathParam("investigationLocator") String investigationLocator, @QueryParam("fields") String fields);

}