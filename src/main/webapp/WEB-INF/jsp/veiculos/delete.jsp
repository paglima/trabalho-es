<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
        <title>Veiculos</title>
    </head>
    <body>
		<h1>Remover Veiculos</h1>
        <form:form action="../delete" method="post" commandName="veiculo">
        	<form:hidden path="id"/>
            <h2>Tem certeza que dezeja remover o veiculo <span style="color:red">${veiculo.marca} ${veiculo.modelo}</span>?</h2>
			<input type="submit" value="Remover">
        </form:form>
        
        <b><a href="../lista">Voltar</a></b>
    </body>
</html>