<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2 align="center">Order Record</h2>
	<div align=center>
		<table border =2>
			<tr>

				<th>OrderId</th>
				<th>ProductId</th>
				<th>OrderQuantity</th>
				<th>Comments</th>
			</tr>

			<tr>
				<td>${order.orderId}</td>
				<td>${order.productId}</td>
				<td>${order.orderQuantity}</td>
				<td>${order.comments}</td>
			</tr>


		</table>
		</div>

</body>
</html>