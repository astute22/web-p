package kr.co.jhta.board.dao;

import java.sql.SQLException;

import kr.co.jhta.board.utils.IbatisUtil;
import kr.co.jhta.board.vo.User;

public class UserDao {

	public void addUser(User user) throws SQLException{
		IbatisUtil.getSqlMap().insert("addUser", user);
	}
	public User getUserById(String userId) throws SQLException{
		return (User) IbatisUtil.getSqlMap().queryForObject("getUserById", userId);
	}
}
