package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model2.Controller;
import vo.Board;

public class DetailController implements Controller{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		
		BoardDAO boardDAO = BoardDAO.getInstance();
		Board board = boardDAO.getBoardByNo(no);
		
		request.setAttribute("board", board);
		
		return "detail.jsp";
	}
}
