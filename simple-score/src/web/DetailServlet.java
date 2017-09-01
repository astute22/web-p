package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import vo.Student;

@WebServlet("/detail.html")
public class DetailServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int no = Integer.parseInt(req.getParameter("no")); 
		try {
			StudentDao dao = new StudentDao();
			Student student = dao.getStudentByNo(no);
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
			pw.println("	<h1>학생부 :: 성적 정보</h1>");
			pw.println("	<table class='table table-condensed'>");
			pw.println("		<tr>");
			pw.println("			<th>학번</th><td>"+student.getNo()+"</td>");
			pw.println("		</tr>");
			pw.println("		<tr>");
			pw.println("			<th>이름</th><td>"+student.getName()+"</td>");
			pw.println("		</tr>");
			pw.println("		<tr>");
			pw.println("			<th>반</th><td>"+student.getBan()+"</td>");
			pw.println("		</tr>");
			pw.println("		<tr>");
			pw.println("			<th>성적등록일</th><td>"+student.getCreatedate()+"</td>");
			pw.println("		</tr>");
			pw.println("		<tr>");
			pw.println("			<th>국어점수</th><td>"+student.getKor()+"</td>");
			pw.println("		</tr>");
			pw.println("		<tr>");
			pw.println("			<th>영어점수</th><td>"+student.getEng()+"</td>");
			pw.println("		</tr>");
			pw.println("		<tr>");
			pw.println("			<th>수학점수</th><td>"+student.getMath()+"</td>");
			pw.println("		</tr>");
			pw.println("		<tr>");
			pw.println("			<th>과학점수</th><td>"+student.getSci()+"</td>");
			pw.println("		</tr>");
			pw.println("		<tr>");
			pw.println("			<th>역사점수</th><td>"+student.getHis()+"</td>");
			pw.println("		</tr>");
			pw.println("		<tr>");
			pw.println("			<th>총점</th><td>"+student.getTot()+"</td>");
			pw.println("		</tr>");
			pw.println("		<tr>");
			pw.println("			<th>평균</th><td>"+student.getAvg()+"</td>");
			pw.println("		</tr>");
			pw.println("	</table>");
			pw.println("    <div class='text-right'>");
			pw.println("    <a href='list.html' class='btn btn-default'>목록</a>");
			pw.println("    <a href='dell.html?no="+no+"' class='btn btn-warning'>삭제</a>");
			pw.println("</div>");
			pw.println("</body>");
			pw.println("</html>");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
}
