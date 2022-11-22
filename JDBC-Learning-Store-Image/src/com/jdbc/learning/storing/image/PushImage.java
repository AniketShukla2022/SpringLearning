package com.jdbc.learning.storing.image;

import java.io.FileInputStream;
import java.sql.*;

public class PushImage {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StoreImage", "root", "ENTER_YOUR_PASSWORD");
			
			String query = "insert into ImageTable(pic) values (?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			FileInputStream fis = new FileInputStream("/Users/aniketshukla/Downloads/lion.jpeg");
			
			pstmt.setBinaryStream(1, fis, fis.available());
			pstmt.executeUpdate();
			System.out.println("Success!");
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
