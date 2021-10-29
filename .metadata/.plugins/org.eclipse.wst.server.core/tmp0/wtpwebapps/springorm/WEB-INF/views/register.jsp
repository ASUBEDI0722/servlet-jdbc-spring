<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2 align="center">Register Page</h2>

	<div align="center">

		<form action="registerprocess " method="post">

			<table>

				<tr>
					<td><label>Firstname</label></td>
					<td><input type="text" name="firstname"></td>
				</tr>

				<tr>
					<td><label>Lastname</label></td>
					<td><input type="text" name="lastname"></td>
				</tr>
				<tr>
					<td><label>City</label></td>
					<td><input type="text" name="city"></td>
				</tr>
				<tr>
					<td><label>Email</label></td>
					<td><input type="text" name="email"></td>
				</tr>

				<tr>
					<td><input type="submit" value="submit"></td>
				</tr>

			</table>


		</form>
	</div>



</body>
</html>