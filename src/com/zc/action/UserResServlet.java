package com.zc.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zc.service.UserResService;
import com.zc.utils.CommonsUtils;
import com.zc.utils.MD5UtilsCalcu;
import com.zc.vo.User;

public class UserResServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
//		使用MD5加密
		String passwordmd5 = MD5UtilsCalcu.md5(password);
		String sex = request.getParameter("sex");
		String age = request.getParameter("age");
		int parseage = Integer.parseInt(age);
		String record = request.getParameter("record");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		
		User user = new User();
//		UUID
		user.setId(CommonsUtils.getUUID());
		user.setName(name);
		user.setPassword(passwordmd5);
		user.setSex(sex);
		user.setAge(parseage);
		user.setRecord(record);
		user.setTelephone(telephone);
		user.setEmail(email);
		UserResService service = new UserResService();
		boolean isResSuccess = service.saveUser(user);
		
		if(isResSuccess) {
			//重定向
			response.sendRedirect(request.getContextPath()+"/prompt/regiSuccess.jsp");
		}else {
			response.setCharacterEncoding("UTF-8");
			//设置域属性 在html页面中使用jsp调用显示
			request.setAttribute("LoginInfo", "注册失败！请重新输入");
			//使用转发
			request.getRequestDispatcher("/registerTree/userReg.jsp").forward(request, response);
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}