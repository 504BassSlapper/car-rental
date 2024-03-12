package org.mbo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.SecurityContext;

import java.security.Principal;
@Path("/whoami")
public class IdentificationResource {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String whoami(@Context SecurityContext securityContext){
        Principal principalUser = securityContext.getUserPrincipal();
        if (principalUser != null){
            return principalUser.getName();
        }
        return "anonymous";
    }
}
