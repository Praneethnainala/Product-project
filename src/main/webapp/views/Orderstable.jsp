<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ORDER DETAILS TABLE</title>
<link rel="stylesheet" href="producttable.css"></link>
</head>
<body style="background-color: powderblue;">
	<jsp:include page="header.jsp" /><br>
	<br>
	<br>
	<br>
	<nav>
		<a href="/products/productmenu"><b>HOME</b></a> <a href="/products/addpage"><b>ADD
				PRODUCT</b></a><a href="OrdersAddPage"><b>ADD ORDER</b></a><a
			href="/products/getallpage"><b>GET PRODUCT</b></a>
	</nav>
	<h1>ORDERS TABLE</h1>
	<form method="get">

		<div class="b">
			<table name="dataTable">
				<thead>
					<tr>
						<th>orderId</th>
						<th>first name</th>
						<th>middle Name</th>
						<th>last name</th>
						<th>moblie</th>
						<th>address</th>
						<th>order Date</th>
						<th>delivery Date</th>
						<th>return Date</th>
						<th>productId</th>

					</tr>
				</thead>
				<tbody>

					<c:forEach items="${orderList}" var="order">
						<tr>

							<td><c:out value="${order.orderId}" /></td>
							<td><c:out value="${order.firstName}" /></td>
							<td><c:out value="${order.middleName}" /></td>
							<td><c:out value="${order.lastName}" /></td>
							<td><c:out value="${order.mobile}" /></td>
							<td><c:out value="${order.address}" /></td>
							<td><c:out value="${order.orderDate}" /></td>
							<td><c:out value="${order.deliveryDate}" /></td>
							<td><c:out value="${order.returnDate}" /></td>
							<td><c:out value="${order.productId}" /></td>
							<td><a
								href="/products/editOrderNew?orderId=<c:out value='${order.orderId}'/>">edit</a></td>
							<td><a
								href="/products/DeleteOrdersPage?orderId=<c:out value='${order.orderId}'/>">Delete</a></td>
						</tr>
					</c:forEach>


				</tbody>
				<br>
				<br>
				<a href="productmenu">
					<button type="button">back</button>
				</a>
				</div>


				</center>
</body>
</html>