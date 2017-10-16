package controllers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model2.Controller;
import vo.Board;

public class AddController implements Controller{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String title = request.getParameter("boardtitle");
		String writer = request.getParameter("boardwriter");
		String contents = request.getParameter("boardcontents");
		
		Board board = new Board();
		board.setTitle(title);
		board.setWriter(writer);
		board.setContents(contents);
		
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.addBoard(board);
		
		return "redirect:list.do";
	}
}
