package dao;

import java.sql.SQLException;
import java.util.List;

import util.IbatisUtil;
import vo.Criteria;
import vo.Student;

public class StudentDao {

	@SuppressWarnings("unchecked")
	public List<Student> getAllStudents() throws SQLException{
		return IbatisUtil.getSqlMap().queryForList("getAllStudents");
	}
	
	public Student getStudentByNo(int no) throws SQLException{
		return (Student) IbatisUtil.getSqlMap().queryForObject("getStudentByNo", no);
	}
	
	public void addStudent(Student student) throws SQLException{
		IbatisUtil.getSqlMap().insert("addStudent", student);
	}
	
	public void dellStudentByNo(int no) throws SQLException{
		IbatisUtil.getSqlMap().delete("dellStudentByNo", no);
	}
	public int getAllRows() throws SQLException{
		return (Integer)IbatisUtil.getSqlMap().queryForObject("getAllRows");
	}
	public List<Student> getStudents(Criteria criteria) throws SQLException{
		return IbatisUtil.getSqlMap().queryForList("getStudents", criteria);
	}
}
