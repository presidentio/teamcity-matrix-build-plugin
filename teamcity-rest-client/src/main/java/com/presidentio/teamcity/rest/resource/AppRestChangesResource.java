/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.presidentio.teamcity.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import com.presidentio.teamcity.rest.dto.BuildTypes;
import com.presidentio.teamcity.rest.dto.Builds;
import com.presidentio.teamcity.rest.dto.Change;
import com.presidentio.teamcity.rest.dto.Changes;
import com.presidentio.teamcity.rest.dto.Entries;
import com.presidentio.teamcity.rest.dto.Issues;
import com.presidentio.teamcity.rest.dto.Items;
import com.presidentio.teamcity.rest.dto.VcsRootInstance;

@Path("/app/rest/changes")
public interface AppRestChangesResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Changes serveChanges(@QueryParam("project") String project, @QueryParam("buildType") String buildType, @QueryParam("build") String build, @QueryParam("vcsRoot") String vcsRoot, 
                @QueryParam("sinceChange") String sinceChange, @QueryParam("start") Long start, @QueryParam("count") Integer count, @QueryParam("locator") String locator, 
                @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}")
    Change serveChange(@PathParam("changeLocator") String changeLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{changeLocator}/{field}")
    Response getChangeField(@PathParam("field") String field, @PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/parentChanges")
    Changes getParentChanges(@PathParam("changeLocator") String changeLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/parentRevisions")
    Items getChangeParentRevisions(@PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/vcsRootInstance")
    VcsRootInstance getChangeVCSRootInstance(@PathParam("changeLocator") String changeLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/vcsRoot")
    VcsRootInstance getChangeVCSRoot(@PathParam("changeLocator") String changeLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/attributes")
    Entries getChangeAttributes(@PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/duplicates")
    Changes getChangeDuplicates(@PathParam("changeLocator") String changeLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/issues")
    Issues getChangeIssue(@PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/buildTypes")
    BuildTypes getRelatedBuildTypes(@PathParam("changeLocator") String changeLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{changeLocator}/firstBuilds")
    Builds getChangeFirstBuilds(@PathParam("changeLocator") String changeLocator, @QueryParam("fields") String fields);

}