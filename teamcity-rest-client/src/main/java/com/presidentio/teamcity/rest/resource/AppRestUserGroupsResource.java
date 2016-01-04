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
import com.presidentio.teamcity.rest.dto.Group;
import com.presidentio.teamcity.rest.dto.Groups;
import com.presidentio.teamcity.rest.dto.Properties;
import com.presidentio.teamcity.rest.dto.RoleAssignment;
import com.presidentio.teamcity.rest.dto.RoleAssignments;

@Path("/app/rest/userGroups")
public interface AppRestUserGroupsResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Groups serveGroups(@QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    Group addGroup(@QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{groupLocator}")
    Group serveGroup(@PathParam("groupLocator") String groupLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{groupLocator}")
    void deleteGroup(@PathParam("groupLocator") String groupLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{groupLocator}/roles")
    RoleAssignments listRoles(@PathParam("groupLocator") String groupLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{groupLocator}/roles")
    RoleAssignments addRolePut(@PathParam("groupLocator") String groupLocator, Source source);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{groupLocator}/roles")
    RoleAssignment addRole(@PathParam("groupLocator") String groupLocator, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{groupLocator}/roles/{roleId}/{scope}")
    RoleAssignment listRole(@PathParam("roleId") String roleId, @PathParam("scope") String scope, @PathParam("groupLocator") String groupLocator);

    @POST
    @Produces({"application/xml", "application/json" })
    @Path("/{groupLocator}/roles/{roleId}/{scope}")
    RoleAssignment addRoleSimple(@PathParam("roleId") String roleId, @PathParam("scope") String scope, @PathParam("groupLocator") String groupLocator);

    @DELETE
    @Path("/{groupLocator}/roles/{roleId}/{scope}")
    void deleteRole(@PathParam("roleId") String roleId, @PathParam("scope") String scope, @PathParam("groupLocator") String groupLocator);

    @GET
    @Produces("text/plain")
    @Path("/{groupLocator}/properties/{name}")
    Response serveUserProperties(@PathParam("name") String name, @PathParam("groupLocator") String groupLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{groupLocator}/properties/{name}")
    Response putUserProperty(@PathParam("name") String name, @PathParam("groupLocator") String groupLocator);

    @DELETE
    @Path("/{groupLocator}/properties/{name}")
    void removeUserProperty(@PathParam("name") String name, @PathParam("groupLocator") String groupLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{groupLocator}/properties")
    Properties getProperties(@PathParam("groupLocator") String groupLocator, @QueryParam("fields") String fields);

}