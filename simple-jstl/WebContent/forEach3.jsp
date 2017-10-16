<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

<div class="container">
<%!
public class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Score(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName(){
		return name;
	}
	public int getKor(){
		return kor;
	}
	public int getEng(){
		return eng;
	}
	public int getMath(){
		return math;
	}
}
%>
<%
	List<Score> scoreList = new ArrayList<>();
	scoreList.add(new Score("린가드",70,100,50));
	scoreList.add(new Score("스콜스",80,100,80));
	scoreList.add(new Score("램파드",80,100,85));
	scoreList.add(new Score("제라드",90,100,90));
	scoreList.add(new Score("즐라탄",100,100,100));
	
	request.setAttribute("scoreList", scoreList);
%>
<table class="table">
	<thead>
		<tr>
			<th>순번</th>
			<th>이름</th>
			<th>국어</th>
			<th>영어</th>
			<th>수학</th>
			<th>총점</th>
			<th>평균</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="score" items="${scoreList }" varStatus="y">
			<tr>
				<td>${y.count }</td>
				<td>${score.name }</td>
				<td>${score.kor }</td>
				<td>${score.eng }</td>
				<td>${score.math }</td>
				<td>${score.kor + score.eng + score.math }</td>
				<td><fmt:formatNumber value="${(score.kor + score.eng + score.math) div 3 }" pattern="###.0"/></td>
			</tr>f
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>