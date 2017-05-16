package edu.npu.restproject.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class DBConnection {
 
 public static Connection dbCon;
 public Statement dbStmt;
 public ResultSet dbRst;
 
 
 public static Connection setDBConnection() throws SQLException {
 try {
 
 System.out.println("Inside DB Connection");
 
 Class.forName("com.mysql.jdbc.Driver");
 dbCon = DriverManager.getConnection(
 "jdbc:mysql://localhost:3306/usersignup",
 "root", "root123");
 
 } catch (ClassNotFoundException e)
 
 {
 System.out.println(e);
 }
 return dbCon;
 }
 
 /* DB getResultSet */
 public void getInsertResutlSet(String sqlQuery, Connection conn)
 throws SQLException {
 
 System.out.println(sqlQuery);
 String sqlquery = sqlQuery;
 dbCon = conn;
 try {
 
 dbStmt = dbCon.createStatement();
 dbStmt.executeUpdate(sqlquery);
 
 } catch (SQLException se) {
 System.out.println(se);
 }
 
 }
 
 public ResultSet getResutlSet(String sqlQuery, Connection conn)
 throws SQLException {
 
 System.out.println(sqlQuery);
 String sqlquery = sqlQuery;
 dbCon = conn;
 try {
 
 dbStmt = dbCon.createStatement();
 dbRst = dbStmt.executeQuery(sqlquery);
 
 } catch (SQLException se) {
 System.out.println(se);
 }
 return dbRst;
 }
}
