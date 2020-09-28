<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Student Details</h1>
<form action="/student/studentInfo" method="post">
Name:<input type = "text" name="name"><br>
MailID:<input type = "text" name="mailId">
<font color="red">${exception}</font>	<br>
Gender:<input type="radio" name="gender" value="true"> Male</input>
<input type="radio" name="gender" value="false"> Female</input><br>
Qualification:<select name="qualification"> 
<option value="btech">BTech</option> 
<option value="intermediate">Intermediate</option> 
<option value="tenth">Tenth</option> 
</select> <br>
<input type="submit" name="submit" value="submit"> 
</form>
</body>
</html>