<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>Bootstrap Example</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<fmt:bundle basename="i18n.messages">
	<div class="container">
		<h1><fmt:message key="label.form.title" /></h1>
		<c:choose>
			<c:when test="${empty param.pno}">
				<c:set var="path" value="add.do"/>
			</c:when>
			<c:otherwise>
				<c:set var="path" value="reply.do?pno=${param.pno}"/>
			</c:otherwise>
		</c:choose>
		<form method="post" action="${path }" class="well">
			<div class="form-group">
				<label><fmt:message key="label.title" /></label> <input type="text" class="form-control"
					name="boardtitle" placeholder="<fmt:message key="msg.title" />"/>
			</div>
			<div class="form-group">
				<label><fmt:message key="label.writer" /></label> <input type="text" class="form-control"
					name="boardwriter" placeholder="<fmt:message key="msg.writer" />"/>
			</div>
			<div class="form-group">
				<label><fmt:message key="label.contents" /></label>
				<textarea class="form-control" name="boardcontents" rows="6" placeholder='<fmt:message key="msg.contents" />'></textarea>
			</div>
			<div class="form-group text-right">
				<a href="list.do" class="btn btn-danger"><fmt:message key="label.button.cancel" /></a>
				<button type="submit" class="btn btn-primary"><fmt:message key="label.button.save" /></button>
			</div>
		</form>
	</div>
</fmt:bundle>
</body>
</html>