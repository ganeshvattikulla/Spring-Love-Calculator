<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registeration-Page</title>

<style>
body {
	background-color: transparent;
}

.container {
	max-width: 650px;
	margin: 150px auto;
	margin-top: 40px;
	background-color: rgba(0, 0, 0, 0.07);
	padding: 25px;
	border-radius: 0px;
}
</style>
</head>
<body>
	<br>

	<h2 align="center">Registration Page</h2>

	<div class="container">

		<form:form action="sending-registerData" method="get"
			modelAttribute="rud">
			<p>
				<label for="yn">Name &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</label>
				<form:input id="yn" path="name" placeholder="Enter your name " />

			</p>
			<p>
				<label for="un">Username :</label>
				<form:input id="un" path="userName" placeholder="Enter username " />

			</p>
			<p>
				<label for="ps">Password :</label>
				<form:input id="ps" path="password" placeholder="Enter Password " />

			</p>
			<p>
				<label for="cn">Country :</label>
				<form:select path="country" id="cn">
					<form:option value="" label="--Select--"></form:option>
					<form:option value="India" label="India"></form:option>
					<form:option value="America" label="America"></form:option>
					<form:option value="Pakistan" label="Pakistan"></form:option>
				</form:select>
			</p>


			<p>
				<label for="hy">Hobby :</label>

				<form:checkbox id="hy" path="hobby" value="Reading" label="Reading" />
				<form:checkbox id="hy" path="hobby" value="Coding" label="Coding" />
				<form:checkbox id="hy" path="hobby" value="Cricket" label="Cricket" />
				<form:checkbox id="hy" path="hobby" value="Swimming"
					label="Swimming" />


			</p>
			<p>
				<label for="gnr">Gender :</label>

				<form:radiobutton id="gnr" path="gender" value="Male" label="Male" />
				<form:radiobutton id="gnr" path="gender" value="Female"
					label="Female" />
				<form:radiobutton id="gnr" path="gender" value="Others"
					label="Others" />

			</p>


			<br>

			<div class="submit-button">
				<input type="submit" value="Register">
			</div>
		</form:form>

	</div>

</body>
</html>