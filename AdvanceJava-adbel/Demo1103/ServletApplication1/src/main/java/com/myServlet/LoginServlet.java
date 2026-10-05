package com.myServlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class LoginServlet extends HttpServlet 
{
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	public void init()
	{
		System.out.println("Inside init method");
		//extracting database config info from ServletContext object 
		
		String driver=getServletContext().getInitParameter("driver");
		String url=getServletContext().getInitParameter("url");
		String username=getServletContext().getInitParameter("username");
		String password=getServletContext().getInitParameter("password");
		
		//create a db connection 
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Db connection successful");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			
			String user=request.getParameter("username");
			String pass=request.getParameter("password");
			
			//PreparedStatement 
			
			if(user.equals("java"))
			{
				out.println("Welcome User");
			}
			else
			{
				out.println("please try again");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public void destroy()
	{
		try
		{
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	

}
