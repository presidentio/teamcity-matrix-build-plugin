/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.presidentio.teamcity.rest.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.xml.transform.Source;
import com.presidentio.teamcity.rest.dto.Properties;
import com.presidentio.teamcity.rest.dto.VcsRoot;
import com.presidentio.teamcity.rest.dto.VcsRootInstance;
import com.presidentio.teamcity.rest.dto.VcsRootInstances;
import com.presidentio.teamcity.rest.dto.VcsRoots;

@Path("/app/rest/vcs-roots")
public interface AppRestVcsRootsResource {

    @GET
    @Produces({"application/xml", "application/json" })
    VcsRoots serveRoots(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    VcsRoot addRoot(@QueryParam("fields") String fields, Source source);

    @GET
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/settingsFile")
    Response getSettingsFile(@PathParam("vcsRootLocator") String vcsRootLocator);

    @DELETE
    @Path("/{vcsRootLocator}")
    void deleteRoot(@PathParam("vcsRootLocator") String vcsRootLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootLocator}")
    VcsRoot serveRoot(@PathParam("vcsRootLocator") String vcsRootLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootLocator}/instances")
    VcsRootInstances serveRootInstances(@PathParam("vcsRootLocator") String vcsRootLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootLocator}/instances/{vcsRootInstanceLocator}")
    VcsRootInstance serveRootInstance(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @PathParam("vcsRootLocator") String vcsRootLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootLocator}/properties")
    Properties serveProperties(@PathParam("vcsRootLocator") String vcsRootLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{vcsRootLocator}/properties")
    void deleteAllProperties(@PathParam("vcsRootLocator") String vcsRootLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootLocator}/properties")
    Properties changeProperties(@PathParam("vcsRootLocator") String vcsRootLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/properties/{name}")
    Response serveProperty(@PathParam("name") String name, @PathParam("vcsRootLocator") String vcsRootLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/properties/{name}")
    Response putParameter(@PathParam("name") String name, @PathParam("vcsRootLocator") String vcsRootLocator);

    @DELETE
    @Path("/{vcsRootLocator}/properties/{name}")
    void deleteParameter(@PathParam("name") String name, @PathParam("vcsRootLocator") String vcsRootLocator);

    @GET
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/{field}")
    Response serveField(@PathParam("field") String field, @PathParam("vcsRootLocator") String vcsRootLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/{field}")
    Response setField(@PathParam("field") String field, @PathParam("vcsRootLocator") String vcsRootLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/properties")
    Properties serveRootInstanceProperties(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @PathParam("vcsRootLocator") String vcsRootLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/{field}")
    Response serveInstanceField(@PathParam("field") String field, @PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @PathParam("vcsRootLocator") String vcsRootLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/{field}")
    Response setInstanceField(@PathParam("field") String field, @PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @PathParam("vcsRootLocator") String vcsRootLocator);

}