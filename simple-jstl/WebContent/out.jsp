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
	request.setAttribute("username", "호날두");

	String txt = "<script>function f(){ alert('메구니토');}</script><button onclick='f();'>클릭</button>";
	request.setAttribute("txt", txt);
%>
<h1>out 태그</h1>
<p>이름 : ${username }</p>
<p>이름 : <c:out value="${username }"/> </p>
<p>${txt }</p>
<p><c:out value="${txt }"/></p>
</div>
</body>
</html>