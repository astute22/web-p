package controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model2.Controller;
import vo.Board;

public class ListController implements Controller{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Board> boards = BoardDAO.getInstance().getAllBoards();
		request.setAttribute("boards", boards);
		
		return "list.jsp";
	}
}
