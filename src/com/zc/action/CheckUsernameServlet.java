package com.zc.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zc.service.CheckUsernameService;

public class CheckUsernameServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String username = request.getParameter("name");
		
       CheckUsernameService service = new CheckUsernameService();
       boolean isExist = false;
	try {
		isExist = service.checkUsername(username);
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
		String json = "{\"isExist\":"+isExist+"}";
		response.getWriter().write(json);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}