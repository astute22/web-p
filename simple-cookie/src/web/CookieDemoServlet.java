package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookies.html")
public class CookieDemoServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//쿠키정보 가져오기
		Cookie[] cookies = req.getCookies();
		int visitCount=0;
		//첫방문시 쿠키정보 존재X
		if(cookies==null){
			visitCount=1;
		}else{
			//두번쨰 이상 방문시
			for(Cookie cookie : cookies){
				String name = cookie.getName();
				if("cnt".equals(name)){
					visitCount = Integer.parseInt(cookie.getValue())+1;
				}
			}
		}
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter pw = res.getWriter();
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html lang='ko'>");
		pw.println("<head>");
		pw.println("<meta charset='UTF-8'>");
		pw.println("<title>Cookie Sample</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("	<h1>쿠키연습</h1>");
		pw.println("	<p>방문횟수 : "+visitCount+"회</p>");
		pw.println("</body>");
		pw.println("</html>");
		
		//쿠키를 생성해서 응답으로 보내기
		//쿠키 생성
		Cookie cookie = new Cookie("cnt", String.valueOf(visitCount));
		//쿠키의 생존시간 설정
		cookie.setMaxAge(60*60);
		//쿠키를 응답으로 보내기
		res.addCookie(cookie);
		
	}
}






















