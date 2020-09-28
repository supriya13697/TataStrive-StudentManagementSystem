<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/student/seachStudentByMailId" method="get">
Search with MailID:<input type = "text" name="mailId"  >
<font color="red">${exception}</font>
<font color="red">${notExists}</font> <br>
<input type="submit" name="search" value="search"> 
</form>


</body>
</html>