package web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import vo.Student;

@WebServlet("/add.html")
public class AddServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		StudentDao dao = new StudentDao();
		Student student = new Student();
		student.setName(req.getParameter("name"));
		student.setBan(Integer.parseInt(req.getParameter("ban")));
		student.setKor(Integer.parseInt(req.getParameter("kor")));
		student.setEng(Integer.parseInt(req.getParameter("eng")));
		student.setMath(Integer.parseInt(req.getParameter("math")));
		student.setSci(Integer.parseInt(req.getParameter("sci")));
		student.setHis(Integer.parseInt(req.getParameter("his")));
		
		try {
			dao.addStudent(student);
			
			res.sendRedirect("list.html");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
}
