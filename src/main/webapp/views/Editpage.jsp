<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>product list info</title>
<link rel="stylesheet" href="producttable.css"></link>
</head>

<body style="background-color: powderblue;">
	<jsp:include page="header.jsp" /><br>

	<nav>
		<a href="productmenu"><b>HOME</b></a> <a href="/products/product"><b>ADD
				PRODUCT</b></a>
	</nav>
	<br>
	<br>
	<br>


	<h1>PRODUCTLIST</h1>

	<div class="b">
		<form name="topform" action="editpage" method="post">
			<%@include file ="editform.jsp" %>
			<button type="submit">submit</button>
			
			<br> <br>
		</form>
<a href="/products/getallpage">
			<button type="button">back</button>
			</a>

	</div>




	<script type="text/javascript" src="productjs.js"></script>
</html>