package com.zc.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zc.service.UserDelService;

public class UserDelServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		UserDelService service = new UserDelService();
		boolean isDelSucces  = service.userDelByID(id);
		
		if(isDelSucces) {
			//重定向
			response.sendRedirect(request.getContextPath()+"/prompt/DelSuccess.jsp");
		}else {
			response.setCharacterEncoding("UTF-8");
			//设置域属性 在html页面中使用jsp调用显示
			request.setAttribute("LoginInfo", "删除失败！");
			//使用转发
			request.getRequestDispatcher("/data/dataUser.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}