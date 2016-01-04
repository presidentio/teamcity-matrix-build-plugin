/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.presidentio.teamcity.rest.resource;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import com.presidentio.teamcity.rest.dto.VcsRootInstances;

@Path("/app/rest/debug")
public interface AppRestDebugResource {

    @GET
    @Produces("text/plain; charset=UTF-8")
    @Path("/database/tables")
    Response listDBTables();

    @GET
    @Produces("text/plain; charset=UTF-8")
    @Path("/database/query/{query}")
    Response executeDBQuery(@PathParam("query") String query, @QueryParam("fieldDelimiter") @DefaultValue(", ") String fieldDelimiter, @QueryParam("count") @DefaultValue("1000") Integer count);

    @POST
    @Produces({"application/xml", "application/json" })
    @Path("/vcsCheckingForChangesQueue")
    VcsRootInstances scheduleCheckingForChanges(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/requestDetails")
    Response getRequestDetails();

    @POST
    @Produces("text/plain")
    @Path("/emptyTask")
    Response emptyTask(@QueryParam("time") Integer time, @QueryParam("load") Integer load);

    @GET
    @Produces("text/plain")
    @Path("/currentUserPermissions")
    Response getCurrentUserPermissions();

    @POST
    @Produces("text/plain")
    @Path("/memory/dumps")
    Response saveMemoryDump(@QueryParam("archived") Boolean archived);

    @GET
    @Produces("text/plain")
    @Path("/threadDump")
    Response getThreadDump(@QueryParam("lockedMonitors") String lockedMonitors, @QueryParam("lockedSynchronizers") String lockedSynchronizers);

}