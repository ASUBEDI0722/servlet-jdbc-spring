<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2 align="center">Products List</h2>

	<div align=center>
		<table border=2>
			<tr>
				<th>ProductId</th>
				<th>name</th>
				<th>Price</th>
				<th>Description</th>
			</tr>

			<c:forEach items="${products}" var="products">
				<tr>

					<th>${products.id}</th>
					<th>${products.name }</th>
					<th>${products.price }</th>
					<th>${products.description }</th>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>