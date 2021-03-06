package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model2.Controller;
import vo.Board;

public class ReplyController implements Controller{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String title = request.getParameter("boardtitle");
		String writer = request.getParameter("boardwriter");
		String contents = request.getParameter("boardcontents");
		
		BoardDAO boardDAO = BoardDAO.getInstance();
		
		int pno = Integer.parseInt(request.getParameter("pno"));
		int no = boardDAO.getBoardNo();
		
		Board board = new Board();
		board.setNo(no);
		board.setTitle(title);
		board.setWriter(writer);
		board.setContents(contents);
		board.setPno(pno);
		
		boardDAO.addBoard(board);
		
		return "redirect:detail.do?no="+no;
	}
}
