package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import vo.Board;

@WebServlet("/delete.html")
public class BoardDeleteServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		//쿼리스트링으로 전달받은 글번호 가져오기
		int no = Integer.parseInt(req.getParameter("no"));
		try {
			//게시글 삭제
			BoardDAO dao = BoardDAO.getInstance();
			dao.deleteBoardByNo(no);
			
			//list.html 재요청
			res.sendRedirect("list.html");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
}
