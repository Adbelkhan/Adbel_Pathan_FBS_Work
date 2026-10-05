package com.myServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class RegistrationServlet extends HttpServlet 
{
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	public void init()
	{
		//extracting database config info from ServletContext object 
		
		String driver=getServletContext().getInitParameter("driver");
		String url=getServletContext().getInitParameter("url");
		String username=getServletContext().getInitParameter("username");
		String password=getServletContext().getInitParameter("password");
		
		
		try
		{
			
			//create db connection 
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Db connection successfully");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		try
		{
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			
			String user=request.getParameter("username");
			String pass=request.getParameter("password");
			String sq=request.getParameter("SecurityQuestion");
			String sa=request.getParameter("SecurityAnswer");
			
			//PreparedStatement
			
			pst=con.prepareStatement("insert into User value(?,?,?,?)");
			
			pst.setString(1, user);
			pst.setString(2, pass);
			pst.setString(3, sq);
			pst.setString(4, sa);
			
			int i= pst.executeUpdate();
			
			if(i > 0)
			{
				out.println("Registration Successfully!!!");
			}
			else
			{
				out.println("Registration Failed");
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
