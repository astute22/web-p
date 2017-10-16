<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <title>Bootstrap Example</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<%
	int score = 83;
	request.setAttribute("score", score);
%>	
	<h1>choose, when, otherwise 태그</h1>
	<c:choose>
		<c:when test="${score ge 90}"><p>A</p></c:when>
		<c:when test="${score ge 80}"><p>B</p></c:when>
		<c:when test="${score ge 70}"><p>C</p></c:when>
		<c:when test="${score ge 60}"><p>D</p></c:when>
		<c:otherwise><p>F</p></c:otherwise>
	</c:choose>
</div>
</body>
</html>