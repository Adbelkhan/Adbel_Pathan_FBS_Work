package com.serviceImpl;

import java.util.List;

import com.DAO.BankDAOServices;
import com.aspectProvider.ObjectProvider;
import com.bean.Account;
import com.services.AccountServices;

public class ValidateUser implements AccountServices
{
	
     BankDAOServices dao = ObjectProvider.createDAOObject();
	
	public int openAccount(String accType, float amount) 
	{
		
		Account a1 = new Account(accType , amount);
		
		int accNo= dao.addAccount(a1);
		a1.setAccNo(accNo);
		
		
		
		return a1.getAccNo();
	}


	public float balEnquiery(int accNo) 
	{
		Account a1 = dao.retriveAccountById(accNo);
		
		if(a1 != null)
		{
			return a1.getAccBal();
		}
		
		return -1;
	}

	
	public float deposit(int accNo, float amount)
	{
		Account a1 = dao.retriveAccountById(accNo);
		
		if(a1 != null)
		{
			a1.setAccBal(a1.getAccBal() + amount);
			dao.updateBalance(accNo, a1.getAccBal());
			System.out.println("Deposite successfully");
			return a1.getAccBal();
		}

		System.out.println("Account not found");
		return 0;
	}

	
	public String printAccountDetails(int accNo) 
	{
		Account a1 = dao.retriveAccountById(accNo);
		
		if(a1 != null)
		{
			return a1.toString();
		}
		return "Account not found";
	}


	@Override
	public List<Account> displayAllAccount() 
	{
		
		return dao.displayAllAccounts();
	}


	public void withdraw(int accNo, float amount) 
	{
		Account a1 = dao.retriveAccountById(accNo);
		
		if(a1 == null)
		{
			System.out.println("Account not found");	
			return;
		}
		
		if(a1.getAccBal() < amount)
		{
			System.out.println("Insufficient Balance!");
		}
		else
		{
			a1.setAccBal(a1.getAccBal() - amount);
			dao.updateBalance(accNo, a1.getAccBal());
			System.err.println("Withdraw Successfull!!");
		}
		
		
	}


	public void transfer(int senderAccNo, int receiverAccno, float amount) {
		
		Account sender = dao.retriveAccountById(senderAccNo);
		
		Account receiver = dao.retriveAccountById(receiverAccno);
		
		if(sender == null)
		{
			System.out.println("Sender account not found");
			return;
		}
		
		if(receiver == null)
		{
			System.out.println("Receiver account not found!!");
			return;
		}
		
		if(sender.getAccBal() < amount)
		{
			System.out.println("Insufficient Balance!!");
		}
		else
		{
			sender.setAccBal(sender.getAccBal() - amount);
			receiver.setAccBal(receiver.getAccBal() + amount);
			
			dao.updateBalance(senderAccNo, sender.getAccBal());
			dao.updateBalance(receiverAccno, receiver.getAccBal());
			System.out.println("Transfer Successfull!!");
		}
		
	}
	

}
