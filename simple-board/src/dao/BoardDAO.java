package dao;

import java.sql.SQLException;
import java.util.List;

import util.IbatisUtil;
import vo.Board;
import vo.Criteria;

public class BoardDAO {
	
	private static BoardDAO self = new BoardDAO();
	private BoardDAO() {
		// TODO Auto-generated constructor stub
	}
	public static BoardDAO getInstance(){
		return self;
	}

	@SuppressWarnings("unchecked")
	public List<Board> getAllBoards(Criteria criteria) throws SQLException{
		return IbatisUtil.getSqlMap().queryForList("getAllBoards", criteria);
	}
	
	public Board getBoardByNo(int no) throws SQLException{
		return (Board)IbatisUtil.getSqlMap().queryForObject("getBoardByNo", no);
	}
	
	public void addBoard(Board board) throws SQLException{
		IbatisUtil.getSqlMap().insert("addBoard", board);
	}
	
	public void deleteBoardByNo(int no) throws SQLException{
		IbatisUtil.getSqlMap().delete("deleteBoardByNo", no);
	}
	public void updateBoard(Board board) throws SQLException{
		IbatisUtil.getSqlMap().update("updateBoard", board);
	}
}
