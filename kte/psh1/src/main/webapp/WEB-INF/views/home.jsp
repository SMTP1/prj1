<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="true" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="resources/css/bootstrap.css" />
	<link rel="stylesheet" href="resources/css/navbar.css" />
	<link rel="stylesheet" type="text/css" href="resources/css/component.css" />
	<link rel="stylesheet" type="text/css" href="resources/css/content.css" />
	<script src="resources/js/modernizr.custom.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<div class="row hidden-xs topper" style="margin-top:5px;margin-bottom:5px">
			<div class="col-xs-7 col-sm-7">
				<a href="//convertify.io"><img width="300px" am-TopLogo alt="SECUREVIEW"  src="http://blog.convertify.io/assets/images/logo--hero.png" class="img-responsive"></a>
			</div>
			
			<div class="col-xs-5 col-xs-offset-1 col-sm-5 col-sm-offset-0 text-right ">
				<c:if test="${sessionScope._email eq null}">
					<p><a href="login.do">로그인</a> / <a href="join.do">회원가입</a></p>
				</c:if>
				<c:if test="${sessionScope._email ne null}">
					<p>${sessionScope._name}님 로그인 / <a href="logout.do">로그아웃</a></p>
				</c:if>
			</div>
		</div>
	
		<!-- Navigation -->
		<div class="row">
			<nav class="navbar navbar-inverse" role="navigation">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand visible-xs-inline-block nav-logo" href="/"><img src="/images/logo-dark-inset.png" class="img-responsive" alt=""></a>
					</div>
				
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse navbar-ex1-collapse">
						<ul class="nav navbar-nav js-nav-add-active-class">
							<li><a href="/index.html">Home</a></li>
							<li class="active"><a href="/markets.html">Markets</a></li>
							<li><a href="test.do">test</a></li>
							<li><a href="board.do">board</a></li>
							<li><a href="/training.html">Training</a></li>
							<li><a href="/contact.html">Contact Us</a></li>
							<li class="visible-xs-block"><a href="/about.html">About Us</a></li>
							<li class="visible-xs-block"><a href="/careers.html">Careers</a></li>
							<li class="visible-xs-block"><a href="/press-release.html">Press Release</a></li>
							<li class="visible-xs-block"><a href="https://susteen7.zendesk.com/hc/en-us">Support</a></li>
							<li class="dropdown">
							    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Company <b class="caret"></b></a>
							    <ul class="dropdown-menu" role="menu">
									<li><a href="about.html">About Us</a></li>
									<li><a href="careers.html">Careers</a></li>
									<li><a href="press-release.html">Press Release</a></li>
							    </ul>
							</li>
						</ul>
						<ul class="nav navbar-nav navbar-right hidden-xs">
							<a type="button" class="navbar-btn btn btn-gradient-blue" am-latosans="bold" href="https://susteen7.zendesk.com/hc/en-us">Support</a>
						</ul>
					</div><!-- /.navbar-collapse -->
				</div>
			</nav>
		</div>
	</div>
<div class="bs-example">
    <!-- Button HTML (to Trigger Modal) -->
    <a href="#" class="btn btn-lg btn-primary" data-toggle="modal" data-target="#myModal">Launch Demo Modal</a>
    
    <!-- Modal HTML -->
    <div id="myModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
               <div class="container">
		<div class="card card-container" style="margin-top:30px">
			<h2 class='login_title text-center'>Login</h2>
			<hr>
			
			<form class="form-signin" action="login.do" method="post">
				<span id="reauth-email" class="reauth-email"></span>
				
				<p class="input_title">Email</p>
				<input type="text" name="email" id="inputEmail" class="login_box" placeholder="이메일" required autofocus>
				
				<p class="input_title">Password</p>
				<input type="password" name="pw" id="inputPassword" class="login_box" placeholder="암호" required>
				
				<div id="remember" class="checkbox">
					<label></label>
				</div>
				<input class="btn btn-lg btn-primary btn-block" type="submit" value="Login" />
			</form><!-- /form -->
		</div><!-- /card-container -->
    	</div><!-- /container -->
            </div>
        </div>
    </div>
</div>
</body>
</html>

