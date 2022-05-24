<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>product info</title>
<link rel="stylesheet" href="product.css"></link>

<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/jquery.validate.min.js"></script>
<script type="text/javascript" src="productjs.js"></script>

</head>
<center>
	<body style="background-color: powderblue;">
		<br>
		<jsp:include page="header.jsp" />
		<br>

		<div class="bar">
			<nav>
				<a href="productmenu"><b>HOME</b></a> &nbsp  &nbsp <a href="/products/getallpage"><b>GET
						PRODUCT</b></a>
		</div>
		<h1>PRODUCT DETAILS</h1>
		<form name="topform" action="/products/addpage" method="post">
			<%@include file="editform.jsp"%>

			<button type="submit">submit</button>
			<br> <br>
		</form>
	</body>
</center>
</html>