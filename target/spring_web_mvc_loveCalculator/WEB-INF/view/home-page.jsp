<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<style type="text/css">
body {
	background-color: rgb(127, 205, 25);
}

.heading {
	text-align: center;
}

.container {
	max-width: 650px;
	margin: 150px auto;
	margin-top: 40px;
	background-color: rgba(0, 0, 0, 0.07);
	padding: 25px;
	border-radius: 150px;
	
}

input[type="submit"] {
	background-color: rgba(24, 138, 141, 0.6);
	color: black;
	cursor: pointer;
	width: 20%;
	height: 25px;
	border: none;
	border-radius: 10px;
}

.submit-button {
	text-align: justify;
}

input[type="submit"]:hover {
	background-color: rgba(24, 138, 141, 0.3);
	color: white;
}

fieldset {
	border: none;
	padding: 2rem 0;
	padding: 20px;
	padding-left: 85px; legend { font-size : large;
	text-align: left;
	color: rgba(0, 0, 0, 0.7);
	font-weight: bold;
	font-style: italic;
	
}

label {
	font-size: medium;
	font-weight: bold;
}

hr {
	border-color: black;
}

.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 10px;
}

</style>

</head>

<body>
	<h2 style="text-align: center">Welcome to the love calculator
		website ....</h2>
	<br>
	<hr>
	<br>

	<h1 class="heading">Love Calculator</h1>


	<div class="container">

		<fieldset >
			<legend>Enter details</legend>


			<form:form action="sending-data" method="get" modelAttribute="ud">
				<p>
					<label for="yn">Your Name &nbsp&nbsp:</label>
					<form:input id="yn" path="userName" placeholder="Enter your name " />
					<form:errors path="userName" class="error"/>
				</p>

				<p>
					<label for="cn">CrushName :</label>
					<form:input id="cn" path="crushName" placeholder="Enter your crush name " />
					<form:errors path="crushName" class="error"/>	
				</p>

				<br>

				<div class="submit-button">
					<input type="submit" value="Calculate">
					
				</div>
			</form:form>
		</fieldset>
	</div>


	<script type="text/javascript">
		function nameValidator() {

			var username = document.getElementById('yn').value;

			if (username.length > 2) {
				return true;
			} else {
				alert('please make sure ,name should be more than 2 letters.🤔🤔')
				return false;
			}

		}
	</script>
</body>
</html>