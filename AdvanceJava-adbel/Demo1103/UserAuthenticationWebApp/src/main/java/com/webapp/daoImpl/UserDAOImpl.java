package com.webapp.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.webapp.dao.UserDAO;

public class UserDAOImpl implements UserDAO
{

	private String classname = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/advjava";
	private String username = "root";
	private String password = "pass1530";

	@Override
	public boolean isValid(String username, String password) {

		System.out.println("=== isValid called ===");
		System.out.println("Received: [" + username + "] / [" + password + "]");

		try {
			Class.forName(classname);
			System.out.println("Driver loaded OK");

			Connection con = DriverManager.getConnection(url, this.username, this.password);
			System.out.println("Connected to database: " + con.getCatalog());

			String query = "select * from user where Username = ? and password = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, username);
			pst.setString(2, password);

			ResultSet rs = pst.executeQuery();
			boolean found = rs.next();
			con.close(); // connection close 
			System.out.println("Row found: " + found);
			return found;

		} catch (ClassNotFoundException e) {
			System.out.println("ERROR: MySQL driver JAR not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("ERROR: SQL problem -> " + e.getMessage());
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean saveUser(String username, String password, String sq, String sa) 
	{
		try {
			Class.forName(classname);
			Connection con = DriverManager.getConnection(url, this.username, this.password);
			
			String insertQuery = "insert into user value(?,?,?,?) ";
			
			PreparedStatement pst = con.prepareStatement(insertQuery);
			
			pst.setString(1, username);
			pst.setString(2, password);
			pst.setString(3, sq);
			pst.setString(4, sa);
			
			
			// this is the insert query so we use executeUpdate
			int rowCount = pst.executeUpdate();
			
		    if(rowCount > 0)
			return true;
			
		} catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		} catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		return false;
	}
}