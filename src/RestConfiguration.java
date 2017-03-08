import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by User on 2017-03-08.
 */
@ApplicationPath("/rest")
public class RestConfiguration extends ResourceConfig {
    public RestConfiguration(){
        packages("rest");
    }
}
