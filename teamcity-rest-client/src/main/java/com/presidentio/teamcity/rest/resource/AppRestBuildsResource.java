/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.presidentio.teamcity.rest.resource;

import com.presidentio.teamcity.rest.dto.*;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.xml.transform.Source;

@Path("/app/rest/builds")
public interface AppRestBuildsResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Builds serveAllBuilds(@QueryParam("buildType") String buildType, @QueryParam("status") String status, @QueryParam("triggeredByUser") String triggeredByUser, @QueryParam("includePersonal") Boolean includePersonal, 
                @QueryParam("includeCanceled") Boolean includeCanceled, @QueryParam("onlyPinned") Boolean onlyPinned, @QueryParam("tag") String tag, @QueryParam("agentName") String agentName, 
                @QueryParam("sinceBuild") String sinceBuild, @QueryParam("sinceDate") String sinceDate, @QueryParam("start") Long start, @QueryParam("count") Integer count, 
                @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @DELETE
    void deleteBuilds(@QueryParam("locator") String locator);

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
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/tags/")
    Tags addTags(@PathParam("buildLocator") String buildLocator, @QueryParam("fields") String fields, Source source);

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
    @Path("/{buildLocator}")
    Build serveBuild(@PathParam("buildLocator") String buildLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces("*/*")
    @Path("/{buildLocator}")
    Build cancelBuild(@PathParam("buildLocator") String buildLocator, @QueryParam("fields") String fields, BuildCancelRequest buildCancelRequest);

    @DELETE
    @Path("/{buildLocator}")
    void deleteBuild(@PathParam("buildLocator") String buildLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/resulting-properties/")
    Properties serveBuildActualParameters(@PathParam("buildLocator") String buildLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("application/octet-stream")
    @Path("/{buildLocator}/sources/files/{fileName:.+}")
    Response serveSourceFile(@PathParam("fileName") String fileName, @PathParam("buildLocator") String buildLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/related-issues")
    IssueUsages serveBuildRelatedIssuesOld(@PathParam("buildLocator") String buildLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/relatedIssues")
    IssueUsages serveBuildRelatedIssues(@PathParam("buildLocator") String buildLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/statistics/")
    Properties serveBuildStatisticValues(@PathParam("buildLocator") String buildLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{buildLocator}/statistics/{name}")
    Response serveBuildStatisticValue(@PathParam("buildLocator") String buildLocator, @PathParam("name") String name);

    @GET
    @Produces("text/plain")
    @Path("/{buildLocator}/pin/")
    Response getPinned(@PathParam("buildLocator") String buildLocator);

    @DELETE
    @Consumes("text/plain")
    @Path("/{buildLocator}/pin/")
    void unpinBuild(@PathParam("buildLocator") String buildLocator);

    @PUT
    @Consumes("text/plain")
    @Path("/{buildLocator}/pin/")
    void pinBuild(@PathParam("buildLocator") String buildLocator);

    @PUT
    @Consumes("text/plain")
    @Path("/{buildLocator}/comment")
    void replaceComment(@PathParam("buildLocator") String buildLocator);

    @DELETE
    @Path("/{buildLocator}/comment")
    void deleteComment(@PathParam("buildLocator") String buildLocator);

    @GET
    @Produces("*/*")
    @Path("/{buildLocator}/statusIcon")
    Response serveBuildStatusIcon(@PathParam("buildLocator") String buildLocator);

    @GET
    @Produces("text/plain")
    @Path("/{buildLocator}/artifactsDirectory")
    Response getArtifactsDirectory(@PathParam("buildLocator") String buildLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/example/buildCancelRequest")
    BuildCancelRequest cancelBuild(@PathParam("buildLocator") String buildLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/canceledInfo")
    Comment getCanceledInfo(@PathParam("buildLocator") String buildLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/testOccurrences")
    TestOccurrences getTests(@PathParam("buildLocator") String buildLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/problemOccurrences")
    ProblemOccurrences getProblems(@PathParam("buildLocator") String buildLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{buildLocator}/resulting-properties/{propertyName}")
    Response getParameter(@PathParam("propertyName") String propertyName, @PathParam("buildLocator") String buildLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/artifacts")
    Files getRoot(@PathParam("buildLocator") String buildLocator, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/artifacts/{path:(.*)?}")
    Files getChildrenAlias(@PathParam("path") String path, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces("*/*")
    @Path("/{buildLocator}/artifacts/files{path:(/.*)?}")
    Response getContentAlias(@PathParam("path") String path);

    @GET
    @Produces("*/*")
    @Path("/{buildLocator}/artifacts/archived{path:(/.*)?}")
    Response getZipped(@PathParam("path") String path, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("name") String name);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/artifacts/metadata{path:(/.*)?}")
    File getMetadata(@PathParam("path") String path, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/artifacts/children{path:(/.*)?}")
    Files getChildren(@PathParam("path") String path, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces("*/*")
    @Path("/{buildLocator}/artifacts/content{path:(/.*)?}")
    Response getContent(@PathParam("path") String path);

}