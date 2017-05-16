package edu.npu.restproject.Action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.npu.restproject.DAO.DBConnection;
import edu.npu.restproject.domain.UserRegistration;

public class UserLogin {
	DBConnection dbCoN;
	Connection conn;
	ResultSet rslt;
	String target;

	public void LoginUserValidataion(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException,
			SQLException {

		String userName = request.getParameter("UserName");
		String userPassword = request.getParameter("Password");
		UserRegistration user = new UserRegistration(userName, userPassword, "");

		String lLoginQuery = "select * from UserInfo where userName= ";
		lLoginQuery = lLoginQuery + "'" + user.getUserName() + "';";

		System.out.println("" + lLoginQuery);
		dbCoN = new DBConnection();
		try {
			conn = DBConnection.setDBConnection();
			rslt = dbCoN.getResutlSet(lLoginQuery, conn);

			if (rslt.next()) {
				target = "success.jsp";
			} else {
				target = "error.jsp";
			}

			conn.close();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (conn != null) {
				conn.close();
			}
		}

		RequestDispatcher rd = request.getRequestDispatcher(target);
		rd.forward(request, response);
	}

}
