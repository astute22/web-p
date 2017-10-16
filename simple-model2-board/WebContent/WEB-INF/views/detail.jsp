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
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<fmt:bundle basename="i18n.messages">
<div class="container">
	<h1>글 정보</h1>
	<table class="table tavle-condensed">
	<colgroup>
	<col width="20%">
	<col width="*">
			<tr>
				<th><fmt:message key="label.no" /></th>
				<td>${board.no}</td>
				<th><fmt:message key="label.createdate" /></th>
				<td><fmt:formatDate value="${board.createdate}" pattern="yyyy.MM.dd HH:mm:ss"/></td>
			</tr>
			<tr>
				<th><fmt:message key="label.title" /></th>
				<td><c:out value="${board.title}" /></td>
				<th><fmt:message key="label.writer" /></th>
				<td>${board.writer}</td>
			</tr>
			<tr>
				<th><fmt:message key="label.contents" /></th>
				<td colspan="3"><textarea rows="10" class="form-control" readonly="readonly"><c:out value="${board.contents}" /></textarea></td>
			</tr>
		</tbody>
	</table>
	<hr/>
	<div class="row text-right">
		<a href="modifyin.do?no=${board.no }" class="btn btn-warning"><fmt:message key="label.button.modify" /></a>
		<a href="del.do?no=${board.no }" class="btn btn-danger"><fmt:message key="label.button.delete" /></a>
		<a href="list.do" class="btn btn-primary"><fmt:message key="label.list.title" /></a>
	</div>
</div>
</fmt:bundle>
</body>
</html>