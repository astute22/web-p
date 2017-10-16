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
<script type="text/javascript">
	$(function() {
		$("tbody").on("click","a",function(e){
			e.preventDefault();
			var todoNo = $(this).attr("href");
			if($(this).parents("tr").next().css("display")=="none"){
				$(this).parents("tr").next().show();
			}else{
				$(this).parents("tr").next().hide();
			}
		})
		$("tbody").on("click","#btn-todo-com",function(e){
			e.preventDefault();
			var no = $(this).parent().children("input").val();
			$.ajax({
				type:"POST",
				url:"completeTodo.jsp",
				data:{no:no},
				dataType:"json",
				success:function(result){
					var htmlContents = "";
					$.each(result.data, function(index,item){
						if(result.resultCode == "S" && result.data.length != 0){
							htmlContents += "<tr name='"+item.no+"'>";
							htmlContents += "<td>"+item.no+"</td>";
							htmlContents += "<td><a href="+item.no+">"+item.title+"</a></td>";
							htmlContents += "<td>"+item.dates+"</td>";
							htmlContents += "<td>"+item.completed+"</td>";
							htmlContents += "<td>";
							if(item.completed == "예"){
								htmlContents+= "<button class='btn btn-danger btn-xs' id='btn-todo-del'>삭제</button>";
								htmlContents+= "<input type='hidden' name='todo-no' value="+item.no+">";
							}else{
								htmlContents += "<button class='btn btn-success btn-xs' id='btn-todo-com'>처리</button>";
								htmlContents+= "<input type='hidden' name='todo-no' value="+item.no+">";
							}
							htmlContents += "</td>"
							htmlContents += "</tr>";
							htmlContents += "<tr style='display:none;'>";
							htmlContents += "<td>할 일</td>";
							htmlContents += "<td colspan='4'>"+item.contents+"</td>";
							htmlContents += "</tr>";
						}
					})
					$("tbody").empty().html(htmlContents);
				}
			})
		})
		$("tbody").on("click","#btn-todo-del",function(e){
			e.preventDefault();
			var no = $(this).parent().children("input").val();
			$.ajax({
				type:"POST",
				url:"deleteTodo.jsp",
				data:{no:no},
				dataType:"json",
				success:function(result){
					var htmlContents = "";
					$.each(result.data, function(index,item){
						if(result.resultCode == "S" && result.data.length != 0){
							htmlContents += "<tr name='"+item.no+"'>";
							htmlContents += "<td>"+item.no+"</td>";
							htmlContents += "<td><a href="+item.no+">"+item.title+"</a></td>";
							htmlContents += "<td>"+item.dates+"</td>";
							htmlContents += "<td>"+item.completed+"</td>";
							htmlContents += "<td>";
							if(item.completed == "예"){
								htmlContents+= "<button class='btn btn-danger btn-xs' id='btn-todo-del'>삭제</button>";
								htmlContents+= "<input type='hidden' name='todo-no' value="+item.no+">";
							}else{
								htmlContents += "<button class='btn btn-success btn-xs' id='btn-todo-com'>처리</button>";
								htmlContents+= "<input type='hidden' name='todo-no' value="+item.no+">";
							}
							htmlContents += "</td>"
							htmlContents += "</tr>";
							htmlContents += "<tr style='display:none;'>";
							htmlContents += "<td>할 일</td>";
							htmlContents += "<td colspan='4'>"+item.contents+"</td>";
							htmlContents += "</tr>";
						}
					})
					$("tbody").empty().html(htmlContents);
				}
			})
		})
		$("#btn-add-todo").click(function(e){
			e.preventDefault();
			var title = $(":input[name=title]").val();
			var dates = $(":input[name=dates]").val();
			var contents = $(":input[name=contents]").val();
			$.ajax({
				type:"POST",
				url:"addTodo.jsp",
				data:{title:title,dates:dates,contents:contents},
				dataType:"json",
				success:function(result){
					console.log(result);
					var htmlContents = "";
					if(result.resultCode == "S"){
						htmlContents += "<tr name='"+result.data.no+"'>";
						htmlContents += "<td>"+result.data.no+"</td>";
						htmlContents += "<td><a href="+result.data.no+">"+result.data.title+"</a></td>";
						htmlContents += "<td>"+result.data.dates+"</td>";
						htmlContents += "<td>"+result.data.completed+"</td>";
						htmlContents += "<td>";
						if(result.data.completed == "예"){
							htmlContents+= "<button class='btn btn-danger btn-xs' id='btn-todo-del'>삭제</button>";
							htmlContents+= "<input type='hidden' name='todo-no' value="+result.data.no+">";
						}else{
							htmlContents += "<button class='btn btn-success btn-xs' id='btn-todo-com'>처리</button>";
							htmlContents+= "<input type='hidden' name='todo-no' value="+result.data.no+">";
						}
						htmlContents += "</td>"
						htmlContents += "</tr>";
						htmlContents += "<tr style='display:none;'>";
						htmlContents += "<td>할 일</td>";
						htmlContents += "<td colspan='4'>"+result.data.contents+"</td>";
						htmlContents += "</tr>";
						$("tbody").append(htmlContents);
						
					}
				}
			})
		})
		$.ajax({
			type:"POST",
			url:"responseTodos.jsp",
			dataType:"json",
			success:function(result){
				var htmlContents = "";
				$.each(result.data, function(index,item){
					if(result.resultCode == "S" && result.data.length != 0){
						htmlContents += "<tr name='"+item.no+"'>";
						htmlContents += "<td>"+item.no+"</td>";
						htmlContents += "<td><a href="+item.no+">"+item.title+"</a></td>";
						htmlContents += "<td>"+item.dates+"</td>";
						htmlContents += "<td>"+item.completed+"</td>";
						htmlContents += "<td>";
						if(item.completed == "예"){
							htmlContents+= "<button class='btn btn-danger btn-xs' id='btn-todo-del'>삭제</button>";
							htmlContents+= "<input type='hidden' name='todo-no' value="+item.no+">";
						}else{
							htmlContents += "<button class='btn btn-success btn-xs' id='btn-todo-com'>처리</button>";
							htmlContents+= "<input type='hidden' name='todo-no' value="+item.no+">";
						}
						htmlContents += "</td>"
						htmlContents += "</tr>";
						htmlContents += "<tr style='display:none;'>";	
						htmlContents += "<td>할 일</td>";
						htmlContents += "<td colspan='4'>"+item.contents+"</td>";						
						htmlContents += "</tr>";
					}
				})
				$("tbody").empty().html(htmlContents);
			}
		})
	})
</script>
<body>
<div class="container">
	<h1>Todo List</h1>
		<form class="well form-horizontal">
			<div class="form-group">
				<label class="control-label col-sm-2">제목</label>
				<div class="col-sm-9">
					<input type="text" name="title" class="form-control"/>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">날짜</label>
				<div class="col-sm-9">
					<input type="date" name="dates" class="form-control"/>
				</div>
			</div>
			<div class="form-group">	
				<label class="control-label col-sm-2">내용</label>
				<div class="col-sm-9">
					<textarea rows="3" class="form-control" name="contents"></textarea>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-9 col-sm-offset-2 text-right">
					<button class="btn btn-default btn-md" id="btn-add-todo">등록</button>
				</div>
			</div>
		</form>
		
		<table class="table table-condensed">
			<colgroup>
				<col width="10%">
				<col width="30%">
				<col width="20%">
				<col width="20%">
				<col width="20%">
			</colgroup>
			<thead>
				<tr>
					<th>순번</th>
					<th>제목</th>
					<th>날짜</th>
					<th>완료여부</th>
					<th></th>
				</tr>
			</thead>
			<tbody></tbody>
		</table>
	</div>
</div>
</body>
</html>