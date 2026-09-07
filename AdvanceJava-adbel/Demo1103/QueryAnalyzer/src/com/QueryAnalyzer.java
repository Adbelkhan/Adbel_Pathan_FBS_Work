package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class QueryAnalyzer 
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	public void Connect(String query)
	{
		// establish connection 
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://@localhost:3306/advjava","root","pass1530");
			stmt=con.createStatement();
			
			//find the type of query 
			boolean value = stmt.execute(query);
			
			
			if(value)
			{
				rs=stmt.getResultSet();
				while(rs.next())
				{
					System.out.println("Name :"+rs.getString(1));
					System.out.println("Pass :"+rs.getString(2));
					System.out.println("SQ   :"+rs.getString(3));
					System.out.println("Ans  :"+rs.getString(4));
					
				}
			}
			else
			{
				int count  =stmt.getUpdateCount();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) 
	{
		QueryAnalyzer query = new QueryAnalyzer();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the query");
		
		String q = sc.nextLine();	
		
		query.Connect(q);

	}

}
