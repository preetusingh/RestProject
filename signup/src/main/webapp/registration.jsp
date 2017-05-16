<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="api/db/register" method="POST">
 
 <font size="6"><b>Sign Up </b></font><br> <font size="3"><b><i>Welcome to SignUp page </i></b></font> <br> &nbsp;
 <table bgcolor=#2dede6 width=350>
 <tr>
 </tr>
 <tr>
 <td><font color="white">FirstName </font></td>
 <td><input type="text" name="firstName" size=28 /></td>
 </tr>
 <tr>
 <td><font color="white">MiddleName</font></td>
 <td><input type="text" name="middleName" size=28 /></td>
 </tr>
 <tr>
 <td><font color="white">LastName</font></td>
 <td><input type="text" name="lastName" size=28 /></td>
 </tr>
 <tr>
 <td><font color="white">User Name</font></td>
 <td><input type="text" name="userName" size=28 /></td>
 </tr>
 <tr>
 <td><font color="white">Enter Password</font></td>
 <td><input type="text" name="password" size=28 /></td>
 </tr>
 <tr>
 <td><font color="white">Email</font></td>
 <td><input type="text" name="email" size=28 /></td>
 </tr>
 <tr>
 <td></td>
 <td><input type="submit" value="Submit" size=20 /> <input
 type="reset" name="reset" value="Reset" size=20 /></td>
 </tr>
 </table>
 </form>
</body>
</html>