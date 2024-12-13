<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reslut Page</title>
</head>
<body style="text-align: center;">

	<h1 style="text-align: center">Love Calculator</h1>
	<hr>
	<p>Your Name : ${ud.userName}</p>
	<p>Crush Name : ${ud.crushName}</p>
	<h3>Result : ${Relation}</h3>


	<a href="/spring_web_mvc_loveCalculator/sendEmail/${ud.userName}">Send
		the Result to Your Email</a>
</body>
</html>