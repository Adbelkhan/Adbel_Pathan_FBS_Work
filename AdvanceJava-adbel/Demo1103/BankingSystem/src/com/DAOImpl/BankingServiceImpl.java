package com.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.DAO.BankDAOServices;
import com.aspectProvider.DBConnectionProvider;
import com.bean.Account;

public class BankingServiceImpl implements BankDAOServices
{
	Scanner sc = new Scanner(System.in);
	//step 1 create connection 
	
	Connection con = DBConnectionProvider.createConnection();
	PreparedStatement pst;
	ResultSet rs;

	
	public int addAccount(Account a1) 
	{
		try
		{
			pst=con.prepareStatement("insert  into BankDB ( accountType, accBal) values(? , ? )",
					java.sql.Statement.RETURN_GENERATED_KEYS);
			
			pst.setString(1, a1.getAccType());
			pst.setDouble(2, a1.getAccBal());
			
			pst.executeUpdate();
			
			rs=pst.getGeneratedKeys();
			if(rs.next())
			{
				return rs.getInt(1);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}

	
	public Account retriveAccountById(int accNo) 
	{
		try
		{
			pst=con.prepareStatement("Select * from BankDB where accNo = ?");
			pst.setInt(1, accNo);
			
			rs=pst.executeQuery();
			
			if(rs.next())
			{
				Account a1 = new Account(
						
						rs.getString("accountType"),
						rs.getFloat("accBal")
						
						);
				
				a1.setAccNo(rs.getInt("accNo"));
				
				return a1;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	
	public boolean updateAccount(int accNo) 
	{
		boolean flag = false;
		
		System.out.println("Enter the new Account Type :");
		String accountType=sc.nextLine();
		
		try
		{
			pst=con.prepareStatement("Update BankDB set accountType = ? where accNo =?");
			pst.setString(1, accountType);
			pst.setInt(2, accNo);
			
			int count=pst.executeUpdate();
			
			if(count > 0)
			{
				flag=true;
				System.out.println("\n Account Update Successfully");
			}
			else
			{
				System.out.println("\n Account not Found");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return flag;
	}

	
	public boolean deleteAccount(int accNo) 
	{
		boolean flag = false;
		
		try
		{
			pst=con.prepareStatement("Delete from BankDB where accNo=?");
			pst.setInt(1, accNo);
			
			int count = pst.executeUpdate();
			
			if(count > 0)
			{
				flag = true;
				System.out.println("Account deleted Successfully"+accNo);
				
			}
			else
			{
				System.out.println("Account no not found");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}

	
	public List<Account> displayAllAccounts() 
	{
		List<Account> list= new ArrayList<>();
		
		try
		{
			pst=con.prepareStatement("Select * from BankDB");
			
			rs=pst.executeQuery();
			
			while(rs.next())
			{
				Account a1 = new Account(
						
						rs.getString("AccountType"),
						rs.getFloat("accbal")
						);
				a1.setAccNo(rs.getInt("accNo"));
				
				list.add(a1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}


	@Override
	public boolean updateBalance(int accNo, float newBalance) 
	{
		try
		{
			pst=con.prepareStatement("Update BankDB set accBal = ? where accNo =?");
			pst.setFloat(1, newBalance);
			pst.setInt(2, accNo);
			
			int count=pst.executeUpdate();
			return count>0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	

}
