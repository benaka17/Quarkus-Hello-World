package ch.zli.m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/add/{num1}/{num2}")
public class CalculatorResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int add(
            @PathParam("num1") int num1,
            @PathParam("num2") int num2) {
        return num1 + num2;
    }
    
}
