package com.webapp.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.webapp.service.UserService;
import com.webapp.serviceImpl.UserServiceImpl;

@WebServlet("/enter")
public class RegisterServlet extends HttpServlet 
{
	
       UserService service = new UserServiceImpl();
    
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		String sq = request.getParameter("sq");
		String sa= request.getParameter("sa");
		
		boolean added = service.Register(user, pass, sq, sa);
		
		if(added)
		{
			out.println("Registration Successfully...");
		}
		else
		{
			out.println("Registration failed !!!");
		}
		
	}

}
