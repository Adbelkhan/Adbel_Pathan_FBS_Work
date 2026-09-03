package com;

import java.util.Scanner;

public class LoginValidation {
	
	//Data Manager
	
	private String userName , password;

	public LoginValidation(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginValidation [userName=" + userName + ", password=" + password + "]";
	}
	
	// Business logic 
	
	public boolean validateUser(String userName , String password)
	{
		boolean flag= false;
		if(this.userName.equals(password))
		{
			flag= true;
		}
		return flag;
	}
	
	// Client Code ---- main method 
	
	
	public static void main(String args[])
	{
		LoginValidation validate = new LoginValidation("java","java");
		
		Scanner ac = new Scanner(System.in);
		System.out.println("Please enter username ");
		String name = ac.next();
		
		System.out.println("Please enter password");
		String password = ac.next();
		
		
		if(validate.validateUser(name, password))
		{
			System.out.println("Welcome user----"+name);
		}
		else
		{
			System.out.println("Please try again");
		}
	}
	
}
