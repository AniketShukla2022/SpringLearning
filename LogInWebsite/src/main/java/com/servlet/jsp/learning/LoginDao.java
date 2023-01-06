package com.servlet.jsp.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String sql = "select * from Users where uname = ? and pass = ?";
	String url = "jdbc:mysql://localhost:3306/DAOTable";
	String username = "root";
	String password = "Dravid@1996";
	
	public boolean checkCredentials(String uname, String pass) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				return true;
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
}
