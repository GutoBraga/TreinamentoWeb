<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@page import="com.prova.moduloweb.Modulo"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Lista de Lojas</title>
</head>
<body>
	<br>
	<h3 style="text-align:center">CONSULTA DE MODULOS</h3>
	<br>
	<table class="table" width="50%">
		<tr>
			<th>
				NIVELAMENTO
			</th>
			<th>
				INSTRUTOR TITULAR
			</th>
			<th>
				INSTRUTOR AUXILIAR
			</th>
			<th>
				DT_INICIO
			</th>
		</tr>
		
		<c:forEach var="modulo" items="${modulos}">
				<tr>
					<td><c:out value="${modulo.ds_nome}"></c:out>  </td>
					<td><c:out value="${modulo.ds_instrutor_titular}"></c:out>  </td>
					<td><c:out value="${modulo.ds_instrutor_auxiliar}"></c:out>  </td>
					<td><fmt:formatDate value="${modulo.dt_inicio}" pattern="dd/MM/yyyy"/> </td>
				</tr>
		</c:forEach>
	</table>
	
</body>
</html>