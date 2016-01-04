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
import com.presidentio.teamcity.rest.dto.PluginInfo;

@Path("/app/rest")
public interface AppRestResource {

    @GET
    @Produces("text/plain")
    Response serveRoot();

    @GET
    @Produces("text/plain")
    @Path("/version")
    Response serveVersion();

    @GET
    @Produces("text/plain")
    @Path("/apiVersion")
    Response serveApiVersion();

    @GET
    @Produces("application/xml")
    @Path("/info")
    PluginInfo servePluginInfo(@QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{projectLocator}/{btLocator}/{buildLocator}/{field}")
    Response serveBuildFieldShort(@PathParam("field") String field, @PathParam("buildLocator") String buildLocator, @PathParam("projectLocator") String projectLocator, @PathParam("btLocator") String btLocator);

}