package model2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controllers.AddController;
import controllers.DetailController;
import controllers.FormController;
import controllers.ListController;
import controllers.ReplyController;


@WebServlet("*.do")
public class FrontController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			String uri = req.getRequestURI();
			String path = null;
			Controller controller = null;
			if(uri.endsWith("list.do")){
				controller = new ListController();
			}else if(uri.endsWith("form.do")){
				controller = new FormController();
			}else if(uri.endsWith("detail.do")){
				controller = new DetailController();
			}else if(uri.endsWith("add.do")){
				controller = new AddController();
			}else if(uri.endsWith("reply.do")){
				controller = new ReplyController();
			}else{
				controller = new ListController();
			}
			//컨트롤러
			path = controller.process(req, res);
			//페이지 이동
			if(path.startsWith("redirect")){
				//브라우저가 새로운 페이지를 재요청하게 한다.
				//외부이동
				path = path.replace("redirect:", "");
				res.sendRedirect(path);
			}else{
				//클라이언트 요청을 지정된 경로의 jsp로 forwarding 시킨다.
				//오청객체, 응답객체가 뷰 페이지로 전달된다. 
				//내부이동
				req.getRequestDispatcher("WEB-INF/views/" + path).forward(req, res);
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new ServletException(e);
		}
	}
}
