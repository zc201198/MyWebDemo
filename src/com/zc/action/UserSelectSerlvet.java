package com.zc.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zc.service.UserSelectService;
import com.zc.vo.User;

public class UserSelectSerlvet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserSelectService service = new UserSelectService();
		List<User> userlist = service.findAllUsers();
		request.setAttribute("userlist", userlist);
		
		request.getRequestDispatcher("/data/dataUser.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}