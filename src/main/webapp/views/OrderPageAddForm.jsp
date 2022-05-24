<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<p class="error">
	<c:out value="${errorflieds }"></c:out>
	<br><br>
<label>ORDER ID</label>
<input type="text" name="orderId"
	value='<c:out value="${order.orderId}" />'>
<br>
<br>
<label>FIRST NAME</label>
<input type="text" name="firstName"
	value='<c:out value="${order.firstName}" />'>
<br>
<br>
<label>MIDDLE NAME </label>
<input type="text" name="middleName"
	value='<c:out value="${order.middleName}" />'>
<br>
<br>
<label>LAST NAME</label>
<input type="text" name="lastName"
	value='<c:out value="${order.lastName}" />'>
<br>
<br>
<label>MOBLIE</label>
<input type="text" name="mobile"
	value='<c:out value="${order.mobile}" />'>
<br>
<br>
<label>address</label>
<input type="text" name="address"
	value='<c:out value="${order.address}" />'>
<br>
<br>
<label>orderDate</label>
<input type="Date" name="orderDate"
	value='<c:out value="${order.orderDate}" />'>
<br>

<br>
<label>deliveryDate</label>
<input type="Date" name="deliveryDate"
	value='<c:out value="${order.deliveryDate}" />'>
<br>
<br>
<label>returnDate</label>
<input type="Date" name="returnDate"
	value='<c:out value="${order.returnDate}" />'>
<br>
<br>

