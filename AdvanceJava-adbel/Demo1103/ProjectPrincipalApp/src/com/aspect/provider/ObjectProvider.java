package com.aspect.provider;

import java.io.FileInputStream;
import java.util.Properties;

import com.serviceImpl.ValidateUser;
import com.services.LoginValidation;

//Aspect ---- non functional service class
// service--- providing an object of the businesslogic class 


public class ObjectProvider {
	
	public static LoginValidation createObject()
	{
		LoginValidation l=null;
		// file handling 
		
		try
		{
			//1st step read the middleware
			FileInputStream fis = new FileInputStream(".//Resources//info.properties");
			Properties p = new Properties();
			p.load(fis);
			String className=p.getProperty("BusinessClass");
			
			//2nd step-----creat object of Business Logic class
			l=(LoginValidation) Class.forName(className).newInstance();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return l;
	}

}
