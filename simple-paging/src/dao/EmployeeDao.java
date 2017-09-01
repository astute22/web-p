package dao;

import java.sql.SQLException;
import java.util.List;

import util.IbatisUtil;
import vo.Criteria;
import vo.Employee;

public class EmployeeDao {

	public int getTotalRows() throws SQLException{
		return (Integer) IbatisUtil.getSqlMap().queryForObject("getTotalRows");
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> getEmployees(Criteria criteria) throws SQLException{
		return IbatisUtil.getSqlMap().queryForList("getEmployees", criteria);
	}
	
	public Employee getEmployeeById(int employeeId) throws SQLException{
		return (Employee) IbatisUtil.getSqlMap().queryForObject("getEmployeeById", employeeId);
	}
	
	public void deleteEmployeeById(int employeeId) throws SQLException{
		IbatisUtil.getSqlMap().delete("deleteEmployeeById", employeeId);
	}
}
