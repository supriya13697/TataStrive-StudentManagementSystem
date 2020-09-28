<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@page import="com.example.dto.Student"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<table border="">
<tr><th>Id<th>Name</th><th>MailId</th><th>Gender</th><th>Qualification</tr>
	<tr>
		<td><input type="text" name="id" value= ${student.id} readonly/></td>
		<td><input type="text" name="name" value= ${student.name} readonly/></td>
		<td><input type="text" name="mailId" value= ${student.mailId} readonly/></td>
		<td><input type="text" name="gender" value= ${student.gender} readonly/></td>
		<td><input type="text" name="qualification" value= ${student.qualification} readonly/></td>
	</tr> 
</table>
<form action ="/login">
     <input type = "submit" value = "Home"/> 
</form>
   </body>
</body>
</html>