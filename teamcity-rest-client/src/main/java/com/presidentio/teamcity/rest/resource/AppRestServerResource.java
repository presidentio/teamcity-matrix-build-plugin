/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.presidentio.teamcity.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import com.presidentio.teamcity.rest.dto.File;
import com.presidentio.teamcity.rest.dto.Files;
import com.presidentio.teamcity.rest.dto.PluginInfos;
import com.presidentio.teamcity.rest.dto.Server;

@Path("/app/rest/server")
public interface AppRestServerResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Server serveServerInfo();

    @GET
    @Produces("text/plain")
    @Path("/backup")
    Response getBackupStatus();

    @POST
    @Produces("text/plain")
    @Path("/backup")
    Response startBackup(@QueryParam("fileName") String fileName, @QueryParam("addTimestamp") Boolean addTimestamp, @QueryParam("includeConfigs") Boolean includeConfigs, @QueryParam("includeDatabase") Boolean includeDatabase, 
                @QueryParam("includeBuildLogs") Boolean includeBuildLogs, @QueryParam("includePersonalChanges") Boolean includePersonalChanges, @QueryParam("includeRunningBuilds") Boolean includeRunningBuilds, @QueryParam("includeSupplimentaryData") Boolean includeSupplimentaryData);

    @GET
    @Produces("text/plain")
    @Path("/{field}")
    Response serveServerVersion(@PathParam("field") String field);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/plugins")
    PluginInfos servePlugins(@QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/files/{areaId}")
    Files getRoot(@PathParam("areaId") String areaId, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/files/{areaId}/{path:(.*)?}")
    Files getChildrenAlias(@PathParam("path") String path, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces("*/*")
    @Path("/files/{areaId}/files{path:(/.*)?}")
    Response getContentAlias(@PathParam("path") String path);

    @GET
    @Produces("*/*")
    @Path("/files/{areaId}/archived{path:(/.*)?}")
    Response getZipped(@PathParam("path") String path, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("name") String name);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/files/{areaId}/metadata{path:(/.*)?}")
    File getMetadata(@PathParam("path") String path, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/files/{areaId}/children{path:(/.*)?}")
    Files getChildren(@PathParam("path") String path, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces("*/*")
    @Path("/files/{areaId}/content{path:(/.*)?}")
    Response getContent(@PathParam("path") String path);

}