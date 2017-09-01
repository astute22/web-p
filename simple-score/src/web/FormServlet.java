package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form.html")
public class FormServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		try {
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
			pw.println("	<h1>학생부 :: 성적 등록</h1>");
			pw.println("	<form method='post' action='add.html' class='well'>");
			pw.println("        <label>반 : </label>");
			pw.println("        <select name='ban'>");
			pw.println("            <option value='1'>1</option>");
			pw.println("            <option value='2'>2</option>");
			pw.println("            <option value='3'>3</option>");
			pw.println("            <option value='4'>4</option>");
			pw.println("            <option value='5'>5</option>");
			pw.println("            <option value='6'>6</option>");
			pw.println("            <option value='7'>7</option>");
			pw.println("            <option value='8'>8</option>");
			pw.println("            <option value='9'>9</option>");
			pw.println("            <option value='10'>10</option>");
			pw.println("        </select>");
			pw.println("		<div class='form-group'>");
			pw.println("		<label>이름 : </label>");
			pw.println("        <input type='text' class='form-control' name='name'><br/>");
			pw.println("        </div>");
			pw.println("        <label>성적입력</label><br/>");
			pw.println("		<div class='form-group'>");
			pw.println("        <label>국어 : </label>");
			pw.println("        <input type='text' class='form-control' name='kor'><br/>");
			pw.println("        </div>");
			pw.println("		<div class='form-group'>");
			pw.println("        <label>영어 : </label>");
			pw.println("        <input type='text' class='form-control' name='eng'><br/>");
			pw.println("        </div>");
			pw.println("		<div class='form-group'>");
			pw.println("        <label>수학 : </label>");
			pw.println("        <input type='text' class='form-control' name='math'><br/>");
			pw.println("        </div>");
			pw.println("		<div class='form-group'>");
			pw.println("        <label>과학 : </label>");
			pw.println("        <input type='text' class='form-control' name='sci'><br/>");
			pw.println("        </div>");
			pw.println("		<div class='form-group'>");
			pw.println("        <label>역사 : </label>");
			pw.println("        <input type='text' class='form-control' name='his'><br/>");
			pw.println("        </div>");
			pw.println("        <div class='text-right'>");
			pw.println("            <a href='list.html' class='btn btn-default'>취소</a>");
			pw.println("            <button type='submit' class='btn btn-primary'>저장</button>");
			pw.println("        </div>");
			pw.println("    </form>");
			pw.println("    </div>");
			pw.println("</body>");
			pw.println("</html>");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
}
