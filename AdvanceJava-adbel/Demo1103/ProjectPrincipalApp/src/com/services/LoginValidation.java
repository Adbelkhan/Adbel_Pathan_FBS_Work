package com.services;

public interface LoginValidation {
	
	public boolean validateUser(String userName ,String password);
	public String forgetPassword(String userName );
	public String updatePassword(String userName , String Password, String newPassword);
	

}
