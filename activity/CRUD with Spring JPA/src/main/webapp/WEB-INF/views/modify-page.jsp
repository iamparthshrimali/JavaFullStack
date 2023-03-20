<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.btn {
	cursor: pointer;
	color: white;
	padding: 15px 25px;
	border-radius: 10px;
	border: none;
	text-transform: uppercase;
}

.form {
	width: 500px;
	height: 300px;
	background-color: skyblue;
	display: flex;
	flex-direction: column;
	align-items: center;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}

.form form {
	display: flex;
	flex-direction: column;
	gap: 10px;
}

.courseForm {
	padding: 20px 30px;
	font-weight: bold;
}

a {
	text-decoration: none;
}
</style>
</head>

<body>
	<%@ page import="com.einfochips.models.Student" %>
	
	
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<div class="form">
	
			<h1>Modifying Parth Shrimali</h1>
			<form action="modify">
				<div class="id">
					<label for="id">ID: </label> <input type="text" name="id" id="id"
						id="" value="${student.id }" disabled>
				</div>
				<div class="fname">
					<label for="fname">fname: </label> <input type="text" name="fname"
						id="fname" id="" value="${student.fname }">
				</div>
				<div class="lname">
					<label for="lname">Lname: </label> <input type="text" name="lname"
						id="lname" id="" value="${student.lname}">
				</div>
				<div class="courseDiv">
					<select name="course" class="courseForm" id="">
						<option value="${student.course}">${student.course}</option>
						<option value="MCA">MCA</option>
						<option value="BE">BE</option>
						<option value="BSC">BSC</option>
					</select>
					<input type="submit" value="Modify" class="btn btn-modify"/>
				</div>
				
			</form>
			
	</div>

	
</body>
</html>