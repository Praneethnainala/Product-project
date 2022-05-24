<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="productmenucss.css"></link>
</head>
<center>
	<body style="background-color: powderblue;">

		<div class="top">
			<jsp:include page="header.jsp" />


			<br> <br> <br>
		</div>
	<nav>
		<a href="/products/productmenu"><b>HOME</b></a> <a
			href="/products/addpage"><b>ADD PRODUCT</b></a><a
			href="OrdersAddPage"><b>ADD ORDER</b></a><a
			href="/products/getallpage"><b>GET PRODUCT</b></a>
	</nav>
	<h1>ERROR</h1>
	<h2>${msg}</h2>
</body>
</html>