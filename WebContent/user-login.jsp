<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Welcome App</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	  <div class="container-fluid">
	    <a class="navbar-brand">Menu de Usuário</a>
	    <div id="navbarSupportedContent">
	      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/index.jsp">Home</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="${pageContext.request.contextPath}/user-list.jsp">Lista</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="${pageContext.request.contextPath}/user-new.jsp">Novo</a>
	        </li>
	      </ul>
	    </div>
	  </div>
	</nav>
	<div class="text-center container">
		<h1 class="display-1">Bem Vindo!</h1>
		<div class="btn-group-vertical">
			<a class="btn btn-primary" href="#" role="button">Fazer Login</a>
			<a class="btn btn-primary" href="${pageContext.request.contextPath}/user-list.jsp" role="button">Listar</a>
			<a class="btn btn-primary" href="${pageContext.request.contextPath}/user-new.jsp" role="button">Novo</a>
			<a class="btn btn-primary" href="${pageContext.request.contextPath}/user-update.jsp" role="button">Alterar</a>
			<a class="btn btn-primary" href="#" role="button">Remover</a>
		</div>
	</div>
</body>
</html>