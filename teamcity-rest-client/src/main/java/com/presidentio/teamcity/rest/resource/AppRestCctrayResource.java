/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.presidentio.teamcity.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import com.presidentio.teamcity.rest.dto.Projects;

@Path("/app/rest/cctray")
public interface AppRestCctrayResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Projects serveProjectsConvenienceCopy(@QueryParam("locator") String locator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/projects.xml")
    Projects serveProjects(@QueryParam("locator") String locator);

}