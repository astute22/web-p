<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Map<String, Object> map = new HashMap<>();
	map.put("pages",10);
	map.put("rows",95);
	map.put("sort-by","title");
	map.put("order","asc");
	
	request.setAttribute("map", map);
	
%>
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
	<h1>EL 표현식 연습</h1>
	<h3>속성으로 저장된 Map객체의 값 표현</h3>
	<p>${map.pages }</p>
	<p>${map.rows }</p>
	<p>${map["sort-by"] }</p>
	<p>${map.order }</p>
</div>
</body>
</html>