<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
b
	<%
		response.setContentType("text/html");
		
		String loginId = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(String.format("username:%s,password:%s", loginId, password));
		// todo validate cridentals
		RequestDispatcher rd = request.getRequestDispatcher("productmenu.html");

		rd.include(request, response);
		out.close();
	%>
	

</body>
</html>