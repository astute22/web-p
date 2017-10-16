package common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hta.controller.AboutController;
import com.hta.controller.HomeController;

@WebServlet("*.do")
public class FrontController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String requestURI = req.getRequestURI().replace(req.getContextPath(), "");
		System.out.println("클라이언트 요청 : " + requestURI);
		String viewTemplate = null;
		Controller controller = null;
		if("/home.do".equals(requestURI)){
			viewTemplate = "WEB-INF/views/main.jsp";
			controller = new HomeController();
		}else if("/about.do".equals(requestURI)){
			viewTemplate = "WEB-INF/views/about.jsp";
			controller = new AboutController();
		}else{
			viewTemplate = "WEB-INF/views/404.jsp";
		}
		
		//컨트롤러를 실행해서 클라이언트의 요청을 처리함
		if(controller != null){
			try {
				controller.process(req, res);
			} catch (Exception e) {
				throw new ServletException(e);
			}
		}
		
		//클라이언트의 요청처리가 완료되면 뷰템플릿페이지로 감
		req.getRequestDispatcher(viewTemplate).forward(req, res);
	}
}
