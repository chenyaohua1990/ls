package com.skms;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Map;
@Path("userApi")
@Produces(MediaType.APPLICATION_JSON)
public interface UserApi {
    @GET
    @Path("login")
    public String login(@QueryParam("")Map<String,String> map);

}
