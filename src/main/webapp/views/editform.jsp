<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<p class="error">
	<c:out value="${errorflieds }"></c:out>
</p>
<input type="hidden" placeholder="ProductId*" name="productId"
	value='<c:out value="${updatedProduct.productId}" />'>
<br>
<label>PRODUCT NAME</label>
<Input type="text" name="productName"
	value='<c:out value="${updatedProduct.productName}"/>'>
<br>
<br>
<label>BRAND NAME</label>
<input type="text" name="brandName"
	value='<c:out value="${updatedProduct.brandName}"/>'>
<br>
<br>
<label>category</label>
<select name="category" value='<c:out value="${updatedProduct.category}" />'>
	<option value="">Select</option>
	<option value="food">food</option>
	<option value="shoes">shoes</option>
	<option value="clothes">clothes</option>
	<option value="moblies">moblie</option>
</select>
<br>
<br>
<label>MODEL YEAR</label>
<input type="number" name="modelYear"
	value='<c:out value="${updatedProduct.modelYear}" />'>
<br>
<br>
<label>LIST PRICE</label>
<input type="number" placeholder="oooo.oo" name="listPrice"
	value='<c:out value="${updatedProduct.listPrice}" />'>
<br>
<br>

<br>
<br>
