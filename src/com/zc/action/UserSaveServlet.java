package com.zc.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zc.service.UserSaveService;
import com.zc.vo.User;

public class UserSaveServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String age = request.getParameter("age");
		int parseAge = Integer.parseInt(age);
		String telephone = request.getParameter("telephone");
		String sex = request.getParameter("sex");
		String email = request.getParameter("email");
		String record = request.getParameter("record");
		
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		user.setAge(parseAge);
		user.setTelephone(telephone);
		user.setSex(sex);
		user.setEmail(email);
		user.setRecord(record);
		
		UserSaveService service = new UserSaveService();
		boolean isSavSuccess = service.saveUserByID(user,id);
		
		if(isSavSuccess) {
			//重定向
			response.sendRedirect(request.getContextPath()+"/prompt/UpdateSuccess.jsp");
		}else {
			response.setCharacterEncoding("UTF-8");
			//设置域属性 在html页面中使用jsp调用显示
			request.setAttribute("LoginInfo", "更新失败！请重新输入");
			//使用转发
			request.getRequestDispatcher("/data/userEdit.jsp").forward(request, response);
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}