package com.DAO;

import java.util.List;

import com.bean.Account;

public interface BankDAOServices 
{
	public int addAccount(Account a1);
	
	public Account retriveAccountById(int accNo);
	
	public boolean updateAccount(int accNo);
	
	public boolean deleteAccount(int accNo);
	
	public List<Account> displayAllAccounts();
	
	public boolean updateBalance(int accNo, float newBalance);

}
