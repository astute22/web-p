<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String departmentId = request.getParameter("deptId");

	Class.forName("oracle.jdbc.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "zxcv1234");
	PreparedStatement pstmt = con.prepareStatement("select * from employees where department_id = ? order by employee_id");
	pstmt.setString(1, departmentId);
	ResultSet rs = pstmt.executeQuery();
	
	ArrayList<Employee> employees = new ArrayList<>();
	while(rs.next()){
		int id = rs.getInt("employee_id");
		String firstName = rs.getString("first_name");
		String lastName = rs.getString("last_name");
		String job = rs.getString("job_id");
		double salary = rs.getDouble("salary");
		employees.add(new Employee(id, firstName,lastName, job, salary));
	}
	rs.close();
	pstmt.close();
	con.close();
	
	Map<String, Object> map = new HashMap<>();
	map.put("resultCode", "S");
	map.put("msg","성공");
	map.put("data",employees);
	
	Gson gson = new Gson();
	String jsonText = gson.toJson(map);
	out.write(jsonText);
%>
<%!
	public class Employee{
		private int id;
		private String firstName;
		private String lastName;
		private String job;
		private double salary;
		public Employee(int id, String firstName, String lastName, String job, double salary){
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.job = job;
			this.salary = salary;
		}
		public int getId(){
			return id;
		}
		public void setId(int id){
			this.id = id;
		}
		public String getFirstName(){
			return firstName;
		}
		public String getLastName(){
			return lastName;
		}
		public String getJob(){
			return job;
		}
		public double getSalary(){
			return salary;
		}
}
%>