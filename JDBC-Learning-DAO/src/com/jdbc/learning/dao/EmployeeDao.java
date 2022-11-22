package com.jdbc.learning.dao;

import java.sql.*;

public class EmployeeDao {
	
	Connection conn = null;
	
	public void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DAOTable", "root", "ENTER_YOUR_PASSWORD");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public Employee getEmployee(int rollNo) {
		
		Employee emp = new Employee();
		
		emp.rollNo = rollNo;
		
		try {
			String query = "select empName from Employee where rollNo="+rollNo;
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			emp.empName = rs.getString(1);
			return emp;
			
		} catch (Exception exp) {
			System.out.println(exp);
		}
		
		return null;
	}
	
	public void addEmployee(Employee emp) {
		String query = "Insert into Employee values (?,?)";
		try {
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1, emp.rollNo);
			pst.setString(2, emp.empName);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
