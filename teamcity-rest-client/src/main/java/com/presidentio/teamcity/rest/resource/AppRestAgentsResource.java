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
import com.presidentio.teamcity.rest.dto.Agent;
import com.presidentio.teamcity.rest.dto.AgentPool;
import com.presidentio.teamcity.rest.dto.BuildTypes;
import com.presidentio.teamcity.rest.dto.Compatibilities;

@Path("/app/rest/agents")
public interface AppRestAgentsResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Response serveAgents(@QueryParam("includeDisconnected") Boolean includeDisconnected, @QueryParam("includeUnauthorized") Boolean includeUnauthorized, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentLocator}")
    Agent serveAgent(@PathParam("agentLocator") String agentLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{agentLocator}")
    void deleteAgent(@PathParam("agentLocator") String agentLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{agentLocator}/pool")
    AgentPool setAgentPool(@PathParam("agentLocator") String agentLocator, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentLocator}/pool")
    AgentPool getAgentPool(@PathParam("agentLocator") String agentLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{agentLocator}/{field}")
    Response serveAgentField(@PathParam("agentLocator") String agentLocator, @PathParam("field") String field);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{agentLocator}/{field}")
    Response setAgentField(@PathParam("agentLocator") String agentLocator, @PathParam("field") String field);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentLocator}/compatibleBuildTypes")
    BuildTypes getCompatibleBuildTypes(@PathParam("agentLocator") String agentLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentLocator}/incompatibleBuildTypes")
    Compatibilities geIncompatibleBuildTypes(@PathParam("agentLocator") String agentLocator, @QueryParam("fields") String fields);

}