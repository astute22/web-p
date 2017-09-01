<%@page import="kr.co.jhta.board.dao.UserDao"%>
<%@page import="org.apache.commons.codec.digest.DigestUtils"%>
<%@page import="kr.co.jhta.board.vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String email = request.getParameter("email");
	
	User user = new User();
	
	user.setName(name);
	user.setId(id);
	user.setPw(DigestUtils.sha256Hex(pw));
	user.setEmail(email);
	
	UserDao userDao = new UserDao();
	User registeredUser = userDao.getUserById(id);
	
	if(registeredUser != null){
		response.sendRedirect("/simple-jsp-board/user/form.jsp?fail=1");
		return;
	}
	
	userDao.addUser(user);
	response.sendRedirect("success.jsp");
	
%>