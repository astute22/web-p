<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="dao.TodoDao"%>
<%@page import="vo.Todo"%>
<%@ page language="java" contentType="text/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String title = request.getParameter("title");
	String dates = request.getParameter("dates");
	String contents = request.getParameter("contents");
	
	Todo todo = new Todo();
	TodoDao todoDao = new TodoDao();
	int no = todoDao.getNo();
	
	todo.setNo(no);
	todo.setTitle(title);
	todo.setDates(dates);
	todo.setContents(contents);
	
	todoDao.createTodo(todo);
	
	Todo outTodo = todoDao.getTodo(no);
	Map<String, Object> map = new HashMap<>();
	map.put("resultCode", "S");
	map.put("msg","성공");
	map.put("data",outTodo);
	
	
	Gson gson = new Gson();
	String jsonText = gson.toJson(map);
	out.write(jsonText);
	
%>