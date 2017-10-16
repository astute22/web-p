<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		String clientIp = request.getRemoteAddr();
		String localeName = request.getLocale().getCountry();
		String queryString = request.getQueryString();
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String contentType = request.getContentType();
	%>
	<p><%=clientIp %></p>
	<p><%=localeName %></p>
	<p><%=queryString %></p>
	<p><%=requestURI %></p>
	<p><%=contextPath %></p>
	<p><%=contentType %></p>
	
	<h1>EL표현식으로 표현</h1>
	<p>${pageContext.request.remoteAddr }</p>
	<p>${pageContext.request.locale.country }</p>
	<p>${pageContext.request.queryString}</p>
	<p>${pageContext.request.contextPath}</p>
	<p>${pageContext.request.contentType}</p>
</div>
</body>
</html>