<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Axavi Mobiles</title>
    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:200,200i,300,300i,400,400i,600,600i,700,700i,900,900i" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Merriweather:300,300i,400,400i,700,700i,900,900i" rel="stylesheet">
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template -->
    <link href="css/coming-soon.min.css" rel="stylesheet">


	<script type="text/javascript" src="resources/login.js"></script>
  </head>
  <body>
    <div class="overlay"></div>
    <video playsinline="playsinline" autoplay="autoplay" muted="muted" loop="loop">
      <source src="mp4/bg.mp4" type="video/mp4">
    </video>

    <div class="masthead">
      <div class="masthead-bg"></div>
      <div class="container h-100">
        <div class="row h-100">
          <div class="col-12 my-auto">
            <div class="masthead-content text-white py-5 py-md-0">
             
             <form method="post" id="regfrm" action="UserController">
             	 <h1 class="mb-3">Sign up</h1>
             	<div class="row"> 
              		<div class="col-md-12">
              			<div class="input-group input-group-newsletter" style="margin-top: 20px">
                		<input type="email" class="form-control" id="email" placeholder="Your Email Please..." aria-label="Your Email Please..." aria-describedby="basic-addon">
               			</div>
               		</div>
               	</div>
               <div class="row">
              		<div class="col-md-12">
               			<div class="input-group input-group-newsletter" style="margin-top: 20px">
                			<input type="password" class="form-control" id="pswd" placeholder="Your Password Please..." aria-label="Your Password Please..." aria-describedby="basic-addon">
               			</div>
               		</div>
               	</div>
              	<div class="row">
              		<div class="col-md-12">
               			<div class="input-group" style="margin-top: 20px">
                  			<button class="btn btn-secondary" type="button" id="login">Signup</button>
                		<a href="startup.jsp">Already Registered?Login here....</a>
                		</div>
                	</div>
                </div>
                </form>
                
                
              </div>
            </div>
          </div>
        </div>
      </div>