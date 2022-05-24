<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>editOrders</title>
</head>
<body style="background-color: powderblue;">
<jsp:include page="header.jsp" /><br>
<br>
<br>
<nav>
	<a href="productmenu"><b>HOME</b></a> <a href="GetAllOrderPage"><b>GET
			order details</b></a> <a href="/products/getallpage"><b>GET PRODUCTS</b></a>
	<h1>EDIT ORDERS</h1>
	<div>
		<form name="topform" action="EditOrderPage" method="post">

			<%@include file="OrderPageAddForm.jsp"%>

			<button type="submit">submit</button>
			<br> <br> <a href="productmenu.jsp">
				<button type="button">back</button>
			</a>
	</div>
</html>