package com.zc.action;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.zc.service.LoginService;
import com.zc.vo.User;

public class LoginServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String username = request.getParameter("name");
		String password = request.getParameter("password");
		
		LoginService loginService = new LoginService();
		User user = null;
		
		try {
			user = loginService.login(username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(user!=null){
			//创建用户名的cookie
			Cookie cookie_username = new Cookie("cookie_username",user.getName());
			cookie_username.setMaxAge(10*60);
			//创建密码的cookie
			Cookie cookie_password = new Cookie("cookie_password",user.getPassword());
			cookie_password.setMaxAge(10*60);

			response.addCookie(cookie_username);
			response.addCookie(cookie_password);
			
			session.setAttribute("user", user);
            //重定向
			response.sendRedirect(request.getContextPath()+"/prompt/loginSuccess.jsp");
		}else
		{	
			response.setCharacterEncoding("UTF-8");
			//设置域属性 在html页面中使用jsp调用显示
			request.setAttribute("LoginInfo", "登录失败，用户名或密码错误");
			//使用转发
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			 }
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}