<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Crud</title>
<style>
body {
	background-color: white;
	text-align: center;
}

table {
	width: 100%;
	border: 1px solid black;
	margin-top: 10px;
}

table td, table th {
	border: 1px solid black;
	height: 50px;
	font-size: 20px;
	padding: 10px;
}

table th {
	font-size: 30px;
}

.btn {
	cursor: pointer;
	color: white;
	padding: 15px 25px;
	border-radius: 10px;
	border: none;
	text-transform: uppercase;
}

.btn.btn-add {
	background-color: green;
	transform: translateX(400px);
}

.container {
	padding: 20px 40px;
	position: relative;
}

.btn-modify {
	background-color: skyblue;
}

.btn-delete {
	background-color: red;
}

.course {
	padding: 20px 30px;
	transform: translateX(-400px);
	font-weight: bold;
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
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<div class="container">
		<form action="course" class="courseForm">

			<select name="course" id="" class="course">
				<option value="" selected disabled>Select Course</option>
				<option value="all">All Courses</option>
				<option value="MCA">MCA</option>
				<option value="BE">BE</option>
				<option value="BSC">BSC</option>
			</select> <a href="add" class="btn btn-add">Add Data</a>
			<div class="table">
				<table>
					<tr>
						<th>Id</th>
						<th>Fname</th>
						<th>Lname</th>
						<th>Course</th>
						<th>Actions</th>
					</tr>
					<c:forEach items="${students}" var="s">
						<tr>
							<td>${s.getId()}</td>
							<td>${s.getFname() }</td>
							<td>${s.getLname() }</td>
							<td>${s.getCourse() }</td>
							<td style="display: flex; justify-content: center; gap: 20px;">
								<a href="modify-page?id=${s.id }" class="btn btn-modify">Modify</a>
								<a href="delete?id=${s.id }" class="btn btn-delete">Delete
									</div>
							</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
	</div>

	<script>
    	document.querySelector(".courseForm").addEventListener("change",()=>{
    		document.querySelector(".courseForm").submit();
    	})
    </script>


</body>
</html>