<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

	<%! 
		int coef = 3;
		
	%>
	
	<%
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i+j;
		
		
		out.println("Output: "+k);
		out.println("this is inside scriptlet tag");
	
	%>
	
	Value of the variable in declarative tag is: <%= coef %>

</body>
</html>