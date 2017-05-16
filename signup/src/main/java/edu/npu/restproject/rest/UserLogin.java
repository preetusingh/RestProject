package edu.npu.restproject.rest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
import edu.npu.restproject.DAO.DBConnection;
 
@Path("/db")
public class UserLogin {
 
 DBConnection dbCoN;
 Connection conn;
 ResultSet rslt;
 String Iuser = "Invalid User";
 String lLoginQuery;
 
 @Path("/{userName}")
 @GET
 @Produces(MediaType.TEXT_HTML)
 public String LoginUserValidataion(@PathParam("userName") String userName)
 throws SQLException {
 
 lLoginQuery = "select * from UserInfo where userName='"
 + userName + "'";
 
 System.out.println("" + lLoginQuery);
 dbCoN = new DBConnection();
 
 try {
 conn = DBConnection.setDBConnection();
 rslt = dbCoN.getResutlSet(lLoginQuery, conn);
 
 if (rslt.next()) {
 
 String name = rslt.getString(2);
 return "Welcome " + name + "\t How are you Today?"
 + "<br><H1>This is RESTFUL DB WEBSERVICE</H1>";
 
 } else {
 return Iuser;
 }
 
 } catch (Exception e) {
 System.out.println(e);
 } finally {
 if (conn != null) {
 conn.close();
 }
 }
 
 return Iuser;
 
 }
 
 @Path("/register")
 @POST
 @Produces(MediaType.TEXT_HTML)
 public String UserRegistration(@FormParam("firstName") String FirstName,
 @FormParam("middleName") String MiddleName,
 @FormParam("lastName") String LastName,
 @FormParam("userName") String UserName,
 @FormParam("password") String password,
 @FormParam("email") String email) throws SQLException
 
 {
 
 lLoginQuery = "Insert into UserInfo values (Null,'";
 lLoginQuery = lLoginQuery + "" + FirstName + "','" + MiddleName + "','"
 + LastName + "','" + UserName + "','" + password + "','";
 lLoginQuery = lLoginQuery + "" + email + "');";
 

 
 System.out.println("" + lLoginQuery);
 dbCoN = new DBConnection();
 
 /* Database Insert */
 
 try {
 conn = DBConnection.setDBConnection();
 dbCoN.getInsertResutlSet(lLoginQuery, conn);
 
 conn.close();
 
 } catch (Exception e) {
 System.out.println(e);
 }
 
 finally {
 if (conn != null) {
 conn.close();
 }
 }
 
 return "User has been Successfully Inserted";
 
 }
 @Path("/{userName}")
 @DELETE
 @Produces(MediaType.TEXT_HTML)
 public String DeleteUser(@PathParam("userName") String userName)
 throws SQLException {
 
 lLoginQuery = "delete from UserInfo where userName='"
 + userName + "'";
 
 System.out.println("" + lLoginQuery);
 dbCoN = new DBConnection();
 
 try {
 conn = DBConnection.setDBConnection();
dbCoN.getInsertResutlSet(lLoginQuery, conn);
 
 
conn.close();
 
 } catch (Exception e) {
 System.out.println(e);
 }
 
 finally {
 if (conn != null) {
 conn.close();
 }
 }
 
 return "Done  Your Account has been successfully removed"
 + "<br><H3>This is RESTFUL WEBSERVICE DELETE operation</H3>";
 
 }
 
}
