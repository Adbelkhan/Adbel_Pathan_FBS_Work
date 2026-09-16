package com.services;

import java.util.List;

import com.bean.Account;

public interface AccountServices 
{
	public int openAccount(String accType , float amount);
	
	public float balEnquiery(int accNo);
	
	public float deposit(int accNo, float amount);
	
	public String printAccountDetails(int accNo);
	
	List<Account> displayAllAccount();
	
	public void withdraw(int accNo, float amount);
	
	public void transfer(int senderAccNo, int receiverAccno , float amount);

}
