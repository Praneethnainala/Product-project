<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>deliveryList</title>
</head>
<center>
	<body>

		<h1>Product orders</h1>

		<form action="SearchServlet" method="get">
			<input placeholder="enter valid productID" name="productId">
			<button type="submit">search</button>
		</form>
		<form method="get">

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

								<td><c:out value="${order.get[productID]}" /></td>
								<td><c:out value="${order.get(2)}" /></td>
								<td><c:out value="${order.get(3)}" /></td>
								<td><c:out value="${order.get(4)}" /></td>
								<td><c:out value="${order.get(1)}" /></td>
								<td><c:out value="${order.get(1)}" /></td>
								<td><c:out value="${order.get(1)}" /></td>
								<td><c:out value="${order.get(1)}" /></td>
								<td><c:out value="${order.get(1)}" /></td>
								<td><c:out value="${order.get(1)}" /></td>
								<td><c:out value="${order.get(1)}" /></td>
								<td><c:out value="${order.get(1)}" /></td>
								<td><c:out value="${order.get(1)}" /></td>
								<td><c:out value="${order.get(1)}" /></td>
								<td><c:out value="${order.get(1)}" /></td>
								<td><c:out value="${order.get(1)}" /></td>


							</tr>
						</c:forEach>


					</tbody>
			</div>




			<script type="text/javascript" src="productjs.js"></script>
	</body>
</center>
</html>