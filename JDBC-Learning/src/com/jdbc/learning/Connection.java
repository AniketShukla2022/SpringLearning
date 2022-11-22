package com.jdbc.learning;

import java.sql.*;

// Steps to connect to database:

/*
 * 1. import ---> java.sql
 * 2. load and register the driver ---> com.mysql.cj.jdbc.Driver
 * 3. create connection ---> DriverManager.getConnection
 * 4. create a statement
 * 5. execute the query ---> statement.executeQuery(query)
 * 6. process the result
 * 7. close the statement and connection
 */

public class Connection {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/FirstDB";
		String uname = "root";
		String pass = "ENTER_YOUR_PASSWORD";
		String query1 = "select * from Student";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		java.sql.Connection conn = DriverManager.getConnection(url,uname,pass);
		Statement st = ((java.sql.Connection) conn).createStatement();
		
		String query2 = "insert into Student values (7, 'Tom')";
		int result2 = st.executeUpdate(query2);
		
		System.out.println("row/s affected: " + result2);
		
		ResultSet result1 = st.executeQuery(query1); 
		
		while (result1.next()) {
			String studentData = result1.getInt(1) + " : " + result1.getString(2);
			System.out.println(studentData);
		}
		
		
		st.close();
		((java.sql.Connection) conn).close();
	}
}
