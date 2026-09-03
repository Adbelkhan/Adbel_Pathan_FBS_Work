package com.serviceImpl;

import com.bean.User;
import com.services.LoginValidation;


//Business Logic 
public class ValidateUser implements LoginValidation{

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
		
		
	@Override
		public String forgetPassword(String userName)
		{
			
			
			if(u.getUserName().equals(userName))
			{
				return u.getPassword(); // return the store password 
			}
			
			return "User not found";
		}
		
		
		@Override
		public String updatePassword(String userName, String Password, String newPassword) 
		{
			if(u.getUserName().equals(userName) && u.getPassword().equals(Password))
			{
				u.setPassword(newPassword);
				return "update password successfully";
			}
				
			return "Invalid username or password";
			 	
			
		}
}
