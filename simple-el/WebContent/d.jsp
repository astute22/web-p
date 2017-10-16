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

<div class="container">
	<h1>EL로 요청 파라미터값 표현</h1>
	<p>현재 페이지 번호 : ${not empty param.pageNo ? param.pageNo : 1}</p>
	<p>페이지번호</p>
	<ul class="pagination">
		<li class="${(empty param.pageNo or param.pageNo eq 1)? 'active' : ''}"><a href="d.jsp?pageNo=1">1</a></li>
		<li class="${param.pageNo eq 2? 'active' : ''}"><a href="d.jsp?pageNo=2">2</a></li>
		<li class="${param.pageNo eq 3? 'active' : ''}"><a href="d.jsp?pageNo=3">3</a></li>
		<li class="${param.pageNo eq 4? 'active' : ''}"><a href="d.jsp?pageNo=4">4</a></li>
		<li class="${param.pageNo eq 5? 'active' : ''}"><a href="d.jsp?pageNo=5">5</a></li>
	</ul>
</div>
</body>
</html>