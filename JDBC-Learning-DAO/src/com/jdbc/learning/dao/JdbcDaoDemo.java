package com.jdbc.learning.dao;

public class JdbcDaoDemo {
	public static void main(String[] args) {
		
		EmployeeDao empDao1 = new EmployeeDao();
		empDao1.getConnection();
		Employee employee1 = empDao1.getEmployee(12);
		System.out.println(employee1.empName);
		
		EmployeeDao empDao2 = new EmployeeDao();
		empDao2.getConnection();
		Employee employee2 = new Employee();
		employee2.rollNo = 13;
		employee2.empName = "Sachin";
		empDao2.addEmployee(employee2);
	}
}
