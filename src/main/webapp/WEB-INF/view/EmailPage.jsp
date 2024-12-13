<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<title>Email Page</title>
</head>
<body style="text-align: center;">

	<h1>HI ${session_userName}, Welcome to the Email Page</h1>
	<div class="container" style="padding:50px 450px 0 450px;">

		<form:form action="${pageContext.request.contextPath}/Emailsent"
			method="get" modelAttribute="ed">

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email
					address</label>
				<form:input type="email" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp"
					path="userEmail" />
				<div id="emailHelp" class="form-text">We'll never share your
					email with anyone else.</div>
			</div>

			<form:errors path="userEmail" cssClass="error" />

			<div class="col-12">
				<button class="btn btn-primary" type="submit" value="Send">Send
					Result</button>
			</div>

		</form:form>


	</div>

</body>
</html>
