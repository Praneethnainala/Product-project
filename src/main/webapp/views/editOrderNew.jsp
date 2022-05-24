<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	</nav>
	<h1>EDIT ORDERS</h1>
	<div>
		<form:form name="topform" action="/products/editOrderNew" method="post"
			modelAttribute="order">
			<form:errors path="orderId" cssClass="errors"></form:errors>
			<br> <label>MIDDLE NAME:</label>
			<form:input path="orderId" placeholder="Name*"
				value="${order.orderId}" />
			<br>

			<form:errors path="firstName" cssClass="errors"></form:errors>
			<br> <label>MIDDLE NAME:</label>
			<form:input path="firstName" placeholder="Name*"
				value="${order.firstName}" />
			<br>


			<form:errors path="middleName" cssClass="errors"></form:errors>
			<br> <label>MIDDLE NAME:</label>
			<form:input path="middleName" placeholder="Name*"
				value="${order.middleName}" />
			<br>

			<form:errors path="lastName" cssClass="errors"></form:errors>
			<br> <label>LAST NAME</label>
			<form:input path="lastName" placeholder="Name*"
				value="${order.lastName}" />
			<br>

			<form:errors path="mobile" cssClass="errors"></form:errors>
			<br> <label>MOBILE:</label>
			<form:input path="mobile" placeholder="number*"
				value="${order.mobile}" />
			<br>

			<form:errors path="address" cssClass="errors"></form:errors>
			<br> <label>ADDRESS:</label>
			<form:input path="address" placeholder="city"
				value="${order.address}" />
			<br>

			<form:errors path="orderDate" cssClass="errors"></form:errors>
			<br> <label>ORDER DATE:</label>
			<form:input path="orderDate" placeholder="orderDate"
				value="${order.orderDate}" />
			<br>

			<form:errors path="deliveryDate" cssClass="errors"></form:errors>
			<br> <label>DELIVERY DATE</label>
			<form:input path="deliveryDate" placeholder="deliveryDate"
				value="${order.deliveryDate}" />
			<br>

			<form:errors path="returnDate" cssClass="errors"></form:errors>
			<br> <label>RETURN DATE</label>
			<form:input path="returnDate" placeholder="returnDate"
				value="${order.returnDate}" />
			<br>
			<form:hidden path="productId" placeholder="productId"
				value="${productId}" />
			<form:button>Submit</form:button>

			<a href="<c:url value='/products/GetAllOrderPage'/>">
				<button type="submit">Cancel</button>

				<button type="submit">submit</button> <br>
				</a></form:form> <br> <a
				href="productmenu.jsp">
					<button type="button">back</button>
			</a>
	</div>
</html>