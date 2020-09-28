<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.example.dto.Student"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Tata Strive ${uName}</h1>
<font color="blue">${addedMessage}</font>

<form action="/student/newStudent">
	<input type="submit" value="Add New Student Info" />
</form>

<form action="/student/searchStudent">
	<input type = "submit" value="Search Old Student Info">
</form>

</body>
</html>