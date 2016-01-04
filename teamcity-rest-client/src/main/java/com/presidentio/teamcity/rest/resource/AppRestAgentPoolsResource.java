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
import com.presidentio.teamcity.rest.dto.Agent;
import com.presidentio.teamcity.rest.dto.AgentPool;
import com.presidentio.teamcity.rest.dto.AgentPools;
import com.presidentio.teamcity.rest.dto.Project;
import com.presidentio.teamcity.rest.dto.Projects;

@Path("/app/rest/agentPools")
public interface AppRestAgentPoolsResource {

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    AgentPool setPools(Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    AgentPools getPools(@QueryParam("fields") String fields);

    @DELETE
    @Path("/{agentPoolLocator}/projects")
    void deleteProjects(@PathParam("agentPoolLocator") String agentPoolLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/projects")
    Projects replaceProjects(@PathParam("agentPoolLocator") String agentPoolLocator, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/projects")
    Projects getPoolProjects(@PathParam("agentPoolLocator") String agentPoolLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/projects")
    Project addProject(@PathParam("agentPoolLocator") String agentPoolLocator, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/projects/{projectLocator}")
    Project getPoolProject(@PathParam("projectLocator") String projectLocator, @PathParam("agentPoolLocator") String agentPoolLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{agentPoolLocator}/projects/{projectLocator}")
    void deletePoolProject(@PathParam("projectLocator") String projectLocator, @PathParam("agentPoolLocator") String agentPoolLocator);

    @DELETE
    @Path("/{agentPoolLocator}")
    void deletePool(@PathParam("agentPoolLocator") String agentPoolLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}")
    AgentPool getPool(@PathParam("agentPoolLocator") String agentPoolLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/agents")
    Agent addAgent(@PathParam("agentPoolLocator") String agentPoolLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/agents")
    Response getPoolAgents(@PathParam("agentPoolLocator") String agentPoolLocator, @QueryParam("fields") String fields);

}