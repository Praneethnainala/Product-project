<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>productlogin</title>
<link rel=stylesheet href="login.css"></link>
<script type="text/javascript" src="loginjs.js"></script>

</head>

<center>
	<body style="background-color: powderblue; padding-top: 65px;">
		<h1>LOGIN</h1>

		<p class="error">
			<c:out value="${error}" />
		</p>
		<form name="form" action="LoginPage" method="post">
			<label name="username">username:</label> <input type="text"
				placeholder="abc.manuh" name="username"><br> <br>
			<label>password:</label> <input type="password" name="password"><br>
			<br>
			<button type="sumbit">login</button>
			<br> <br>
		</form>
		<label>forgetpassword:</label>
		<br>
		<br>
		<button type="reset">reset password</button>
		<br>
		<br>
		</div>
		<div>
			<label>if you are new user:</label><br> <br>
			<button type="button">signup</button>
		</div>
	</body>
</center>
</html>