package ${PACKAGE_NAME};

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import utils.EMF_Creator;

@Path("${Path}")
public class ${NAME}Resource {

  private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();

  private static final ${FACADE} FACADE = ${FACADE}.getBankFacade(EMF);
  private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

  /* No path */
  @GET
  @Produces({MediaType.APPLICATION_JSON})
  public String demo() {
    return "{\"msg\":\"Nothing here\"}";
  }

  /* With path */
  @Path("withpath")
  @GET
  @Produces({MediaType.APPLICATION_JSON})
  public String getCustomerCount() {
    String path = "~";
    return "{\"path\":" + path + "}";
  }

  /* With param */
  @Path("{param}")
  @GET
  @Produces({MediaType.APPLICATION_JSON})
  public String getCustomerById(@PathParam("param") String param) {
    return GSON.toJson(param);
  }
}