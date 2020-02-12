<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>

<body>
	<form action="/RegisterPage" method="post">
		<div>
			<h1 style="text-align: center;">Registration Form</h1>
			<hr>
			<h3 style="text-align: center; color: red;">${fail}</h3>
			<h3 style="text-align: center; color: green;">${success}</h3>
			<br>
			<h3 style="text-align: center;">
				Name: <input type="text" name="name"><br> <br>
				Password: <input type="password" name="password"><br> <br>
				RePassword: <input type="password" name="repassword"><br>
				<br> DoB: <input type="date" name="dob"><br> <br>
				Gender: <select name="gender">
					<option value="Male">Male</option>
					<option value="Female">Female</option>
					<br>
					<br>
					<input type="submit" value="Submit">
					<input type="reset" value="Clear">
			</h3>
		</div>
	</form>
</body>

</html>