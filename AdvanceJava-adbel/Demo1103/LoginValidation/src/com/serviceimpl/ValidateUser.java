package com.serviceimpl;

import com.bean.User;

// Business Logic 
public class ValidateUser {

	// Data Manager -- has-a releationship
	
	User u = new User("java","java");
	public boolean validateUser(String userName, String password)
	{
		boolean flag = false;
		if(u.getUserName().equals(userName) && u.getPassword().equals(password))
		{
			flag = true;
		}
		return flag;
	}
}
