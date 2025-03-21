<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up page</title>
<%@include file="All_component/All_css.jsp"%>

</head>
<body style="background-color: #f0f1f2">
	<%@include file="All_component/Navbar.jsp"%>

	<div class="continer-fluid">
		<div class="row p-4">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<div class="text-center">
							<i class="fa fa-user-plus fa-2x" aria-hidden="true"></i>
							<h5>Registration</h5>
						</div>
						<c:if test= "${not empty succMsg}">
						<h4 class="text-center text-danger"> ${succMsg }</h4>
						</c:if>

						<form action="Register" method="post">
							<div class="form-group">
								<label>Enter Full Name</label><input type="text"
									required="required" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									name="name">
							</div>

							<div class="form-group">
								<label>Enter Qulification</label><input type="text"
									required="required" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp" name="qua">
							</div>

							<div class="form-group">
								<label>Enter Email</label><input type="email"
									required="required" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									name="email">
							</div>


							<div class="form-group">
								<label>Enter Password</label><input type="password"
									required="required" class="form-control"
									id="exampleInputEmail1" name="ps">
							</div>
							<button class="btn btn-primary badge-pill btn-block"
								type="submit">Register</button>
						</form>

					</div>
				</div>
			</div>
		</div>

	</div>

</body>
</html>