<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		private String directory = "c:/temp";
		public String getStringDate(Date date){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(date);
		}
	%>
	<%
		//자바 코딩 영역이 됨
		int x = 10;
		int y = 20;
		int z = 30;
		Date today = new Date();
	%>
	<%-- <p><%=x %></p> --%>
	<p><%=y %></p>
	<p><%=z %></p>
	<p>현재시간 : <%=getStringDate(today) %></p>
</body>
</html>