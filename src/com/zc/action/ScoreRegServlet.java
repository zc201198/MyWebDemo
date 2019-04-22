package com.zc.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zc.service.ScoreRegService;
import com.zc.vo.Score;

public class ScoreRegServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String results = request.getParameter("results");
		int parseresults = Integer.parseInt(results);
		
		Score score = new Score();
		score.setId(id);
		score.setName(name);
		score.setResults(parseresults);
		
		ScoreRegService service = new ScoreRegService();
		boolean isResSuccess = service.saveScore(score);
		
		if(isResSuccess) {
			//重定向
			response.sendRedirect(request.getContextPath()+"/prompt/scoreSuccess.jsp");
		}else {
			response.setCharacterEncoding("UTF-8");
			//设置域属性 在html页面中使用jsp调用显示
			request.setAttribute("LoginInfo", "注册失败！请重新输入");
			//使用转发
			request.getRequestDispatcher("/registerTree/scoreReg.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}