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
	          <a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/index.jsp">Home</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link active" href="${pageContext.request.contextPath}/user-list.jsp">Lista</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="${pageContext.request.contextPath}/user-new.jsp">Novo</a>
	        </li>
	      </ul>
	    </div>
	  </div>
	</nav>
	<div class="text-center container">
		<h1 class="display-5">Lista de Usuários</h1>
			<table class="table table-striped">
				<tr>
	                <th scope="col">Nome</th>
	                <th scope="col">Email</th>
	                <th scope="col">Senha</th>
	                <th scope="col">Telefone</th>
	                <th scope="col">Descrição</th>
            	</tr>
			</table>
	</div>
</body>
</html>