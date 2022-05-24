<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>ADD ORDER</title>

</head>
<body style="background-color: powderblue;">
	<jsp:include page="header.jsp" /><br>
	<br>

	<br>
	<nav>
		<a href="productmenu"><b>HOME</b></a> <a href="GetAllOrderPage"><b>GET
				order details</b></a> <a href="getallpage"><b>GET PRODUCTS</b></a>
		<center>
			<div class="main header">
				<h1>Manuh Hospital</h1>
			</div>
			<div class="container">
				<div>
					<h3 class="header">ORDERS</h3>
				</div>
				<div class="main">
					<form:form action="/products/OrderaddPage" method="post"
						modelAttribute="order">
						<form:hidden path="orderId" />

						<form:errors path="firstName" cssClass="errors"></form:errors>
						<br>
						<label>FIRST name:</label>
						<form:input path="firstName" placeholder="Name*" />
						<br>

						<form:errors path="middleName" cssClass="errors"></form:errors>
						<br>
						<label>MIDDLE NAME:</label>
						<form:input path="middleName" placeholder="Name*" />
						<br>

						<form:errors path="lastName" cssClass="errors"></form:errors>
						<br>
						<label>LAST NAME</label>
						<form:input path="lastName" placeholder="Name*" />

						<br>

						<form:errors path="mobile" cssClass="errors"></form:errors>
						<br>
						<label>MOBILE:</label>
						<form:input path="mobile" placeholder="number*" />
						<br>

						<form:errors path="address" cssClass="errors"></form:errors>
						<br>
						<label>ADDRESS:</label>
						<form:input path="address" placeholder="city" />
						<br>

						<form:errors path="orderDate" cssClass="errors"></form:errors>
						<br>
						<label>ORDER DATE:</label>
						<form:input path="orderDate" placeholder="orderDate" />
						<br>

						<form:errors path="deliveryDate" cssClass="errors"></form:errors>
						<br>
						<label>DELIVERY DATE</label>
						<form:input path="deliveryDate" placeholder="deliveryDate" />
						<br>

						<form:errors path="returnDate" cssClass="errors"></form:errors>
						<br>
						<label>RETURN DATE</label>
						<form:input path="returnDate" placeholder="returnDate" />
						<br>
						<form:hidden path="productId" placeholder="productId"
							value="${productId}" />
						<form:button>Submit</form:button>
					</form:form>
					<a href="<c:url value='/products/GetAllOrderPage'/>">
						<button type="submit">Cancel</button>
					</a>
				</div>
			</div>
		</center>
</body>
</html>