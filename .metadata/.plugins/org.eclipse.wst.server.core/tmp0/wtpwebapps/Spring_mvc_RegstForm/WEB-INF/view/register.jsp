
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>

	<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header text-center fs-3">Register Page</div>
					<div class="card-body">
						<form action="createUser" method="post">
							<label for="name">Name:</label> <br> <input type="text"
								id="name" name="name" required> <br>
							<hr>

							<label for="email">Email:</label> <br> <input type="email"
								id="email" name="email" required> <br>
							<hr>

							<label for="password" >Password:</label> <br> <input
								type="password"  id="password" name="password" required>
							<br>
							<hr>
							<input type="checkbox" id="terms" name="check" required>
							<label for="terms">Check Out Me</label> <br>
							<hr>


							<button type="submit" class="btn btn-primary col-md-12">Register</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

</body>
</html>
l>
