package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model2.Controller;
import vo.Board;

public class ModifyInController implements Controller{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int no = Integer.parseInt(request.getParameter("no"));
		
		Board board =  BoardDAO.getInstance().getBoardByNo(no);
		request.setAttribute("board", board);
		
		return "modifyform.jsp";
	}
}
