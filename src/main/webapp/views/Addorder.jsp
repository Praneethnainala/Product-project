<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD ORDER</title>
</head>
<center>
	<body style="background-color: powderblue;">
		<jsp:include page="header.jsp" /><br>
		<br>
		<br>
		<nav>
			<a href="productmenu"><b>HOME</b></a> <a
				href="GetAllOrderPage"><b>GET order details</b></a> <a
				href="getallpage"><b>GET PRODUCTS</b></a>
			<h1>ORDERS</h1>
			<div>
				<form name="topform" action="OrdersAddPage" method="post">

					<%@include file="OrderPageAddForm.jsp"%>
					<input type="hidden" name="productId"
						value='<c:out value="${productId}" />'>
					<button type="submit">submit</button>
					<br> <br>
				</form>
				<a href="productmenu.jsp">
					<button type="button">back</button>
				</a>
			</div>
	</body>
</center>
</html>
