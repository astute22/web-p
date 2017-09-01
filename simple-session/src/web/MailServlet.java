package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.User;

@WebServlet("/mail.html")
public class MailServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		HttpSession session = req.getSession(false);
		if(session==null){
			throw new ServletException("회원만 사용가능합니다. 새기야");
		}
		User user = (User) session.getAttribute("userinfo");
		if(user==null){
			throw new ServletException("회원만 사용가능합니다. 새기야");
		}
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter pw = res.getWriter();
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html lang='ko'>");
		pw.println("<head>");
		pw.println("<meta charset='UTF-8'>");
		pw.println("<title>메일 리스트</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("	<h1>메일 리스트</h1>");
		pw.println("	<p>"+user.getName()+"님의 아직 읽지않은 메일 리스트입니다.</p>");
		pw.println("	<p><a href='main.html'>두 메인?</a></p>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
