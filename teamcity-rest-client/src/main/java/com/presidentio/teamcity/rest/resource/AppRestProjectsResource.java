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
import com.presidentio.teamcity.rest.dto.AgentPool;
import com.presidentio.teamcity.rest.dto.AgentPools;
import com.presidentio.teamcity.rest.dto.Build;
import com.presidentio.teamcity.rest.dto.BuildType;
import com.presidentio.teamcity.rest.dto.BuildTypes;
import com.presidentio.teamcity.rest.dto.Builds;
import com.presidentio.teamcity.rest.dto.NewProjectDescription;
import com.presidentio.teamcity.rest.dto.ParameterType;
import com.presidentio.teamcity.rest.dto.Project;
import com.presidentio.teamcity.rest.dto.Projects;
import com.presidentio.teamcity.rest.dto.Properties;
import com.presidentio.teamcity.rest.dto.Property;

@Path("/app/rest/projects")
public interface AppRestProjectsResource {

    @POST
    @Consumes("text/plain")
    @Produces({"application/xml", "application/json" })
    Project createEmptyProject();

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    Project createProject(Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    Projects serveProjects(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/buildTypes/{btLocator}/builds")
    Builds serveBuilds(@PathParam("projectLocator") String projectLocator, @PathParam("btLocator") String btLocator, @QueryParam("status") String status, @QueryParam("triggeredByUser") String triggeredByUser, 
                @QueryParam("includePersonal") Boolean includePersonal, @QueryParam("includeCanceled") Boolean includeCanceled, @QueryParam("onlyPinned") Boolean onlyPinned, @QueryParam("tag") String tag, 
                @QueryParam("agentName") String agentName, @QueryParam("sinceBuild") String sinceBuild, @QueryParam("sinceDate") String sinceDate, @QueryParam("start") Long start, 
                @QueryParam("count") Integer count, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}")
    Build serveBuildWithProject(@PathParam("buildLocator") String buildLocator, @PathParam("projectLocator") String projectLocator, @PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/newProjectDescription")
    NewProjectDescription getExampleNewProjectDescriptionCompatibilityVersion1(@PathParam("projectLocator") String projectLocator, @QueryParam("id") String id);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/example/newProjectDescription")
    NewProjectDescription getExampleNewProjectDescription(@PathParam("projectLocator") String projectLocator, @QueryParam("id") String id);

    @GET
    @Produces("text/plain")
    @Path("/{projectLocator}/settingsFile")
    Response getSettingsFile(@PathParam("projectLocator") String projectLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/agentPools")
    AgentPools setProjectAgentPools(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields, Source source);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/agentPools")
    AgentPool setProjectAgentPools(@PathParam("projectLocator") String projectLocator, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/agentPools")
    AgentPools getProjectAgentPools(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("*/*")
    @Path("/{projectLocator}/latest")
    Project reloadSettingsFile(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}")
    Project serveProject(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{projectLocator}")
    void deleteProject(@PathParam("projectLocator") String projectLocator);

    @GET
    @Produces("text/plain")
    @Path("/{projectLocator}/{field}")
    Response serveProjectField(@PathParam("field") String field, @PathParam("projectLocator") String projectLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{projectLocator}/{field}")
    Response setProjectFiled(@PathParam("field") String field, @PathParam("projectLocator") String projectLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/buildTypes")
    BuildTypes serveBuildTypesInProject(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes("text/plain")
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/buildTypes")
    BuildType createEmptyBuildType(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/buildTypes")
    BuildType createBuildType(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/buildTypes/{btLocator}")
    BuildType serveBuildType(@PathParam("projectLocator") String projectLocator, @PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/templates")
    BuildTypes serveTemplatesInProject(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes("text/plain")
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/templates")
    BuildType createEmptyBuildTypeTemplate(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/templates")
    BuildType createBuildTypeTemplate(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/templates/{btLocator}")
    BuildType serveBuildTypeTemplates(@PathParam("projectLocator") String projectLocator, @PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{projectLocator}/buildTypes/{btLocator}/{field}")
    Response serveBuildTypeFieldWithProject(@PathParam("field") String field, @PathParam("projectLocator") String projectLocator, @PathParam("btLocator") String btLocator);

    @GET
    @Produces("text/plain")
    @Path("/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}/{field}")
    Response serveBuildFieldWithProject(@PathParam("field") String field, @PathParam("buildLocator") String buildLocator, @PathParam("projectLocator") String projectLocator, @PathParam("btLocator") String btLocator);

    @DELETE
    @Path("/{projectLocator}/agentPools/{agentPoolLocator}")
    void deleteProjectAgentPools(@PathParam("projectLocator") String projectLocator, @PathParam("agentPoolLocator") String agentPoolLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/parentProject")
    Project getParentProject(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/parentProject")
    Project setParentProject(@PathParam("projectLocator") String projectLocator, Source source);

    @DELETE
    @Path("/{projectLocator}/parameters")
    void deleteAllParameters(@PathParam("projectLocator") String projectLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/parameters")
    Properties setParameters(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields, Source source);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/parameters")
    Property setParameter(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/parameters")
    Properties getParameters(@PathParam("projectLocator") String projectLocator, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{projectLocator}/parameters/{name}")
    void deleteParameter(@PathParam("name") String name);

    @GET
    @Produces("text/plain")
    @Path("/{projectLocator}/parameters/{name}")
    Response getParameterValue(@PathParam("name") String name);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{projectLocator}/parameters/{name}")
    Response setParameterValue(@PathParam("name") String name);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/parameters/{name}")
    Property getParameter(@PathParam("name") String name, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{projectLocator}/parameters/{name}/type/rawValue")
    Response getParameterTypeRawValue(@PathParam("name") String name);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{projectLocator}/parameters/{name}/type/rawValue")
    Response setParameterTypeRawValue(@PathParam("name") String name);

    @GET
    @Produces("text/plain")
    @Path("/{projectLocator}/parameters/{name}/value")
    Response getParameterValueLong(@PathParam("name") String name);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{projectLocator}/parameters/{name}/value")
    Response setParameterValueLong(@PathParam("name") String name);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/parameters/{name}/type")
    ParameterType getParameterType(@PathParam("name") String name);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/parameters/{name}/type")
    ParameterType setParameterType(@PathParam("name") String name, Source source);

}