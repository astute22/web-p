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
	String[] movies = {"살인자의 기억법","그 것","킬러의 보디가드","택시운전사","청년경찰"};
	request.setAttribute("movies", movies);
%>
	<h1>forEach 태그</h1>
	<table class="table">
		<thead>
			<tr>
				<th>순위</th>
				<th>제목</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="movie" items="${movies }" varStatus="y">
				<tr>
					<td>${y.count }</td>
					<td>${movie }</td>
				</tr>	
			</c:forEach>
		</tbody>
	</table>
		
</div>
</body>
</html>