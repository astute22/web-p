package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import util.StringUtils;
import vo.Criteria;
import vo.Employee;

@WebServlet({"/list.html","/index.html"})
public class ListServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//한 화면에 표시할 데이터 행의 갯수
		final int rowsPerPage = 5;
		//한 화면에 표시할 페이지 네비게이션 갯수
		final int naviPerPage = 5;
		
		//현재 페이지 번호 계산
		int p = StringUtils.strToNumber(req.getParameter("p"),1);
		
		try {
			EmployeeDao dao = new EmployeeDao();
			//////////////////////////////페이지 네비 구성////////////////////////////////
			// 전체 데이터 갯수 조회
			int totalRows = dao.getTotalRows();			
			//전체 페이지 갯수 계산
			int totalPages = (int) Math.ceil((double)totalRows/rowsPerPage);
			//전체 페이지 네비게이션 블록갯수 계산
			int totalNaviBlocks = (int) Math.ceil((double)totalPages/naviPerPage);
			//현재 페이지 네비게이션 블록번호 계산
			int currentNaviBlock = (int) Math.ceil((double)p/naviPerPage);
			//페이지 네비게이션으로 표시할 시작과 끝 페이지번호 계산
			int beginPage = (currentNaviBlock-1)*naviPerPage +1;
			int endPage = currentNaviBlock*naviPerPage;
			if(currentNaviBlock == totalNaviBlocks){
				endPage = totalPages;
			}
			
			
			///////////////////////////현재 페이지 번호에 해당하는 데이터 조회///////////////////
			//현제 페이지 번호에 해당하는 데이터 조회에 사용할 시작과 끝 인덱스값
			int beginIndex = (p - 1)*rowsPerPage + 1;
			int endIndex = p*rowsPerPage;
			
			Criteria criteria = new Criteria();
			criteria.setBeginIndex(beginIndex);
			criteria.setEndIndex(endIndex);
			
			//페이지 번호에 해당하는 게시글 조회
			List<Employee> employees = dao.getEmployees(criteria);
			
			res.setContentType("text/html;charset=utf-8");
			PrintWriter pw = res.getWriter();
			pw.println("<!DOCTYPE html>");
			pw.println("<html lang='ko'>");
			pw.println("<head>");
			pw.println("<meta charset='UTF-8'>");
			pw.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>");
			pw.println("<title>게시판 :: 목록</title>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("<div class='container'>");
			pw.println("	<h1>목록</h1>");
			pw.println("	<table class='table table-condensed'>");
			pw.println("		<thead>");
			pw.println("			<tr>");
			pw.println("				<th>id</th><th>first name</th><th>last name</th><th>job id</th>");
			pw.println("			</tr>");
			pw.println("		</thead>");
			pw.println("		<tbody>");
			
			for(Employee employee : employees){
				pw.println("		<tr>");
				pw.println("			<td>"+employee.getId()+"</td>");
				pw.println("			<td><a href='detail.html?id="+employee.getId()+"&p="+p+"'>"+employee.getFirstname()+"</a></td>");
				pw.println("			<td><a href='detail.html?id="+employee.getId()+"&p="+p+"'>"+employee.getLastname()+"</a></td>");
				pw.println("			<td>"+employee.getJobId()+"</td>");
				pw.println("		</tr>");
			}
			
			pw.println("		</tbody>");
			pw.println("	</table>");
			
			pw.println("	<div class='text-center'>");
			pw.println("		<ul class='pagination'>");
			
			
			pw.println("			<li><a href='list.html?p="+1+"'>맨 앞으로</a></li>");
			//이전 블록으로 이동
			if(currentNaviBlock > 1){
				pw.println("			<li><a href='list.html?p="+((currentNaviBlock-1)*naviPerPage)+"'>&laquo;</a></li>");
			}else{				
				pw.println("			<li><a href='list.html?p="+p+"'>&laquo;</a></li>");
			}
			//이전 페이지 이동
			if(p>1){
				pw.println("			<li><a href='list.html?p="+(p-1)+"'>&lt;</a></li>");
			}else{
				pw.println("			<li class='disabled'><a href='#'>&lt;</a></li>");
			}
			for(int i=beginPage; i<=endPage; i++){
				pw.println("			<li class='"+(p==i?"active":"")+"'><a href='list.html?p="+i+"'>"+i+"</a></li>");
				/*
				if(p==i){
					pw.println("			<li class='active'><a href='list.html?p="+i+"'>"+i+"</a></li>");
				} else{
					pw.println("			<li><a href='list.html?p="+i+"'>"+i+"</a></li>");
				}
				*/
			}
			//다음페이지 이동
			if(p<totalPages){
				pw.println("			<li><a href='list.html?p="+(p+1)+"'>&gt;</a></li>");
			}else{
				pw.println("			<li class='disabled'><a href='#'>&gt;</a></li>");
			}
			//다음 블록으로 이동
			if(currentNaviBlock<totalNaviBlocks){
				pw.println("			<li><a href='list.html?p="+((currentNaviBlock+1)*naviPerPage)+"'>&raquo;</a></li>");
			}else{				
				pw.println("			<li><a href='list.html?p="+totalPages+"'>&raquo;</a></li>");
			}
			pw.println("			<li><a href='list.html?p="+totalPages+"'>맨 뒤로</a></li>");
			
			
			pw.println("		</ul>");
			pw.println("	</div>");
			
			pw.println("</div>");
			pw.println("</body>");
			pw.println("</html>");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
}
