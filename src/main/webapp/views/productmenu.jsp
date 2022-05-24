<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>www.productmenu.com</title>

<link rel="stylesheet" href="productmenucss.css"></link>
</head>
<center>
	<body style="background-color: powderblue;">

		<div class="top">
			<jsp:include page="header.jsp" />


			<br> <br> <br>
		</div>
		<h1 style="padding:40px 0px 40px 0px; font-size: 41px">
			<b>PRODUCT MENU</b>
		</h1>
		<form method="post">
			<div class="head">
				<div class="part1">
					<button>

						<a href='<c:url value="/products/addpage" />'>ADD product</a>
					</button>
				</div>
				<br>

				<div class="dropdown">
					<button class="dropbtn">

						<a href='<c:url value="/products/getallpage" />'>GET ALL PAGE</a><i
							class="fa fa-caret-down"></i>
					</button>
					<br><br>
					<button>
						<a href='<c:url value="/products/OrderaddPage" />'>ADD ORDER</a>

					</button>
					<br><br>
					<button>
						<a href='<c:url value="/products/GetAllOrderPage" />'>get all
							order</a>

					</button>
					<br> <br>

				</div>

			</div>

		</form>
	</body>
</center>
</html>