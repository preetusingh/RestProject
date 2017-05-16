package edu.npu.restproject.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
import edu.npu.restproject.domain.User;
 
@Path("/u")
public class UserService {
 
 @GET
 @Path("/get")
 @Produces(MediaType.APPLICATION_JSON)
 public User getjson() {
 User u = new User();
 u.setId(1);
 u.setName("Preetu");
 
 return u;
 }
 
}	
