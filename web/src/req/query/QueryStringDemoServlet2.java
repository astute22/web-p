package req.query;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/query-demo2.hta")
public class QueryStringDemoServlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String value1 = req.getParameter("sido");
		String value2 = req.getParameter("gu");
		System.out.println("시도 : " + value1);
		System.out.println("구 : " + value2);
		
//		resp.setContentType("text/plain;charset=utf-8");
//		PrintWriter pw = resp.getWriter();
	}
}
