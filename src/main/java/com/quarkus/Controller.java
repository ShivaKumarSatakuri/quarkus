package com.quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
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
}