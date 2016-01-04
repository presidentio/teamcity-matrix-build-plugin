/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.presidentio.teamcity.rest.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.xml.transform.Source;
import com.presidentio.teamcity.rest.dto.Entries;
import com.presidentio.teamcity.rest.dto.File;
import com.presidentio.teamcity.rest.dto.Files;
import com.presidentio.teamcity.rest.dto.Properties;
import com.presidentio.teamcity.rest.dto.VcsRootInstance;
import com.presidentio.teamcity.rest.dto.VcsRootInstances;

@Path("/app/rest/vcs-root-instances")
public interface AppRestVcsRootInstancesResource {

    @GET
    @Produces({"application/xml", "application/json" })
    VcsRootInstances serveInstances(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootInstanceLocator}/properties")
    Properties serveRootInstanceProperties(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{vcsRootInstanceLocator}/{field}")
    Response serveInstanceField(@PathParam("field") String field, @PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{vcsRootInstanceLocator}/{field}")
    Response setInstanceField(@PathParam("field") String field, @PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

    @DELETE
    @Path("/{vcsRootInstanceLocator}/{field}")
    void deleteInstanceField(@PathParam("field") String field, @PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

    @DELETE
    @Path("/{vcsRootInstanceLocator}/repositoryState")
    void deleteRepositoryState(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootInstanceLocator}/repositoryState")
    Entries getRepositoryState(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootInstanceLocator}/repositoryState")
    Entries setRepositoryState(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, Source source);

    @GET
    @Produces("*/*")
    @Path("/{vcsRootInstanceLocator}/repositoryState/creationDate")
    Response getRepositoryStateCreationDate(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootInstanceLocator}")
    VcsRootInstance serveInstance(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootInstanceLocator}/files/latest")
    Files getRoot(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootInstanceLocator}/files/latest/{path:(.*)?}")
    Files getChildrenAlias(@PathParam("path") String path, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces("*/*")
    @Path("/{vcsRootInstanceLocator}/files/latest/files{path:(/.*)?}")
    Response getContentAlias(@PathParam("path") String path);

    @GET
    @Produces("*/*")
    @Path("/{vcsRootInstanceLocator}/files/latest/archived{path:(/.*)?}")
    Response getZipped(@PathParam("path") String path, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("name") String name);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootInstanceLocator}/files/latest/metadata{path:(/.*)?}")
    File getMetadata(@PathParam("path") String path, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{vcsRootInstanceLocator}/files/latest/children{path:(/.*)?}")
    Files getChildren(@PathParam("path") String path, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces("*/*")
    @Path("/{vcsRootInstanceLocator}/files/latest/content{path:(/.*)?}")
    Response getContent(@PathParam("path") String path);

}