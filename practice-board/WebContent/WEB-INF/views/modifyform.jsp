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
		<form method="post" action="modifyout.do?no=${board.no }" class="well">
			<div class="form-group">
				<label><fmt:message key="label.title" /></label> <input type="text" class="form-control"
					name="boardtitle" value="${board.title }"/>
			</div>
			<div class="form-group">
				<label><fmt:message key="label.writer" /></label> <input type="text" class="form-control"
					name="boardwriter" value="${board.writer }"/>
			</div>
			<div class="form-group">
				<label><fmt:message key="label.contents" /></label>
				<textarea class="form-control" name="boardcontents" rows="6">${board.contents }</textarea>
			</div>
			<div class="form-group text-right">
				<a href="detail.do?no=${board.no }" class="btn btn-danger"><fmt:message key="label.button.cancel" /></a>
				<button type="submit" class="btn btn-primary"><fmt:message key="label.button.save" /></button>
			</div>
		</form>
	</div>
</fmt:bundle>
</body>
</html>