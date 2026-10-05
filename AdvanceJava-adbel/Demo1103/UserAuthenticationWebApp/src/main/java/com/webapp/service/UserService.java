package com.webapp.service;

// business logic method 
public interface UserService 
{
	boolean login(String username , String password);
	boolean Register(String username, String password, String sq , String sa);
	

}
