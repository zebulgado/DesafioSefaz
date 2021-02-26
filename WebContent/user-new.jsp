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
	          <a class="nav-link" href="${pageContext.request.contextPath}/user?action=list">Lista</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link active" href="${pageContext.request.contextPath}/user?action=new">Novo</a>
	        </li>
	      </ul>
	    </div>
	  </div>
	</nav>
	<div class="text-center container">
		<form class="row g-3">
		  <div class="col-12">
		    <label for="inputname" class="form-label">Nome</label>
		    <input type="text" class="form-control" id="inputname">
		  </div>
		  <div class="col-md-6">
		    <label for="inputEmail" class="form-label">Email</label>
		    <input type="text" class="form-control" id="inputEmail" placeholder="email@email.com">
		  </div>
		  <div class="col-md-6">
		    <label for="inputPassword4" class="form-label">Password</label>
		    <input type="password" class="form-control" id="inputPassword4">
		  </div>
		  <div class="col-md-2">
		    <label for="inputDdd" class="form-label">DDD</label>
		    <input type="text" class="form-control" id="inputDdd">
		  </div>
		  <div class="col-md-4">
		    <label for="inputPhone" class="form-label">Telefone</label>
		    <select id="inputPhone" class="form-select">
		      <option selected>Choose...</option>
		      <option>...</option>
		    </select>
		  </div>
		  <div class="col-md-6">
		    <label for="inputPhoneType" class="form-label">Descrição do telefone</label>
		    <input type="text" class="form-control" id="inputPhoneType">
		  </div>
		  <div class="col-12">
		    <button type="submit" class="btn btn-primary">Criar</button>
		  </div>
		</form>
	</div>
</body>
</html>