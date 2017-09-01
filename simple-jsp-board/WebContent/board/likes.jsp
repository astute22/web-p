<%@page import="kr.co.jhta.board.vo.Board"%>
<%@page import="kr.co.jhta.board.dao.BoardDao"%>
<%@page import="kr.co.jhta.board.vo.Likes"%>
<%@page import="kr.co.jhta.board.vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("url", "/simple-jsp-board/board/index.jsp");
%>
<%@ include file="../common/logincheck.jsp" %>
<%
	int no = Integer.parseInt(request.getParameter("bno"));

	User loginUser = (User) session.getAttribute("loginUser");
	
	Likes likes = new Likes();
	likes.setUserId(loginUser.getId());
	likes.setBoardNo(no);
	
	BoardDao boardDao = new BoardDao();
	
	Board board = boardDao.getBoardByNo(no);
	
	//글작성자와 로그인한 사용자가 같은지 체크
	if(board.getWriter().getId().equals(loginUser.getId())){
		response.sendRedirect("detail.jsp?bno="+no);
		return;
	}
	
	int likesCount = boardDao.getLikes(likes);
	//이미 추천한 글인지 체크
	if(likesCount>0){
		response.sendRedirect("detail.jsp?bno="+no);
		return;
	}
	
	boardDao.addLikes(likes);
	response.sendRedirect("detail.jsp?bno="+no);
%>