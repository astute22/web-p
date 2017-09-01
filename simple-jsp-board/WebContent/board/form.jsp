<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<%
		pageContext.setAttribute("cp", "b");
	%>
	<%
		//로그인 되지않은 사용자가 접근했을 때 로그인 후 되돌아갈 url 지정
		pageContext.setAttribute("url", "/simple-jsp-board/board/form.jsp");
	%>
	<%@ include file="../common/logincheck.jsp" %>
	<%@ include file="../common/navi.jsp"%>
	<div class="container">
		<div class="row">
			<h1 class="well">자유 게시판</h1>
		</div>
		<div class="row">
			<form class="well" method="post" action="add.jsp">
				<div class="form-group">
					<label>제목</label> 
					<input type="text" class="form-control"	name="title" />
				</div>
				<div class="form-group">
					<label>내용</label>
					<textarea rows="10" class="form-control" name="contents"></textarea>
				</div>
				<div class="form-group text-right">
					<a href="/simple-jsp-board/board/index.jsp"
						class="btn btn-warning btn-sm">취소</a>
					<button type="submit" class="btn btn-primary btn-sm">등록</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>