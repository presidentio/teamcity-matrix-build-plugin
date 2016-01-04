/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.presidentio.teamcity.rest.resource;

import com.presidentio.teamcity.rest.dto.*;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.xml.transform.Source;

@Path("/app/rest/buildTypes")
public interface AppRestBuildTypesResource {

    @GET
    @Produces({"application/xml", "application/json" })
    BuildTypes getBuildTypes(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    BuildType addBuildType(@QueryParam("fields") String fields, Source source);

    @DELETE
    @Path("/{btLocator}/steps/{stepId}")
    void deleteStep(@PathParam("stepId") String stepId, @PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps/{stepId}")
    PropEntityStep replaceStep(@PathParam("stepId") String stepId, @PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps/{stepId}")
    PropEntityStep getStep(@PathParam("stepId") String stepId, @PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps/{stepId}/parameters")
    Properties getStepParameters(@PathParam("stepId") String stepId, @PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps/{stepId}/parameters")
    Properties replaceStepParameters(@PathParam("stepId") String stepId, @PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/steps/{stepId}/parameters/{parameterName}")
    Response getStepParameter(@PathParam("stepId") String stepId, @PathParam("btLocator") String btLocator, @PathParam("parameterName") String parameterName);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/steps/{stepId}/parameters/{parameterName}")
    Response addStepParameter(@PathParam("stepId") String stepId, @PathParam("btLocator") String btLocator, @PathParam("parameterName") String parameterName);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/steps/{stepId}/{fieldName}")
    Response getStepSetting(@PathParam("fieldName") String fieldName, @PathParam("stepId") String stepId, @PathParam("btLocator") String btLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/steps/{stepId}/{fieldName}")
    Response changeStepSetting(@PathParam("fieldName") String fieldName, @PathParam("stepId") String stepId, @PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features")
    PropEntitiesFeature replaceFeatures(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features")
    PropEntitiesFeature getFeatures(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes("*/*")
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features")
    PropEntityFeature addFeature(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, PropEntityFeature propentityfeature);

    @DELETE
    @Path("/{btLocator}/features/{featureId}")
    void deleteFeature(@PathParam("btLocator") String btLocator, @PathParam("featureId") String featureId);

    @PUT
    @Consumes("*/*")
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features/{featureId}")
    PropEntityFeature replaceFeature(@PathParam("btLocator") String btLocator, @PathParam("featureId") String featureId, @QueryParam("fields") String fields, PropEntityFeature propentityfeature);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features/{featureId}")
    PropEntityFeature getFeature(@PathParam("btLocator") String btLocator, @PathParam("featureId") String featureId, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features/{featureId}/parameters")
    Properties getFeatureParameters(@PathParam("btLocator") String btLocator, @PathParam("featureId") String featureId, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features/{featureId}/parameters")
    Properties replaceFeatureParameters(@PathParam("btLocator") String btLocator, @PathParam("featureId") String featureId, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/features/{featureId}/parameters/{parameterName}")
    Response getFeatureParameter(@PathParam("btLocator") String btLocator, @PathParam("parameterName") String parameterName, @PathParam("featureId") String featureId);

    @PUT
    @Consumes("*/*")
    @Produces("text/plain")
    @Path("/{btLocator}/features/{featureId}/parameters/{parameterName}")
    Response addFeatureParameter(@PathParam("btLocator") String btLocator, @PathParam("parameterName") String parameterName, @PathParam("featureId") String featureId);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/features/{featureId}/{name}")
    Response getFeatureSetting(@PathParam("name") String name, @PathParam("btLocator") String btLocator, @PathParam("featureId") String featureId);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/features/{featureId}/{name}")
    Response changeFeatureSetting(@PathParam("name") String name, @PathParam("btLocator") String btLocator, @PathParam("featureId") String featureId);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/artifact-dependencies")
    PropEntitiesArtifactDep getArtifactDeps(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/artifact-dependencies")
    PropEntitiesArtifactDep replaceArtifactDeps(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @POST
    @Consumes("*/*")
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/artifact-dependencies")
    PropEntityArtifactDep addArtifactDep(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, PropEntityArtifactDep propentityartifactdep);

    @DELETE
    @Path("/{btLocator}/artifact-dependencies/{artifactDepLocator}")
    void deleteArtifactDep(@PathParam("btLocator") String btLocator, @PathParam("artifactDepLocator") String artifactDepLocator);

    @PUT
    @Consumes("*/*")
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/artifact-dependencies/{artifactDepLocator}")
    PropEntityArtifactDep replaceArtifactDep(@PathParam("btLocator") String btLocator, @PathParam("artifactDepLocator") String artifactDepLocator, @QueryParam("fields") String fields, PropEntityArtifactDep propentityartifactdep);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/artifact-dependencies/{artifactDepLocator}")
    PropEntityArtifactDep getArtifactDep(@PathParam("btLocator") String btLocator, @PathParam("artifactDepLocator") String artifactDepLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/snapshot-dependencies")
    PropEntitiesSnapshotDep getSnapshotDeps(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/snapshot-dependencies")
    PropEntitiesSnapshotDep replaceSnapshotDeps(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/snapshot-dependencies")
    PropEntitySnapshotDep addSnapshotDep(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @DELETE
    @Path("/{btLocator}/snapshot-dependencies/{snapshotDepLocator}")
    void deleteSnapshotDep(@PathParam("btLocator") String btLocator, @PathParam("snapshotDepLocator") String snapshotDepLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/snapshot-dependencies/{snapshotDepLocator}")
    PropEntitySnapshotDep replaceSnapshotDep(@PathParam("btLocator") String btLocator, @PathParam("snapshotDepLocator") String snapshotDepLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/snapshot-dependencies/{snapshotDepLocator}")
    PropEntitySnapshotDep getSnapshotDep(@PathParam("btLocator") String btLocator, @PathParam("snapshotDepLocator") String snapshotDepLocator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/triggers")
    PropEntitiesTrigger replaceTriggers(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/triggers")
    PropEntityTrigger addTrigger(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/triggers")
    PropEntitiesTrigger getTriggers(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{btLocator}/triggers/{triggerLocator}")
    void deleteTrigger(@PathParam("triggerLocator") String triggerLocator, @PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/triggers/{triggerLocator}")
    PropEntityTrigger replaceTrigger(@PathParam("triggerLocator") String triggerLocator, @PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/triggers/{triggerLocator}")
    PropEntityTrigger getTrigger(@PathParam("triggerLocator") String triggerLocator, @PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/triggers/{triggerLocator}/{fieldName}")
    Response getTriggerSetting(@PathParam("triggerLocator") String triggerLocator, @PathParam("fieldName") String fieldName, @PathParam("btLocator") String btLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/triggers/{triggerLocator}/{fieldName}")
    Response changeTriggerSetting(@PathParam("triggerLocator") String triggerLocator, @PathParam("fieldName") String fieldName, @PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/agent-requirements")
    PropEntitiesAgentRequirement replaceAgentRequirements(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/agent-requirements")
    PropEntityAgentRequirement addAgentRequirement(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/agent-requirements")
    PropEntitiesAgentRequirement getAgentRequirements(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{btLocator}/agent-requirements/{agentRequirementLocator}")
    void deleteAgentRequirement(@PathParam("agentRequirementLocator") String agentRequirementLocator, @PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/agent-requirements/{agentRequirementLocator}")
    PropEntityAgentRequirement replaceAgentRequirement(@PathParam("agentRequirementLocator") String agentRequirementLocator, @PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/agent-requirements/{agentRequirementLocator}")
    PropEntityAgentRequirement getAgentRequirement(@PathParam("agentRequirementLocator") String agentRequirementLocator, @PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-instances")
    VcsRootInstances getCurrentVcsInstances(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/builds")
    Builds serveBuilds(@PathParam("btLocator") String btLocator, @QueryParam("status") String status, @QueryParam("triggeredByUser") String triggeredByUser, @QueryParam("includePersonal") Boolean includePersonal, 
                @QueryParam("includeCanceled") Boolean includeCanceled, @QueryParam("onlyPinned") Boolean onlyPinned, @QueryParam("tag") String tag, @QueryParam("agentName") String agentName, 
                @QueryParam("sinceBuild") String sinceBuild, @QueryParam("sinceDate") String sinceDate, @QueryParam("start") Long start, @QueryParam("count") Integer count, 
                @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/builds/{buildLocator}")
    Build serveBuildWithProject(@PathParam("buildLocator") String buildLocator, @PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/builds/{buildLocator}/{field}")
    Response serveBuildField(@PathParam("field") String field, @PathParam("buildLocator") String buildLocator, @PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/branches")
    Branches serveBranches(@PathParam("btLocator") String btLocator, @QueryParam("locator") String locator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcsLabeling")
    VcsLabelingOptions getVCSLabelingOptions(@PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcsLabeling")
    VcsLabelingOptions setVCSLabelingOptions(@PathParam("btLocator") String btLocator, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/newBuildTypeDescription")
    NewBuildTypeDescription getExampleNewProjectDescriptionCompatibilityVersion1(@PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/example/newBuildTypeDescription")
    NewBuildTypeDescription getExampleNewProjectDescription(@PathParam("btLocator") String btLocator);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/settingsFile")
    Response getSettingsFile(@PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}")
    BuildType serveBuildTypeXML(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{btLocator}")
    void deleteBuildType(@PathParam("btLocator") String btLocator);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/{field}")
    Response serveBuildTypeField(@PathParam("field") String field, @PathParam("btLocator") String btLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/{field}")
    Response setBuildTypeField(@PathParam("field") String field, @PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/buildTags")
    Tags serveBuildTypeBuildsTags(@PathParam("field") String field, @PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/settings")
    Properties serveBuildTypeSettings(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/settings")
    Properties replaceBuildTypeSettings(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/settings/{name}")
    Response serveBuildTypeSetting(@PathParam("name") String name, @PathParam("btLocator") String btLocator);

    @PUT
    @Consumes("*/*")
    @Produces("text/plain")
    @Path("/{btLocator}/settings/{name}")
    Response putBuildTypeSetting(@PathParam("name") String name, @PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/template")
    BuildType serveBuildTypeTemplate(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @PUT
    @Consumes("text/plain")
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/template")
    BuildType getTemplateAssociation(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{btLocator}/template")
    void deleteTemplateAssociation(@PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-entries")
    Response replaceVcsRootEntries(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-entries")
    Response addVcsRootEntry(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-entries")
    VcsRootEntries getVcsRootEntries(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-entries/{id}")
    Response updateVcsRootEntry(@PathParam("btLocator") String btLocator, @PathParam("id") String id, @QueryParam("fields") String fields, Source source);

    @DELETE
    @Path("/{btLocator}/vcs-root-entries/{id}")
    void deleteVcsRootEntry(@PathParam("btLocator") String btLocator, @PathParam("id") String id);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-entries/{id}")
    Response getVcsRootEntry(@PathParam("btLocator") String btLocator, @PathParam("id") String id, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/vcs-root-entries/{id}/checkout-rules")
    Response getVcsRootEntryCheckoutRules(@PathParam("btLocator") String btLocator, @PathParam("id") String id);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/vcs-root-entries/{id}/checkout-rules")
    Response updateVcsRootEntryCheckoutRules(@PathParam("btLocator") String btLocator, @PathParam("id") String id);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps")
    PropEntitiesStep replaceSteps(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps")
    PropEntitiesStep getSteps(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps")
    PropEntityStep addStep(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/investigations")
    Investigations getInvestigations(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/aliases")
    Items getAliases(@PathParam("field") String field, @PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs/files/latest")
    Files getRoot(@PathParam("btLocator") String btLocator, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs/files/latest/{path:(.*)?}")
    Files getChildrenAlias(@PathParam("path") String path, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces("*/*")
    @Path("/{btLocator}/vcs/files/latest/files{path:(/.*)?}")
    Response getContentAlias(@PathParam("path") String path);

    @GET
    @Produces("*/*")
    @Path("/{btLocator}/vcs/files/latest/archived{path:(/.*)?}")
    Response getZipped(@PathParam("path") String path, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("name") String name);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs/files/latest/metadata{path:(/.*)?}")
    File getMetadata(@PathParam("path") String path, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs/files/latest/children{path:(/.*)?}")
    Files getChildren(@PathParam("path") String path, @QueryParam("basePath") String basePath, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces("*/*")
    @Path("/{btLocator}/vcs/files/latest/content{path:(/.*)?}")
    Response getContent(@PathParam("path") String path);

    @DELETE
    @Path("/{btLocator}/parameters")
    void deleteAllParameters(@PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/parameters")
    Properties setParameters(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/parameters")
    Property setParameter(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/parameters")
    Properties getParameters(@PathParam("btLocator") String btLocator, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{btLocator}/parameters/{name}")
    void deleteParameter(@PathParam("name") String name);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/parameters/{name}")
    Response getParameterValue(@PathParam("name") String name);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/parameters/{name}")
    Response setParameterValue(@PathParam("name") String name);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/parameters/{name}")
    Property getParameter(@PathParam("name") String name, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/parameters/{name}/type/rawValue")
    Response getParameterTypeRawValue(@PathParam("name") String name);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/parameters/{name}/type/rawValue")
    Response setParameterTypeRawValue(@PathParam("name") String name);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/parameters/{name}/value")
    Response getParameterValueLong(@PathParam("name") String name);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/parameters/{name}/value")
    Response setParameterValueLong(@PathParam("name") String name);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/parameters/{name}/type")
    ParameterType getParameterType(@PathParam("name") String name);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/parameters/{name}/type")
    ParameterType setParameterType(@PathParam("name") String name, Source source);

}