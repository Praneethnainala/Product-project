<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="producttable.css"></link>
</head>
<body style="background-color: powderblue;">
	<jsp:include page="header.jsp" /><br>
	<br>
	<br>
	<nav>
		<a href="productmenu"><b>HOME</b></a> <a href="addpage"><b>ADD
				PRODUCT</b></a>
	</nav>
	<center>
		<h1>PRODUCTLIST</h1>
		<form method="get">
			<button>
				<a href="Searchpage">Search by ID</a>
			</button>
			<div class="b">
				<table name="dataTable">
					<thead>
						<tr>
							<th>productId</th>
							<th>product name</th>
							<th>brandName</th>
							<th>category</th>
							<th>model year</th>
							<th>list price</th>
							<th>orderId</th>

						</tr>
					</thead>
					<tbody>



						<tr>

							<td><c:out value="${product.productId}" /></td>
							<td><c:out value="${product.productName}" /></td>
							<td><c:out value="${product.brandName}" /></td>
							<td><c:out value="${product.category}" /></td>
							<td><c:out value="${product.modelYear}" /></td>
							<td><c:out value="${product.listPrice}" /></td>
							
							<td><a
								href="editpage?productId=<c:out value='${product.productId}'/>">edit</a></td>
							<td><a
								href="deletepage?productId=<c:out value='${product.productId}'/>">DELETE</a></td>

						</tr>



					</tbody>
					</div>


					</center>

					<script type="text/javascript" src="productjs.js"></script>
</body>
</html>