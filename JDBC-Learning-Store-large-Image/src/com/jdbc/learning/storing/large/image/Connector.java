package com.jdbc.learning.storing.large.image;

import java.sql.*;


public class Connector {
	
	private static Connection con;
	
	public static Connection getConnection() {
		if (con == null) {
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StoreImage","root","Dravid@1996");
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		return con;
	}
}
