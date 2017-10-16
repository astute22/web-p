<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
		Date today = new Date();
		request.setAttribute("today", today);
		
		request.setAttribute("amount", 1234567890.12345);
	%>
	<p>${today }</p>
	<p><fmt:formatDate value="${today }"/></p>
	<p><fmt:formatDate value="${today }" pattern="yy-MM-dd"/></p>
	<p><fmt:formatDate value="${today }" pattern="yy.MM.dd"/></p>
	<p><fmt:formatDate value="${today }" pattern="yy년 M월 d일"/></p>
	<p><fmt:formatDate value="${today }" pattern="yy년 M월 d일 EEEE"/></p>
	<p><fmt:formatDate value="${today }" pattern="yy년 M월 d일 EEEE a"/></p>
	<p><fmt:formatDate value="${today }" pattern="yy년 M월 d일 EEEE a h시"/></p>
	
	<p><fmt:formatNumber value="${amount }"/>
	<p><fmt:formatNumber value="${amount }" pattern="###"/>
	<p><fmt:formatNumber value="${amount }" pattern="#,###"/>
	<p><fmt:formatNumber value="${amount }" pattern="#,###.####"/>
	<p><fmt:formatNumber value="${amount }" pattern="#,###.#####"/>
	<p><fmt:formatNumber value="${amount }" pattern="#,###.00000000000000"/>
</div>
</body>
</html>