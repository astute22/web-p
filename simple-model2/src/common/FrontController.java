package common;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.Car;
import vo.UserVo;

@WebServlet(urlPatterns="*.hta")
public class FrontController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("클라이언트의 요청 접수");
		
		//클라이언트의 요청 분석
		String requestURI = req.getRequestURI();
		requestURI = requestURI.replaceAll(req.getContextPath(), "");
		System.out.println("클라이언트의 요청 : " + requestURI);
		
		String viewTemplate= null;
		if("/main.hta".equals(requestURI)){
			//viewTemplate에 데이터 전달하기
			String txt = "우왕ㅋ굳ㅋ";
			Car car = new Car(2017,"존다 친퀘");
			UserVo userInfo = new UserVo("홍진호","kong@gmail.com",car);
			req.setAttribute("message", txt);
			req.setAttribute("user", userInfo);
			viewTemplate = "WEB-INF/views/main.jsp";
		}else if("/login.hta".equals(requestURI)){
			viewTemplate = "WEB-INF/views/login.jsp";
		}else if("/mypage.hta".equals(requestURI)){
			viewTemplate = "WEB-INF/views/mypage.jsp";
		}else {
			viewTemplate = "WEB-INF/views/404.jsp";
		}
		
		//클라이언트의 요청을 ViewTemplate으로 이동
		RequestDispatcher rd = req.getRequestDispatcher(viewTemplate);
		rd.forward(req, res);
	}
}























