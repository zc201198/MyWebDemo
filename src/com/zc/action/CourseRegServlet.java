package com.zc.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zc.service.CourseRegService;
import com.zc.vo.Course;

public class CourseRegServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String teacher = request.getParameter("teacher");
		
		Course course = new Course();
		course.setId(id);
		course.setName(name);
		course.setTeacher(teacher);
		
		CourseRegService service = new CourseRegService();
		boolean isResSuccess =service.saveCourse(course);
		
		if(isResSuccess) {
			//重定向
			response.sendRedirect(request.getContextPath()+"/prompt/regiSuccess.jsp");
		}else {
			response.setCharacterEncoding("UTF-8");
			//设置域属性 在html页面中使用jsp调用显示
			request.setAttribute("LoginInfo", "注册失败！请重新输入");
			//使用转发
			request.getRequestDispatcher("/registerTree/courseReg.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}