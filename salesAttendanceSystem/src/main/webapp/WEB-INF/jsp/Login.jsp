<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Axavi Mobiles</title>
<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:200,200i,300,300i,400,400i,600,600i,700,700i,900,900i"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Merriweather:300,300i,400,400i,700,700i,900,900i"
	rel="stylesheet">
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">

<!-- Custom styles for this template -->
<link href="css/coming-soon.min.css" rel="stylesheet">


<script type="text/javascript" src="js/login.js"></script>
</head>
<body>
	<div class="overlay"></div>
	<video playsinline="playsinline" autoplay="autoplay" muted="muted"
		loop="loop">
		<source src="mp4/bg.mp4" type="video/mp4">
	</video>

	<div class="masthead">
		<div class="masthead-bg"></div>
		<div class="container h-100">
			<div class="row h-100">
				<div class="col-12 my-auto">
					<div class="masthead-content text-white py-5 py-md-0">

						<form:form method="POST" modelAttribute="employee" action="/generate">
							<h1 class="mb-3">Login</h1>
							<div class="row">
								<div class="col-md-12">
									<div class="input-group input-group-newsletter"
										style="margin-top: 20px">
										<input type="text" path="role.role"/>
										<form:select path="role">

                  <c:forEach items="${roledetail}" var="category">
												<option value="${category.roleId}"
													<c:if test="${category.roleId eq selectedCatId}">selected="selected"</c:if>>
													${category.role}</option>
											</c:forEach>

                     

                       </form:select>
										
										
										
										<%-- <select class="form-control" name="category" >
											<c:forEach items="${roledetail}" var="category">
												<option value="${category.roleId}"
													<c:if test="${category.roleId eq selectedCatId}">selected="selected"</c:if>>
													${category.role}</option>
											</c:forEach>
										</select> --%>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<div class="input-group input-group-newsletter"
										style="margin-top: 20px">
										<input type="text" />
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<div class="input-group input-group-newsletter"
										style="margin-top: 20px">
										<input type="password" 
										/>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<div class="input-group" style="margin-top: 20px">
									<input type="submit"/>	
									<!-- <button class="btn btn-secondary" href="home.jsp"
											type="button">Login</button> -->
										<a href="WEB-INF/jsp/registration.jsp">Not yet
											Registered?Sign up here....</a>
									</div>
								</div>
							</div>
						</form:form>


					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Custom scripts for this template -->
	<script src="js/coming-soon.min.js"></script>
</body>
</html>
