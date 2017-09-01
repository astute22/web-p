package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/detail.html")
public class DetailServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setAttribute("a", "황족마드리드");
		req.setAttribute("b", "꾸레 좆망 개꿀");
		req.setAttribute("c", "아센시오 최고야");
		req.setAttribute("d", "우리형 발롱도르 확정");
		
		//RequestDispatcher는 지정된 url로 사용자의 요청을 이동시키는 객체이다
		RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/detail.jsp");
		dispatcher.forward(req, res);
		
	}
}
