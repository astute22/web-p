package kr.co.jhta.board.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.board.utils.IbatisUtil;
import kr.co.jhta.board.vo.Board;
import kr.co.jhta.board.vo.Comments;
import kr.co.jhta.board.vo.Likes;

public class BoardDao {

	@SuppressWarnings("unchecked")
	public List<Board> getBoards() throws SQLException{
		return IbatisUtil.getSqlMap().queryForList("getBoards");
	}
	
	public void addBoard(Board board) throws SQLException{
		IbatisUtil.getSqlMap().insert("addBoard", board);
	}
	
	public Board getBoardByNo(int no) throws SQLException{
		return (Board) IbatisUtil.getSqlMap().queryForObject("getBoardByNo", no);
	}
	
	public void addLikes(Likes likes) throws SQLException{
		IbatisUtil.getSqlMap().insert("addLikes", likes);
	}
	
	public int getLikes(Likes likes) throws SQLException{
		return (int) IbatisUtil.getSqlMap().queryForObject("getLikes", likes);
	}
	
	public void deleteBoard(int no) throws SQLException{
		IbatisUtil.getSqlMap().delete("deleteBoard", no);
	}
	
	public void inactiveBoard(int no) throws SQLException{
		IbatisUtil.getSqlMap().update("inactiveBoard", no);
	}
	
	public void addComment(Comments comments) throws SQLException{
		IbatisUtil.getSqlMap().insert("addComment", comments);
	}
	
	@SuppressWarnings("unchecked")
	public List<Comments> getCommentsByBoardNo(int no) throws SQLException{
		return IbatisUtil.getSqlMap().queryForList("getCommentsByBoardNo", no);
	}
}
