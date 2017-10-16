package dao;

import java.sql.SQLException;
import java.util.List;

import util.IbatisUtil;
import vo.Todo;

public class TodoDao {

	//Todo 저장
	public void createTodo(Todo todo) throws SQLException{
		IbatisUtil.getSqlMap().insert("createTodo", todo);
	}
	
	//todo_delete가 'N'인 모든 Todo 조회 
	@SuppressWarnings("unchecked")
	public List<Todo> getTodos() throws SQLException{
		return IbatisUtil.getSqlMap().queryForList("getTodos");
	}
	
	//지정된 번호의 Todo 조회
	public Todo getTodo(int no) throws SQLException{
		return (Todo) IbatisUtil.getSqlMap().queryForObject("getTodo", no);
	}
	
	//지정된 번호의 Todo의 todo_delete를 'Y'로 바꾸기
	public void deleteTodo(int no) throws SQLException{
		IbatisUtil.getSqlMap().update("deleteTodo", no);
	}
	
	//지정된 번호의 Todo의 todo_completed를 '예'로 바꾸기
	public void completeTodo(int no) throws SQLException{
		IbatisUtil.getSqlMap().update("completeTodo", no);
	}
	
	public int getNo() throws SQLException{
		return (int) IbatisUtil.getSqlMap().queryForObject("getNo");
	}
}
