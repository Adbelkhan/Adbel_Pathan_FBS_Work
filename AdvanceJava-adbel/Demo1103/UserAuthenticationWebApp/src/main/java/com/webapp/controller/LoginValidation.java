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

@WebServlet("/validate")
public class LoginValidation extends HttpServlet {
	
    private UserService service = new UserServiceImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		 String user= request.getParameter("username");
		 String pass=request.getParameter("password");
		 
		 
		 boolean result= service.login(user, pass);
		 
		if(result)
		{
			out.println("you are valid user...");
		}
		else
		{
			out.println("you are invalid user...");
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doPost(req, resp);
	}

}
