<%@page import="kr.co.jhta.board.vo.Comments"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.jhta.board.utils.DateUtils"%>
<%@page import="kr.co.jhta.board.vo.Board"%>
<%@page import="kr.co.jhta.board.dao.BoardDao"%>
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
<%
	pageContext.setAttribute("cp", "b");
%>
<%@ include file="../common/navi.jsp"%>
<%
	int no = Integer.parseInt(request.getParameter("bno"));
	
	BoardDao boardDao = new BoardDao();
	
	//글정보
	Board board = boardDao.getBoardByNo(no);
	//댓글정보
	List<Comments> commentList = boardDao.getCommentsByBoardNo(no);
%>
<div class="container">
	<div class="row">
		<h1 class="well">자유 게시판</h1>
	</div>
	<div class="panel panel-default">
		<table class="table">
			<colgroup>
				<col width="15%">
				<col width="20%">
				<col width="15%">
				<col width="20%">
				<col width="15%">
				<col width="15%">
			</colgroup>
			<tbody>
				<tr>
					<th>제목</th>
					<td colspan="5"><%=board.getTitle() %></td>
				</tr>
				<tr>
					<th>작성자</th>
					<td><%=board.getWriter().getName() %></td>
					<th>날짜</th>
					<td><%=DateUtils.yyyymmddhhmmss(board.getCreateDate()) %></td>
					<th>추천수</th>
					<td><%=board.getLikes() %></td>
				</tr>
				<tr>
					<td colspan="6">
						<%=board.getContentsWithBr() %>
					</td>
				</tr>
			</tbody>
		</table>
		<div class="panel-footer">
			<%
				if(loginUser != null){
					String loginUserId = loginUser.getId();
					if(!loginUserId.equals(board.getWriter().getId())){
			%>
						<a href="likes.jsp?bno=<%=no %>" class="btn btn-success btn-sm">추천</a>
			<%		} else {
				
			%>
						<a href="delete.jsp?bno=<%=no %>" class="btn btn-danger btn-sm pull-right">삭제</a>
			<%
					}
				}
			%>
			
			
			<a href="index.jsp" class="btn btn-primary btn-sm pull-right">목록</a>
		</div>
	</div>
	<div class="row">
		<form class="form-horizontal" method="post" action="addComment.jsp">
			<input type="hidden" name="bno" value="<%=board.getNo() %>">
			<div class="form=group">
				<div class="col-sm-offset-1 col-sm-9">
					<textarea rows="1" class="form-control" name="contents"></textarea>
				</div>
				<div class="com-sm-2">
					<button type="submit" class="btn btn-default">등록</button>
				</div>
			</div>
		</form>
	</div>
	<br/>
	<div class="row col-sm-offset-1 col-sm-9">
		<ul class="list-group">
		<%
			for( Comments comments : commentList){	
		%>
				<li class="list-group-item">
					<p class="list-group-item-text"><%=comments.getContents() %></p>
					<p class="list-group-item-text text-right">
						<small><%=DateUtils.yyyymmddhhmmss(comments.getCreatedate()) %></small>
						<span class="label label-default"><%=comments.getWriter().getId() %></span></p>
				</li>
		<%	} %>
		</ul>
	</div>
</div>
</body>
</html>