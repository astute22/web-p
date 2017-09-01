package first;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/life")
public class LifeServlet extends HttpServlet{

	@Override
	public void init() throws ServletException {
		System.out.println("init() 메소드 실행됨...");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() 메소드 실행됨...");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("service() 메소드 실행됨...");
	}
}
