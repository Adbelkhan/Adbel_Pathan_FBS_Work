package com.aspectProvider;

import java.io.FileInputStream;
import java.util.Properties;

import com.DAO.BankDAOServices;
import com.services.AccountServices;

//Aspect ---- non functional service class
//service--- providing an object of the businesslogic class
public class ObjectProvider 
{
	static Properties p ;
	
	static 
	{
		try
		{
			FileInputStream fis = new FileInputStream(".//Resources//info.properties");
			 p = new Properties();
			p.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public  static BankDAOServices createDAOObject()
	{
		BankDAOServices dao = null;
		
		try
		{
			String className= p.getProperty("DAOClass");
			
			//2 step create object of business logic class
			dao=(BankDAOServices) Class.forName(className).newInstance();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return dao;
		
	}
	
	
	public static AccountServices createAccServiceObject()
	{
		AccountServices service = null;
		
		try
		{
			String className = p.getProperty("BusinessClass");
			
			service =(AccountServices) Class.forName(className).newInstance();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return service;
	}
	
	
}
