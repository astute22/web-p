package req.form;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-demo2.hta")
public class FormDemoServlet2 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		 
		String phone = req.getParameter("phone");
		String birth = req.getParameter("birth");
		String name = req.getParameter("username");
		String pw = req.getParameter("userpw");
		String loc = req.getParameter("Location");
		String gender = req.getParameter("gender");
		String[] tech = req.getParameterValues("tech");
		
		System.out.println(phone);
		System.out.println(birth);
		System.out.println(name);
		System.out.println(pw);
		System.out.println(loc);
		System.out.println(gender);
		System.out.println(Arrays.toString(tech));
		
		
		
	}
}
