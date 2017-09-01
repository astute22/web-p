package req.query;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/query-demo.hta")
public class QueryStringDemoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String value = req.getParameter("cat");
		//System.out.println("선택한 카테고리 : " + value);
		resp.setContentType("text/plain;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		if("game".equals(value)){
			pw.println("인기 게임 순위");
			pw.println("1. League Of Legend");
			pw.println("2. Unknown : Battle Ground");
			pw.println("3. Heroes Of Storm");
		}else if ("movie".equals(value)){
			pw.println("인기 영화 순위");
			pw.println("1. 성냥팔이 소녀의 재림");
			pw.println("2. 클레멘타인");
			pw.println("3. 리얼");
		}else if("comics".equals(value)){
			pw.println("인기 웹툰 순위");
			pw.println("1. 와싯의 파스타툰");
			pw.println("2. 샴의 싸컷");
			pw.println("3. 불암콩콩리믹스");
		}else{
			pw.print("유효한 요청이 아닙니다");
		}
	}
}
