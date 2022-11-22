package com.jdbc.learning.storing.large.image;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		try {
			Connection c = Connector.getConnection();
			String query = "insert into ImageTable(pic) values(?)";
			PreparedStatement pstmt = c.prepareStatement(query);
			JFileChooser jfc = new JFileChooser();
			jfc.showOpenDialog(null);
			File file = jfc.getSelectedFile();
			FileInputStream fis = new FileInputStream(file);
			pstmt.setBinaryStream(1, fis, fis.available());
			pstmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Success");
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
