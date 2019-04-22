package com.zc.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginOut extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//将user对象从session域中remove
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		//覆盖之前的cookie
		Cookie cookie_username = new Cookie("cookie_username","");
		cookie_username.setMaxAge(0);
		Cookie cookie_password = new Cookie("cookie_password","");
		cookie_password.setMaxAge(0);
		response.addCookie(cookie_username);
		response.addCookie(cookie_password);
				
		response.sendRedirect(request.getContextPath()+"/login.jsp");//重定向
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}