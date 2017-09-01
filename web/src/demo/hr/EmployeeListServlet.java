package demo.hr;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/empList.hta")
public class EmployeeListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html lang='ko'>");
		pw.println("<head>");
		pw.println("<meta charset='UTF-8'>");
		pw.println("<title>사원 정보</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>사원 리스트</h1>");
		pw.println("<table border='1' style='width:100%;'>");
		pw.println("<tr>");
		pw.println("<th>Employee ID</th><th>First name</th><th>Last name</th><th>Job ID</th>");
		pw.println("</tr>");
		
		try {
			EmployeeDAO dao = new EmployeeDAO();
			List<Employee> employees = dao.getAllEmployees();
			for(Employee emp : employees){
				pw.println("<tr>");
				pw.println("<td>" + emp.getId() + "</td>");
				pw.println("<td><a href='empDetail.hta?empid="+ emp.getId() + "'>" + emp.getFirstname() + "</a></td>");
				pw.println("<td>" + emp.getLastname() + "</td>");
				pw.println("<td>" + emp.getJobId() + "</td>");
				pw.println("</tr>");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		pw.println("</table>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
