package com.aspectProvider;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
public class DBConnectionProvider 
{
	public static Connection createConnection()
	{
		//step 1 ----- create milldelware 
		
		Connection con = null;
		
		try
		{
			FileInputStream fis = new FileInputStream(".//Resources//DBConfig.properties");
			Properties p = new Properties();
			p.load(fis);
			
			String driver=p.getProperty("driverClass");
			String url=p.getProperty("url");
			String userName=p.getProperty("username");
			String password=p.getProperty("password");
			
			//2 step create connection objet return back 
			
			Class.forName(driver);
			con=DriverManager.getConnection(url,userName, password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
			

}
