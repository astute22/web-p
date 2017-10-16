<%@page import="java.util.Map"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.HashMap"%>
<%@page import="vo.Todo"%>
<%@page import="java.util.List"%>
<%@page import="dao.TodoDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	TodoDao tododao = new TodoDao();
	tododao.deleteTodo(no);
	List<Todo> todos = tododao.getTodos();
	
	Map<String, Object> map = new HashMap<>();
	map.put("resultCode", "S");
	map.put("msg","성공");
	map.put("data",todos);
	
	Gson gson = new Gson();
	String jsonText = gson.toJson(map);
	out.write(jsonText);
%>