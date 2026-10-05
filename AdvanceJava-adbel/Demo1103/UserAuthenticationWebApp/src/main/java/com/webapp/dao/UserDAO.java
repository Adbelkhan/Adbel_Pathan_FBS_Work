package com.webapp.dao;

public interface UserDAO 
{
  public  boolean isValid(String username, String password);
  
  boolean saveUser(String username, String password , String sq , String sa); 
}
