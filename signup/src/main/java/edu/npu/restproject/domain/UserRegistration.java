package edu.npu.restproject.domain;

public class UserRegistration {
	 
	 private String userName;
	 private String userPassword;
	 private String userEmail;
	 
	 public UserRegistration(String userName, String userPassword,
	 String userEmail) {
	 super();
	 this.userName = userName;
	 this.userPassword = userPassword;
	 this.userEmail = userEmail;
	 }
	 
	 public String getUserName() {
	 return userName;
	 }
	 
	 public String getUserPassword() {
	 return userPassword;
	 }
	 
	 public String getUserEmail() {
	 return userEmail;
	 }
	 
	}
