<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Galeria de Fotos</title>
	</head>
	<h1 align="center">Galeria</h1>
	<body>
 		<c:forEach items="${listFotos}" var="item">
<%--  		<input value="${item}" height="500px" width="500px"/><br/> --%>
			<img src="${item}" height="500px" width="500px"/></br></br></br>
 		</c:forEach>
		</br>
		</br>
		</br>
		<b><a href="javascript:history.go(-1)">Voltar</a></b>
	</body>
</html>