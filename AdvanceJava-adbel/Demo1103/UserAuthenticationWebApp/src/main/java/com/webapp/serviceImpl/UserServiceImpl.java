package com.webapp.serviceImpl;

import com.webapp.dao.UserDAO;
import com.webapp.daoImpl.UserDAOImpl;
import com.webapp.service.UserService;

public class UserServiceImpl implements UserService
{
	
	private UserDAO dao= new UserDAOImpl();

	@Override
	public boolean login(String username, String password) {
		
		return dao.isValid(username, password);
	}

	@Override
	public boolean Register(String username, String password, String sq, String sa)
	{
		
		return dao.saveUser(username, password, sq, sa);
	}

}
