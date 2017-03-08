package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by User on 2017-03-08.
 */
@Path("/")
public class MyFirstRestExample {
    @GET
    @Path("/sayHi")
    public String sayHi(){
        return "Hello.";
    }

    @GET
    @Path("/sayHi/{name}")
    public String sayHi(@PathParam("name") String name){
        return "Hello " + name;
    }
}
