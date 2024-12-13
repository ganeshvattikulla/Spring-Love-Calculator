<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
body {
    background-color: #f8f9fa;
}

.container {
    max-width: 600px;
    margin: 50px auto;
    background-color: #ffffff;
    padding: 30px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.error {
    color: red;
}
</style>
</head>
<body>

<div class="container">
    <h2 class="text-center">Registration Page</h2>
    <form:form action="sending-registerData" method="get" modelAttribute="rud">
        <div class="form-group">
            <label for="yn">Name</label>
            <form:input id="yn" path="name" placeholder="Enter your name" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="un">Username</label>
            <form:input id="un" path="userName" placeholder="Enter username" class="form-control"/>
            <form:errors path="userName" class="error"/>
        </div>
        <div class="form-group">
            <label for="ps">Password</label>
            <form:input id="ps" path="password" placeholder="Enter Password" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="cn">Country</label>
            <form:select path="country" id="cn" class="form-control">
                <form:option value="" label="--Select--"></form:option>
                <form:option value="India" label="India"></form:option>
                <form:option value="America" label="America"></form:option>
                <form:option value="Pakistan" label="Pakistan"></form:option>
            </form:select>
        </div>
        <div class="form-group">
            <label for="hy">Hobby</label><br>
            <div class="form-check form-check-inline">
                <form:checkbox id="hy1" path="hobby" value="Reading" label="Reading" class="form-check-input"/>
                <label class="form-check-label" for="hy1"></label>
            </div>
            <div class="form-check form-check-inline">
                <form:checkbox id="hy2" path="hobby" value="Coding" label="Coding" class="form-check-input"/>
                <label class="form-check-label" for="hy2"></label>
            </div>
            <div class="form-check form-check-inline">
                <form:checkbox id="hy3" path="hobby" value="Cricket" label="Cricket" class="form-check-input"/>
                <label class="form-check-label" for="hy3"></label>
            </div>
            <div class="form-check form-check-inline">
                <form:checkbox id="hy4" path="hobby" value="Swimming" label="Swimming" class="form-check-input"/>
                <label class="form-check-label" for="hy4"></label>
            </div>
        </div>
        <div class="form-group">
            <label for="gnr">Gender</label><br>
            <div class="form-check form-check-inline">
                <form:radiobutton id="gnr1" path="gender" value="Male" label="Male" class="form-check-input"/>
                <label class="form-check-label" for="gnr1"></label>
            </div>
            <div class="form-check form-check-inline">
                <form:radiobutton id="gnr2" path="gender" value="Female" label="Female" class="form-check-input"/>
                <label class="form-check-label" for="gnr2"></label>
            </div>
            <div class="form-check form-check-inline">
                <form:radiobutton id="gnr3" path="gender" value="Others" label="Others" class="form-check-input"/>
                <label class="form-check-label" for="gnr3"></label>
            </div>
        </div>
        <div class="form-group">
            <label for="age">Age</label>
            <form:input id="age" path="age" class="form-control"/>
            <form:errors path="age" class="error"/>
        </div>
        <h4>Contact Details</h4>
        <div class="form-group">
            <label for="cmd">Email</label>
            <form:input path="cmunDTO.email" id="cmd" class="form-control"/>
            <form:errors path="cmunDTO.email" class="error"/>
        </div>
        <div class="form-group">
            <label for="cmdPhone">Phone</label>
            <form:input path="cmunDTO.phone" id="cmdPhone" class="form-control"/>
        </div>
        <div class="text-center">
            <button type="submit" class="btn btn-primary">Register</button>
        </div>
    </form:form>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
