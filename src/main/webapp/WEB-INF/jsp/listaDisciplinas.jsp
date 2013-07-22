<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table cellspacing="10px;">
		<tr>
<!-- 			<th>ID</th> -->
			<th>Nome</th>
			<th>Professor</th>
		</tr>
		<c:forEach items="${disciplinas}" var="disciplina">
			<tr>
<%-- 				<td>${veiculo.id}</td> --%>
				<td align="center">${disciplina.nome}</td>
				<td align="center">${disciplina.nomeProfessor}</td>
				<td><a href="cadastraAtividade/${disciplina.nome}">Editar</a></td>
				
				
			 	
			
			</tr>
		</c:forEach>
	</table>


</body>
</html>