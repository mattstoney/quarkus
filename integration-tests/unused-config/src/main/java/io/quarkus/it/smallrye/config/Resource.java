package io.quarkus.it.smallrye.config;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/config")
@Produces(MediaType.APPLICATION_JSON)
public class Resource {

    @GET
    public Response test() {
        return Response.ok().build();
    }

}
