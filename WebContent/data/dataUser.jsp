<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<body>
<h1>用户数据界面</h1>
	<table cellspacing="0" cellpadding="1" rules="all"
							bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
							<tr
								style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

								<td align="center" width="10%">用户名</td>
								<td align="center" width="10%">性别</td>
								<td align="center" width="10%">年龄</td>
								<td align="center" width="10%">学历</td>
								<td align="center" width="10%">电话</td>
								<td align="center" width="50%">邮件</td>
								<td width="7%" align="center">编辑</td>
								<td width="7%" align="center">删除</td>
							</tr>
							<c:forEach items="${userlist }" var="user">
								<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="18%">${user.name }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">${user.sex }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">${user.age }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">${user.record }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">${user.telephone }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">${user.email }</td>	
									<td align="center" style="HEIGHT: 22px"><a
									href="${pageContext.request.contextPath }/userEdit?id=${user.id}">
										<img
										src="${pageContext.request.contextPath}/img/i_edit.gif"
										border="0" style="CURSOR: hand">
								        </a></td>
								    <td align="center" style="HEIGHT: 22px"><a href="${pageContext.request.contextPath }/userDel?id=${user.id}">
								     <img
										src="${pageContext.request.contextPath}/img/i_del.gif"
										width="16" height="16" border="0" style="CURSOR: hand">
								</a></td>   
								</tr>
							</c:forEach>
						</table>
</body>
</html>