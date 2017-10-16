<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="dao.TodoDao"%>
<%@page import="vo.Todo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	TodoDao todoDao = new TodoDao();
	List<Todo> todos = todoDao.getTodos();
	
	Map<String, Object> map = new HashMap<>();
	map.put("resultCode", "S");
	map.put("msg","성공");
	map.put("data",todos);
	
	Gson gson = new Gson();
	String jsonText = gson.toJson(map);
	out.write(jsonText);
	
%>