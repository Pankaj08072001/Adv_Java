<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View_jobs</title>
<%@include file="All_component/All_css.jsp"%>
</head>
<body>
	<%@include file="All_component/Navbar.jsp"%>

	<div class="Container">

		<div class="row">
			<div class="col-md-12">
				<h5 class="text-center text-primary">All Jobs</h5>
				<div class="card mt-2">
					<div class="card-body">
						<div class="text-center text-primary">
							<i class="far fa-clipboard fa-2x"></i>
						</div>
						<h6>Title</h6>
						<p>Description</p>
						<br>
						<div class="form-row">
							<div class="form-group col-md3">
								<input type="text" class=" form-control form-contorl-sm"
									value="Location" readonly>

							</div>

							<div class="form-group col-md3">
								<input type="text" class=" form-control form-contorl-sm"
									value="Category" readonly>

							</div>

							<div class="form-group col-md3">
								<input type="text" class=" form-control form-contorl-sm"
									value="Status" readonly>

							</div>

						</div>
						<h6>Publish Date : 2021-06-31</h6>
						<div class="text-center">
							<a href="#" class="btn btn-sm bg-danger text-white">Edit</a>
							 <a href="#" class="btn btn-sm bg-danger text-white">Delete</a>
						</div>

					</div>

				</div>

			</div>
		</div>
	</div>


</body>
</html>