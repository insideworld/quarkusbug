package insideworld.quarkus.bug;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/test")
@Singleton
public class Rest {

    @Inject
    public Rest() {
        System.out.println("qwe");
    }

    @POST
    @Path("/call")
    @Consumes("application/json")
    @Produces("application/json")
    public Integer call() {
        return 1;
    }

}
