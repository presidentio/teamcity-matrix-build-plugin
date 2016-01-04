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
import com.presidentio.teamcity.rest.dto.User;
import com.presidentio.teamcity.rest.dto.Users;

@Path("/app/rest/users")
public interface AppRestUsersResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Users serveUsers(@QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces("*/*")
    User createUser(@QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{userLocator}")
    User serveUser(@PathParam("userLocator") String userLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{userLocator}")
    void deleteUser(@PathParam("userLocator") String userLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{userLocator}")
    User updateUser(@PathParam("userLocator") String userLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces("text/plain")
    @Path("/{userLocator}/{field}")
    Response serveUserField(@PathParam("field") String field, @PathParam("userLocator") String userLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{userLocator}/{field}")
    Response setUserField(@PathParam("field") String field, @PathParam("userLocator") String userLocator);

    @GET
    @Produces("text/plain")
    @Path("/{userLocator}/properties/{name}")
    Response serveUserProperty(@PathParam("userLocator") String userLocator, @PathParam("name") String name);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{userLocator}/properties/{name}")
    Response putUserProperty(@PathParam("userLocator") String userLocator, @PathParam("name") String name);

    @DELETE
    @Path("/{userLocator}/properties/{name}")
    void removeUserProperty(@PathParam("userLocator") String userLocator, @PathParam("name") String name);

    @POST
    @Path("/{userLocator}/roles/{roleId}/{scope}")
    void addRoleSimplePost(@PathParam("userLocator") String userLocator, @PathParam("roleId") String roleId, @PathParam("scope") String scope);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{userLocator}/roles/{roleId}/{scope}")
    RoleAssignment listRole(@PathParam("userLocator") String userLocator, @PathParam("roleId") String roleId, @PathParam("scope") String scope);

    @PUT
    @Produces({"application/xml", "application/json" })
    @Path("/{userLocator}/roles/{roleId}/{scope}")
    RoleAssignment addRoleSimple(@PathParam("userLocator") String userLocator, @PathParam("roleId") String roleId, @PathParam("scope") String scope);

    @DELETE
    @Path("/{userLocator}/roles/{roleId}/{scope}")
    void deleteRole(@PathParam("userLocator") String userLocator, @PathParam("roleId") String roleId, @PathParam("scope") String scope);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{userLocator}/groups")
    Groups replaceGroups(@PathParam("userLocator") String userLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{userLocator}/groups")
    Groups getGroups(@PathParam("userLocator") String userLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{userLocator}/groups")
    Group addGroup(@PathParam("userLocator") String userLocator, @QueryParam("fields") String fields, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{userLocator}/roles")
    RoleAssignments listRoles(@PathParam("userLocator") String userLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{userLocator}/roles")
    RoleAssignments replaceRoles(@PathParam("userLocator") String userLocator, Source source);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{userLocator}/roles")
    RoleAssignment addRole(@PathParam("userLocator") String userLocator, Source source);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{userLocator}/properties")
    Properties serveUserProperties(@PathParam("userLocator") String userLocator, @QueryParam("fields") String fields);

}