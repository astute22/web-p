package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model2.Controller;
import vo.Board;

public class ModifyOutController implements Controller{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int no = Integer.parseInt(request.getParameter("no"));
		
		BoardDAO boardDAO = BoardDAO.getInstance();
		
		String title = request.getParameter("boardtitle");
		String writer = request.getParameter("boardwriter");
		String contents = request.getParameter("boardcontents");
		Board board = boardDAO.getBoardByNo(no);
		
		board.setTitle(title);
		board.setWriter(writer);
		board.setContents(contents);
		
		boardDAO.updateBoard(board);
		
		return "redirect:detail.do?no="+no;
	}
}
