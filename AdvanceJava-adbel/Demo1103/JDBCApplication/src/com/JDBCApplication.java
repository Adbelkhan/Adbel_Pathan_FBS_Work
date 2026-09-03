package com;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JDBCApplication {

	//job of this connetc method is to provice you database connection
	
	Connection con;
	Statement stmt;
	PreparedStatement pst;
	ResultSet rs;
	
	
	public void connect()
	{
		try
		{
			
			//Read the middleware 
			
			FileInputStream fis = new FileInputStream(".//Resources/DbConfig.properties");
			Properties p = new Properties();
			p.load(fis);
			
			
			String dClass=p.getProperty("driver");
			String url = p.getProperty("url");
			String u=p.getProperty("username");
			String pass=p.getProperty("password");
			
			
			//1 load the driver class into memory 
			Class.forName(dClass);
			
			// 2 Establish connection 
			con= DriverManager.getConnection(url,u,pass);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void retriveData(String u)
	{
		try
		{
			// 3 Create a medium to pass sql query 
			/*
			 * stmt= con.createStatement();
			 * rs=stmt.executeQuery("Select * from User where username ='java'");
			 */
			
			
			pst=con.prepareStatement("Select * from User where username =?");
			
			pst.setString(1, u);
			rs=pst.executeQuery();
			
			
			while(rs.next())
			{
				String user=rs.getString(1);
				String pass=rs.getString(2);
				
				System.out.println("Table records are ...."+user +"/"+pass);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public void insertRecode(String u, String p, String q, String a)
	{
		try
		{
			/*
			 * int updateCount = stmt.
			 * executeUpdate("insert into User values('Pablo','pablo@007','fav country','Colombia')"
			 * );
			 */
			
			
			pst=con.prepareStatement("insert into User values(?,?,?,?)");
			pst.setString(1, u);
			pst.setString(2, p);
			pst.setString(3, q);
			pst.setString(4, a);
			
			int updatecount = pst.executeUpdate();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void updateRecord(String Sa, String username)
	{
		try
		{
			/*
			 * int updateCount = stmt.
			 * executeUpdate("update User set Sa = 'Breaking bad' where username = 'Mike'");
			 */
			
			pst=con.prepareStatement("update User set Sa = ? where username = ? ");
			
			pst.setString(1, Sa);
			pst.setString(2, username);
			
			int updatecount = pst.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void deleteRecode(String username)
	{
		try
		{
			/*int updateCount = stmt.executeUpdate("delete from User where username = 'Mike'");*/
			
			
			pst=con.prepareStatement("delete from User where username = ?");
			
			pst.setString(1, username);
			
			int updatecount =pst.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
	
		//Accept data from user 
		Scanner sc = new Scanner(System.in);
		
		JDBCApplication j1 = new JDBCApplication();
		j1.connect();
		
		while(true)
		{
			System.out.println("======MENU======");
			System.out.println("1. Retrive");
			System.out.println("2. Insert");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice== 1)
			{
				System.out.println("Enter username :");
				String u=sc.nextLine();
				
				j1.retriveData(u);
				
			}
			else if(choice ==2)
			{
				//Insert
				
				System.out.println("Enter username :");
				String u=sc.nextLine();
				
				System.out.println("Enter password :");
				String p=sc.nextLine();
				
				System.out.println("Enter question :");
				String q=sc.nextLine();
				
				System.out.println("Enter answer :");
				String a=sc.nextLine();
				
				j1.insertRecode(u,p,q,a);
			}
			else if(choice == 3)
			{
				//update 
				
				System.out.println("Enter new Security Answer :");
				String Sa = sc.next();
				
				System.out.println("Enter username :");
				String username = sc.next();
				
				j1.updateRecord(Sa, username);
			}
			else if(choice == 4)
			{
				//delete 
				
				System.out.println("Enter username :");
				
				String u=sc.next();
				
				j1.deleteRecode(u);
			}
			
			
			
		}
	}
}
		
	

	







