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
<%
	int no1 = 1;
	int no2 = 7;
	String[] genres = {"SF","판타지","수필","시","에세이"};
	request.setAttribute("no1", no1);
	request.setAttribute("no2", no2);
	request.setAttribute("genres", genres);
%>
<div class="container">
	<c:forEach var="x" begin="1" end="10" varStatus="y" step="2">
		<p>${x }번 실행 ${y.index } ${y.count } ${y.first } ${y.last }</p>
	</c:forEach>
	<br/>
	<c:forEach var="x" begin="1" end="10" varStatus="y" step="2">
		<c:choose>
			<c:when test="${y.count mod 2 eq 0 }">
			<p class="bg-info">훔바훔바</p>
			</c:when>
			<c:otherwise>
				<p>훔바훔바</p>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<br/>
	<c:forEach begin="${no1 }" end="${no2 }">
		<p>콩까지마</p>
	</c:forEach>
	<br/>
	<c:forEach var="genre" items="${genres }">
		<p>${genre }</p>
	</c:forEach>
	
</div>
</body>
</html>