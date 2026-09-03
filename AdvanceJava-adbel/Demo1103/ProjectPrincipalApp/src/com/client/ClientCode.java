package com.client;

import java.util.Scanner;

import com.aspect.provider.ObjectProvider;
import com.services.LoginValidation;

public class ClientCode {
	
	public static void main(String[] args)
	{
        
		// get data from the user 
		Scanner ac = new Scanner(System.in);
		System.out.println("Please enter username ");
		String name = ac.next();
		
		System.out.println("Please enter password");
		String password = ac.next();
		
		
		// Build Business Component
		
		//ObjectProvider class is giving a service of creating a business logic class object 
		LoginValidation validate = ObjectProvider.createObject();
		// Validate is reference of an interface 
		
		
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
