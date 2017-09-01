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

import dao.StudentDao;
import util.StringUtils;
import vo.Criteria;
import vo.Student;

@WebServlet(urlPatterns={"/index.html","/list.html"})
public class ListServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		StudentDao dao = new StudentDao();
		int p = StringUtils.strToNumber(req.getParameter("p"),1);
		final int MAX_INDEX = 5;
		final int MAX_PAGES = 5;
		try {
			
			Criteria criteria = new Criteria();
			int totalRows = dao.getAllRows();
			int totalpage = (int)Math.ceil((double)totalRows/MAX_INDEX);
			int totalNaviBlocks = (int)Math.ceil((double)totalpage/MAX_PAGES);
			int currentNaviBlocks = (int)Math.ceil((double)p/MAX_PAGES);
			int beginPage = (currentNaviBlocks-1)*MAX_PAGES+1;
			int endPage = currentNaviBlocks*MAX_PAGES;
			if(currentNaviBlocks == totalNaviBlocks){
				endPage = totalpage;
			}
			
			int beginIndex = (p-1)*MAX_INDEX+1;
			int endIndex = p*MAX_INDEX;
			criteria.setBeginIndex(beginIndex);
			criteria.setEndIndex(endIndex);
			
			List<Student> students = dao.getStudents(criteria);
			
			res.setContentType("text/html;charset=utf-8");
			PrintWriter pw = res.getWriter();
			pw.println("<!DOCTYPE html>");
			pw.println("<html lang='ko'>");
			pw.println("<head>");
			pw.println("<meta charset='UTF-8'>");
			pw.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>");
			pw.println("<title>학생부 :: 목록</title>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("<div class='container'>");
			pw.println("	<h1>학생부 :: 목록</h1>");
			pw.println("	<table class='table table-condensed'>");
			pw.println("		<thead>");
			pw.println("			<tr>");
			pw.println("				<th>학번</th><th>이름</th><th>반</th><th>성적등록일</th>");
			pw.println("			</tr>");
			pw.println("		</thead>");
			pw.println("		<tbody>");
			
			for(Student student : students){
				int no = student.getNo();
				pw.println("			<tr>");
				pw.println("				<td>"+no+"</td><td><a href='detail.html?no="+no+"'>"+student.getName()+"</a></td><td>"+student.getBan()+"</td><td>"+student.getCreatedate()+"</td>");
				pw.println("			</tr>");	
			}
			pw.println("		</tbody>");
			pw.println("	</table>");
			pw.println("	<div class='text-center'>");
			pw.println("		<ul class='pagination'>");
			pw.println("			<li><a href='list.html?p="+1+"'>맨 앞으로</a></li>");
			if(currentNaviBlocks > 1){
				pw.println("			<li><a href='list.html?p="+((currentNaviBlocks-1)*MAX_PAGES)+"'>&laquo;</a></li>");
			}else{				
				pw.println("			<li><a href='list.html?p="+p+"'>&laquo;</a></li>");
			}
			if(p>1){
				pw.println("			<li><a href='list.html?p="+(p-1)+"'>&lt;</a></li>");
			}else{
				pw.println("			<li class='disabled'><a href='#'>&lt;</a></li>");
			}
			for(int i=1; i<=totalpage; i++){
				pw.println("			<li class='"+(p==i?"active":"")+"'><a href='list.html?p="+i+"'>"+i+"</a></li>");
			}
			if(p<totalpage){
				pw.println("			<li><a href='list.html?p="+(p+1)+"'>&gt;</a></li>");
			}else{
				pw.println("			<li class='disabled'><a href='#'>&gt;</a></li>");
			}
			if(currentNaviBlocks<totalNaviBlocks){
				pw.println("			<li><a href='list.html?p="+((currentNaviBlocks+1)*MAX_PAGES)+"'>&raquo;</a></li>");
			}else{				
				pw.println("			<li><a href='list.html?p="+totalpage+"'>&raquo;</a></li>");
			}
			pw.println("			<li><a href='list.html?p="+totalpage+"'>맨 뒤로</a></li>");
			
			pw.println("		</ul>");
			pw.println("	</div>");
			pw.println("	<div class='text-right'>");
			pw.println("	<a href='form.html' class='btn btn-primary'>학생 등록</a>");
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
