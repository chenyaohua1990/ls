package com.skms;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
@Path("userApi")
@Produces(MediaType.APPLICATION_JSON)
public interface UserApi {
    @GET
    @Path("login")
    public String login(@QueryParam("")HashMap<String, String> map);

}
