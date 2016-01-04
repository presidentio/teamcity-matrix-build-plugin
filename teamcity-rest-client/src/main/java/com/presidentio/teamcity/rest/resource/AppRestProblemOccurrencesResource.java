/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.presidentio.teamcity.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import com.presidentio.teamcity.rest.dto.ProblemOccurrence;
import com.presidentio.teamcity.rest.dto.ProblemOccurrences;

@Path("/app/rest/problemOccurrences")
public interface AppRestProblemOccurrencesResource {

    @GET
    @Produces({"application/xml", "application/json" })
    ProblemOccurrences getProblems(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{problemLocator}")
    ProblemOccurrence serveInstance(@PathParam("problemLocator") String problemLocator, @QueryParam("fields") String fields);

}