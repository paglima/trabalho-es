<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
	<head>
		<title>Trabalho ES</title>
		<link rel="stylesheet" type="text/css" href="css/form-login.css">
		
	</head>
		<body> 
			<div class="container">
				<section id="content">
					<form action="j_spring_security_check" method="post">
						<h1>Login</h1>
						<div>
							<input type="text" placeholder="Username" required="" id="username" name="j_username" />
						</div>
						<div>
							<input type="password" placeholder="Password" required="" id="password" name="j_password"/>
						</div>
						<div>
							<input type="submit" value="Log in" />
							<a href="cadastraAluno">Cadastre-se!</a>
						</div>
					</form><!-- form -->
					
				</section><!-- content -->
			</div><!-- container -->
	</body>
</html>