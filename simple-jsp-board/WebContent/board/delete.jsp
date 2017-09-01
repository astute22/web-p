<%@page import="kr.co.jhta.board.vo.Board"%>
<%@page import="kr.co.jhta.board.vo.User"%>
<%@page import="kr.co.jhta.board.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<%
	pageContext.setAttribute("url", "/simple-jsp-board/board/index.jsp");
%>
<%@ include file="../common/logincheck.jsp" %>
<%
	int no = Integer.parseInt(request.getParameter("bno"));

	BoardDao boardDao = new BoardDao();
	Board board = boardDao.getBoardByNo(no);
	
	//글 작성자와 로그인한 사용자가 동일한 사용자인지 체크
	User loginUser = (User) session.getAttribute("loginUser");
	if(board.getWriter().getId().equals(loginUser.getId())){
		boardDao.inactiveBoard(no);	
	}
	response.sendRedirect("index.jsp");
%>