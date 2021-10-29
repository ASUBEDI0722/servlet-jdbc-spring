<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/login.css" />
<meta charset="ISO-8859-1">
<title>Login Page</title>

</head>
<body>
	<div id="loginform">
		<h1 class="formheading">Please Login</h1>
		<p> Please enter your credentials to login. </p>
		<form action="LoginServlet" method="post">
			<table>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="login"></td>
				</tr>


			</table>
		</form>
	</div>


</body>
</html>