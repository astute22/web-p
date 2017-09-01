package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.WebUtils;

@WebServlet("/list.html")
public class ProductListServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter pw = res.getWriter();
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html lang='ko'>");
		pw.println("<head>");
		pw.println("<meta charset='UTF-8'>");
		pw.println("<title>리스트</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("	<h1>상품리스트</h1>");
		pw.println("	<ul>");
		pw.println("		<li><a href='detail.html?name=fallout3'>폴아웃3</li>");
		pw.println("		<li><a href='detail.html?name=falloutnewvegas'>폴아웃:뉴베가스</li>");
		pw.println("		<li><a href='detail.html?name=fallout4'>폴아웃4</li>");
		pw.println("		<li><a href='detail.html?name=elderscroll4oblivion'>엘더스크롤4:오블리비언</li>");
		pw.println("		<li><a href='detail.html?name=elderscroll5skyrim'>엘더스크롤5:스카이림</li>");
		pw.println("		<li><a href='detail.html?name=starcraft'>스타크래프트 리마스터</li>");
		pw.println("		<li><a href='detail.html?name=battleground'>배틀그라운드</li>");
		pw.println("	</ul>");
		
		String value = WebUtils.getCookieValue(req.getCookies(), "recent");
		
		pw.println("	<h2>최근 본 상품</h2>");
		if(value!=null){
			String[] items = value.split(":");
			pw.println("<ul>");
			for(String name : items){
				pw.println("<li>"+name+"</li>");	
			}
		}else{
			pw.println("<p>그-없</p>");
		}
		
		pw.println("</body>");
		pw.println("</html>");
		
	}
}




















