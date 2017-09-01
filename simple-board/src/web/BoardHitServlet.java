package web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import vo.Board;

@WebServlet(urlPatterns="/hit.html")
public class BoardHitServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int no = Integer.parseInt(req.getParameter("no"));
	
		try {
			BoardDAO dao = BoardDAO.getInstance();
			
			Board board = dao.getBoardByNo(no);
			board.setHit(board.getHit()+1);
			
			dao.updateBoard(board);
			res.sendRedirect("detail.html?no="+no);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new ServletException();
		}
	}
}
