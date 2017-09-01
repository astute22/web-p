package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;

import dao.UserDao;
import vo.User;

@WebServlet("/register.html")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String name = req.getParameter("username");
		String email = req.getParameter("useremail");
		String id = req.getParameter("userid");
		String pw = req.getParameter("userpw");
		
		String sha256pw = DigestUtils.sha256Hex(pw);
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setId(id);
		user.setPw(sha256pw);
		
		UserDao dao = new UserDao();
		dao.addUser(user);
		res.sendRedirect("main.html");
	}
}
