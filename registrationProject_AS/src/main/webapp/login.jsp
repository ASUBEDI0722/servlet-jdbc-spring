<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="loginRegister" method="post">
		<table style="background-color: lightgreen; margin-left: 20px;">
			<tr>
				<td><h3>${message}</h3>
					<h4>${successMessage}</h4></td>
				<td></td>
			</tr>
			<tr>
				<td>Login Page !!!</td>
			</tr>

			<tr>
				<td>UserName :</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password1"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="login"></td>
				<td><a href="register.jsp"> Registration </a></td>
			</tr>

		</table>





	</form>

</body>
</html>