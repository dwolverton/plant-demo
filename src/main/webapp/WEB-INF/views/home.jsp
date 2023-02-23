<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Plants</title>
</head>
<body>
	<h1>Hello World</h1>
	
	<ul>
		<c:forEach var="plant" items="${plants}">
			<li>${ plant.name } - ${ plant.height }ft</li>
		</c:forEach>
	</ul>
</body>
</html>