<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
	<head>
		<title>Descricao</title>
	</head>
	<body>
		<table cellspacing="20px;">
		<tr>
			<th>ID</th>
			<th>Marca</th>
			<th>Modelo</th>
			<th>Placa</th>
			<th>Tipo</th>
			<th>Preço</th>
			<th>Combustivel</th>
			<th>Status</th>
		</tr>
		
			<tr>
				<td>${veiculo.id}</td>
				<td>${veiculo.marca}</td>
				<td>${veiculo.modelo}</td>
				<td>${veiculo.placa}</td>
				<td>${veiculo.tipoDeVeiculo}</td>
				<td>${veiculo.preco}</td>
				<td>${veiculo.tipoDeCombustivel}</td>
				<td>${veiculo.status}</td>
<%-- 				<td><img src="${veiculo.fotos}" height="100px" width="150px"/></td> --%>
				<td><a href="../galeria/${veiculo.id}">Galeria</a></td>
			</tr>
		
	</table>
	<b><a href="../lista">Voltar</a></b>
		
	</body>
</html>