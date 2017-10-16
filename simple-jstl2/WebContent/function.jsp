<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
	String txt = "한 권으로 끝내는 nodejs and express";
	request.setAttribute("txt", txt);
	
	String filename = "tmp.mp4";
	request.setAttribute("filename", filename);
	
	String menus = "라면, 떡볶이, 우동, 쫄면, 비빔국수, 군만두, 김밥, 볶음밥";
	request.setAttribute("menus", menus);
	
	String contents = "<button>버튼</button>";
	request.setAttribute("contents", contents);
	
	List<String> names = Arrays.asList("임요환","홍진호","박정석","이영호","강민");
	request.setAttribute("names", names);
%>
	<h1>function 태그</h1>
	<p>길이 : ${fn:length(txt) }</p>
	<p>잘라내기 : ${fn:substring(txt,0,10) }</p>
	<c:choose>
		<c:when test="${fn:length(txt) gt 20 }">
			<p>${fn:substring(txt,0,17) }...</p>
		</c:when>
		<c:otherwise>
			<p>${txt }</p>
		</c:otherwise>
	</c:choose>
	<p>대문자로 : ${fn:toUpperCase(txt) }</p>
	<p>소문자로 : ${fn:toLowerCase(txt) }</p>
	<p>바꾸기 : ${fn:replace(txt,"끝내는", "줘패는") }</p>
	<p>포함여부 : ${fn:contains(txt,'node') }</p>
	<p>포함여부 : ${fn:contains(txt,'Node') }</p>
	<p>포함여부 : ${fn:containsIgnoreCase(txt,'node') }</p>
	<p>위치 : ${fn:indexOf(txt,'권') }</p>
	<p>시작하나 : ${fn:startsWith(txt,'한') }</p>
	<p>끝나나 : ${fn:endsWith(txt,'끝') }</p>
	
	<c:choose>
		<c:when test="${fn:endsWith(filename, 'png') }">
			<span class="glyphicon glyphicon-picture"></span>
		</c:when>
		<c:when test="${fn:endsWith(filename, 'doc') }">
			<span class="glyphicon glyphicon-file"></span>
		</c:when>
		<c:when test="${fn:endsWith(filename, 'mp4') }">
			<span class="glyphicon glyphicon-facetime-video"></span>
		</c:when>
	</c:choose>
	<ul>
	<c:forEach var="menu" items="${fn:split(menus,',') }">
		<li>${menu }</li>
	</c:forEach>
	</ul>
	<p>${fn:join(fn:split(menus,','),'-') }</p>
	
	<p>${contents }</p>
	<p>${fn:escapeXml(contents) }</p>
	
	<p>${fn:length(names) }</p>
</div>
</body>
</html>