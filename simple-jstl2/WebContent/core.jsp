<%@page import="vo.product"%>
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
<%
	request.setAttribute("msg", "앙녕앙녕");
	request.setAttribute("contents", "<button>버튼 함 눌러볼래용?</button>");
	int score = 99;
	request.setAttribute("score", score);
	String[] books = {"더로그", "월야환담", "눈물을 마시는 새", "드래곤라자"};
	request.setAttribute("books", books);
	List<product> products = new ArrayList<>();
	products.add(new product(100,"빠삐코",1000, "롯데삼강"));
	products.add(new product(101,"붕어싸만코",1500, "롯데삼강"));
	products.add(new product(102,"꽃게랑",1000, "롯데삼강"));
	products.add(new product(103,"부라보콘",1500, "해태"));
	products.add(new product(104,"하겐다즈",3500, "하겐다즈"));
	products.add(new product(105,"엑설런트",10000, "빙그레"));
	request.setAttribute("products", products);
%>
<div class="container">
 <h1>코어 태그 라이브러리</h1>
 <h3>아웃 태그</h3>
 <pre>
 	값을 표현하는 태그
 </pre>
 <p>자바코드로 표현 : <%
 	String txt = (String) request.getAttribute("msg");
 %><%=txt %></p>
 <p>EL로 표현 : ${msg }</p>
 <p>JSTL로 표현 : <c:out value="${msg }"></c:out></p>
  <p>자바코드로 표현 : <%
 	String txt2 = (String) request.getAttribute("contents");
 %><%=txt2 %></p>
 <p>EL로 표현 : ${contents }</p>
 <p>JSTL로 표현 : <c:out value="${contents }"></c:out></p>
 <h3>if 태그</h3>
 <pre>
 	java의 if문을 흉내내는 태그
 	if 태그의 test 속성값이 true인 경우 if 태그 내부 컨텐츠가 처리됨
 	else는 없음
 </pre>
 <c:if test="${not empty msg }">
 	<p>test 속성의 연산결과가 참일경우 이 글이 보임</p>
 </c:if>
  <h1>choose, when, otherwise 태그</h1>
	<c:choose>
		<c:when test="${score ge 70}">합격
			<c:choose>
		<c:when test="${score ge 98}"><p>전액장학금</p></c:when>
		<c:when test="${score ge 95}"><p>반액장학금</p></c:when>
		<c:when test="${score ge 90}"><p>기성회비 면제</p></c:when>
		<c:when test="${score ge 70}"><p>장학금 없음</p></c:when></c:choose></c:when>
		<c:otherwise><p>불합격</p></c:otherwise>
	</c:choose>
	<h3>forEach tag</h3>
	<pre>반복작업 수행</pre>
	<c:forEach var="b" items="${books }">
		<p>${b }</p>
	</c:forEach>
		<table class="table">
			<thead>
				<tr>
					<th>판매순위</th>
					<th>상품번호</th>
					<th>이름</th>
					<th>가격</th>
					<th>제조사</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${products }" varStatus="x">
				<tr class="${p.price ge 10000 ? 'danger' : ''}">
					<td>${x.count }</td>
					<td>${p.no }</td>
					<td>${p.name }</td>
					<td>${p.price }</td>
					<td>${p.maker }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<ul class="pagination">
			<c:forEach var="n" begin="1" end="10" varStatus="x">
				<c:choose>
					<c:when test="${x.first ||x.last }">
						<li class="disabled"><a href="" >${n}</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="" >${n}</a></li>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</ul>
		<h3>set, remove (변수 선언 삭제)</h3>
		<pre>
			변수의 선언/삭제를 흉내낸다.
		</pre>
		<c:set var="hobbys" value=" 게임, 영화, 운동, 독서"></c:set>
			<p>${hobbys }</p>
		<%--<c:remove var="hobbys"/>
			<p>${hobbys }</p> --%>
		<h3>for Tokens 태그</h3>
		<c:forTokens var="h" items="${hobbys }" delims=",">
			<p><input type="checkbox">${h }</p>
		</c:forTokens>
</div>
</body>
</html>