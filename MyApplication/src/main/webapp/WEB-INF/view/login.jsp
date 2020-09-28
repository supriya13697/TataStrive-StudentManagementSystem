<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping</title>
</head>
<body>
<h1>Welcome to Tata Strive</h1>
<font color="red">${errorMessage}</font>
<form action="/userLogin" method="post">
User Name:<input type="text" name="uName"/><br>
Password:<input type="password" name="password"/><br>
<input type = "submit" value="Login">
</form>

</body>
</html>