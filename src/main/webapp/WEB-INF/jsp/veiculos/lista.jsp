<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Veiculos</title>
</head>
<body>
	<h1>Veiculos</h1>

	<table cellspacing="10px;">
		<tr>
<!-- 			<th>ID</th> -->
			<th>Marca</th>
			<th>Modelo</th>
			<th>Placa</th>
		</tr>
		<c:forEach items="${lista}" var="veiculo">
			<tr>
<%-- 				<td>${veiculo.id}</td> --%>
				<td align="center">${veiculo.marca}</td>
				<td align="center">${veiculo.modelo}</td>
				<td align="center">${veiculo.placa}</td>
			 
 				<td><a href="delete/${veiculo.id}">Remover</a></td>
 				<td><a href="edit/${veiculo.id}">Editar</a></td>
 				<td><a href="description/${veiculo.id}">Descrição</a></td>
			
			</tr>
		</c:forEach>
	</table>
	
	<b><a href="cadastro" >Novo</a></b>
</body>
</html>