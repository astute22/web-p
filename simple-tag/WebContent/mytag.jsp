<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="my" uri="http://www.jhta.co.kr/tags/mytag"%>
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
	<my:hello message="사나이 눈물 약하다 욕하지마"/>
	<my:hello message="콩까지마"/>
	<my:hello message="진리콩깔래"/>
	<my:hello message="포풍저그"/>
	
	<my:numberToStr number="10000000" pattern="#,###"/>
</div>
</body>
</html>