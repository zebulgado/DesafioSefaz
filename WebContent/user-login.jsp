<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Welcome App</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand">Menu de Usuário</a>
			<div id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page"
						href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/user?action=list">Lista</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/user?action=new">Novo</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="text-center container">
		<div class="text-center container">
			<form class="row g-3"
				action="${pageContext.request.contextPath}/user?action=validate"
				method="post">
				<div class="col-md-6">
					<label for="inputEmail" class="form-label">Email</label> <input
						type="text" class="form-control" id="inputEmail" name="email"
						value="<c:out value='${user.email}' />">
				</div>
				<div class="col-md-6">
					<label for="inputPassword4" class="form-label">Password</label> <input
						type="password" class="form-control" id="inputPassword4"
						name="password" value="<c:out value='${user.password}' />">
				</div>
				<div class="col-12">
					<button type="submit" class="btn btn-primary">Entrar</button>
				</div>
			</form>
		</div>
	</div>
	<div class="toast" role="alert" aria-live="assertive"
		aria-atomic="true">
		<div class="toast-header">
			<img src="..." class="rounded me-2" alt="..."> <strong
				class="me-auto">Bootstrap</strong> <small>11 mins ago</small>
			<button type="button" class="btn-close" data-bs-dismiss="toast"
				aria-label="Close"></button>
		</div>
		<div class="toast-body">Hello, world! This is a toast message.</div>
	</div>
</body>
</html>