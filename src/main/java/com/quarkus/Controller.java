package com.quarkus;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class Controller {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        return "Hello world!";
    }

    @GET
    @Path("/hello2")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld2() {
        return "Hello world2!";
    }

    @POST
    @Path("/test/{testId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Object temp(@PathParam("testId") byte testId) {
        if (testId == 1) {
            return new Data(1, "Shiva");
        } else {
            return new Data(2, "Sai");
        }
    }
}