<%@page import="kr.co.jhta.board.utils.DateUtils"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.jhta.board.dao.BoardDao"%>
<%@page import="kr.co.jhta.board.vo.Board"%>
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
	<%@ include file="../common/navi.jsp"%>
	<div class="container">
		<div class="row">
			<h1 class="well">자유 게시판</h1>
			<div class="panel panel-default">
				<table class="table table-condensed table-hover">
					<thead>
						<tr>
							<th>번호</th>
							<th>제목</th>
							<th>작성자</th>
							<th>날짜</th>
							<th>추천</th>
						</tr>
					</thead>
					<tbody>
						<%
							BoardDao boardDao = new BoardDao();
							List<Board> boards = boardDao.getBoards();

							for (Board board : boards) {
						%>
						<tr>
							<td><%=board.getNo()%></td>
							<td><a href="detail.jsp?bno=<%=board.getNo()%>"><%=board.getTitle()%></a></td>
							<td><%=board.getWriter().getName()%></td>
							<td><%=DateUtils.yyyymmddhhmmss(board.getCreateDate())%></td>
							<td><%=board.getLikes()%></td>
						</tr>
						<%
							}
						%>
					</tbody>
				</table>
				<div class="panel-body text-center">
					<ul class="pagination">
						<li><a href="#">&laquo</a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#">&raquo</a></li>
					</ul>
					<a href="form.jsp" class="btn btn-primary btn-sm pull-right">글쓰기</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>