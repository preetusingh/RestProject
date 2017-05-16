package edu.npu.restproject.MainController;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.npu.restproject.Action.UserLogin;

public class MainController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("inside controller");
		String inputString = request.getParameter("Login");

		if (inputString.equals("Login")) {
			UserLogin ul = new UserLogin();
			try {
				ul.LoginUserValidataion(request, response);
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

}