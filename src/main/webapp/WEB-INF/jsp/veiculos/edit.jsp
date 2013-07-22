<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Edita</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.min.js" type="text/javascript"></script>
    	<script src="/JScript/script.js" type="text/javascript"></script>
    	<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>

	<h1>Editar Veiculo</h1>
	<form:form action="../edit" method="post" commandName="veiculo">
		<form:hidden path="id" />
		<table>
			<tr>
				<td>Marca: <form:select path="marca">
								<form:option value="Honda" label="Honda" />
								<form:option value="Fiat" label="Fiat" />
								<form:option value="Ford" label="Ford" />
								<form:option value="Volks" label="Volks" />
								<form:option value="Chevrolet" label="Chevrolet" />
							</form:select>
				</td>
			</tr>
			<tr>
				<td>Tipo de Combustível: <form:select path="tipoDeCombustivel">
											<form:option value="GNV" label="GNV" />
											<form:option value="Diesel" label="Diesel" />
											<form:option value="Gasolina" label="Gasolina" />
											<form:option value="Alcool" label="Alcool" />
											<form:option value="Total Flex" label="Total Flex" />
										</form:select>
				</td>
			</tr>
			<tr>
				<td>Tipo do Veiculo:<form:select path="tipoDeVeiculo">
										<form:option value="Carro" label="Carro" />
										<form:option value="Caminhao" label="Caminhao" />
										<form:option value="Moto" label="Moto" />
									</form:select>
				</td>
			</tr>
			<tr>
				<td>Modelo: <form:input path="modelo" required="required" /></td>
			</tr>
			<tr>
				<td>Preco: <form:input path="preco" type="number" min="1" required="required" /></td>
			</tr>
			<tr>
				<td>Placa: <form:input path="placa" required="required" size="8" maxlength="8" /></td>
			</tr>
			<tr>
				<td>Status: <form:select path="status">
								<form:option value="Novo" label="Novo" />
								<form:option value="Usado" label="Usado" />
							</form:select>
				</td>
			</tr>
			<tr>
				<td>Fotos: 
						<c:if test="${empty listaFotos}">
							<span class="fotosbox1">
                		    	<form:input path="fotos" maxlength="25"/>
                	    	</span>
						</c:if>
						<c:forEach items="${listaFotos}" var="item" varStatus="index">
							<span class="fotosbox${index.count}">
                		    	<form:input value="${item}" path="fotos" maxlength="25"/>
                	    	</span>  
						</c:forEach>
                	 	<input type="button" id="duplica" value="+"/>
                </td>
			</tr>
		</table>
		<input type="submit"/>
	</form:form>
	
	<b><a href="../lista">Voltar</a></b>
</body>
</html>