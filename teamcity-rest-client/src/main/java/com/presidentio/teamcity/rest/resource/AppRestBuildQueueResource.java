/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.presidentio.teamcity.rest.resource;

import com.presidentio.teamcity.rest.dto.Build;
import com.presidentio.teamcity.rest.dto.BuildCancelRequest;
import com.presidentio.teamcity.rest.dto.Builds;
import com.presidentio.teamcity.rest.dto.Tags;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.xml.transform.Source;

@Path("/app/rest/buildQueue")
public interface AppRestBuildQueueResource {

    @DELETE
    void deleteBuildsExperimental(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    Builds replaceBuilds(@QueryParam("fields") String fields, Source source);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    Build queueNewBuild(Build source);

    @GET
    @Produces({"application/xml", "application/json" })
    Builds getBuilds(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{queuedBuildLocator}/compatibleAgents")
    Response serveCompatibleAgents(@PathParam("queuedBuildLocator") String queuedBuildLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/tags/")
    Tags serveTags(@PathParam("buildLocator") String buildLocator, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/tags/")
    Tags replaceTags(@PathParam("buildLocator") String buildLocator, @QueryParam("locator") String locator, @QueryParam("fields") String fields, Source source);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Path("/{buildLocator}/tags/")
    void addTags(@PathParam("buildLocator") String buildLocator, Source source);

    @POST
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{buildLocator}/tags/")
    Response addTag(@PathParam("buildLocator") String buildLocator);

    @GET
    @Produces("text/plain")
    @Path("/{buildLocator}/{field}")
    Response serveBuildFieldByBuildOnly(@PathParam("field") String field, @PathParam("buildLocator") String buildLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{queuedBuildLocator}")
    Build getBuild(@PathParam("queuedBuildLocator") String queuedBuildLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{queuedBuildLocator}")
    Build cancelBuild(@PathParam("queuedBuildLocator") String queuedBuildLocator, BuildCancelRequest source);

    @DELETE
    @Path("/{queuedBuildLocator}")
    void deleteBuild(@PathParam("queuedBuildLocator") String queuedBuildLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/example/buildCancelRequest")
    BuildCancelRequest cancelBuild(@PathParam("buildLocator") String buildLocator);

}