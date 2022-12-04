<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		if (session.getAttribute("username") == null) {
			response.sendRedirect("Login.jsp");
			
		}
	%>
	
	https://www.youtube.com/watch?v=cYc3FjhMMzI&list=PLsyeobzWxl7pUPF2xjjJiG4BKC9x_GY46&index=32

</body>
</html>