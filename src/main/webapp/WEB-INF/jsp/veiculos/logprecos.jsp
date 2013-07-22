<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>LOG</h1>
	<c:forEach items="${loogs}" var="l">
		<p>${l} </p>
	</c:forEach>
	
</body>
</html>