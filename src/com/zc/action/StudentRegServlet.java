package com.zc.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zc.service.StudentRegService;
import com.zc.vo.Students;

public class StudentRegServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentid = request.getParameter("studentid");
		String name = request.getParameter("name");
		String banji = request.getParameter("banji");
		String sex = request.getParameter("sex");
		String professional = request.getParameter("professional");
		String dept = request.getParameter("dept");
		String age = request.getParameter("age");
		int parseAge= Integer.parseInt(age);
		String telephone = request.getParameter("telephone");
		
		Students students = new Students();
		students.setStudentid(studentid);
		students.setName(name);
		students.setBanji(banji);
		students.setSex(sex);
		students.setProfessional(professional);
		students.setDept(dept);
		students.setAge(parseAge);
		students.setTelephone(telephone);
		
		StudentRegService service = new StudentRegService();
		boolean isResSuccess = service.saveStu(students);
		
		if(isResSuccess) {
			//重定向
			response.sendRedirect(request.getContextPath()+"/prompt/regiSuccess.jsp");
		}else {
			response.setCharacterEncoding("UTF-8");
			//设置域属性 在html页面中使用jsp调用显示
			request.setAttribute("LoginInfo", "注册失败！请重新输入");
			//使用转发
			request.getRequestDispatcher("/registerTree/studentReg.jsp").forward(request, response);
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}