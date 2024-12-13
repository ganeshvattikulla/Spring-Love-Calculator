<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Sucessfull</title>
</head>
<body>

	<p>Name: ${rud.name }</p>
	<p>UserName: ${rud.userName }</p>
	<p>Password: ${rud.password }</p>
	<p>Country: ${rud.country }</p>
	<p>
		Hobbies:
		<c:forEach var="temp" items="${rud.hobby }">
		${temp} 
		</c:forEach>
	</p>
	<p>Gender: ${rud.gender }</p>
	<p>Age : ${rud.age}</p>
	
	<p>Email: ${rud.cmunDTO.email}</p>
	<p>Phone: ${rud.cmunDTO.phone}</p>
	







</body>
</html>