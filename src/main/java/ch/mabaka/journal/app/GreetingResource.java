package ch.mabaka.journal.app;

import javax.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/hello")
public class GreetingResource {

	@Inject
	private GreetingService greetingService;
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String greeting(@PathParam String name) {
        return greetingService.greeting(name);
    }
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }
}