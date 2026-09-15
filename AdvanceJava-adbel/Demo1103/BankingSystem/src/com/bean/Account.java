package com.bean;

import java.util.Objects;

public class Account 
{
	private int accNo;
	private String accType;
	private float accBal;
	
	static int count=1000;
	
	public Account( String accType, float accBal)
	{
		super();
		this.accNo = ++count;
		this.accType = accType;
		this.accBal = accBal;
	}
	
	public int getAccNo() 
	{
		return accNo;
	}
	
	public void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}
	
	public String getAccType() 
	{
		return accType;
	}
	
	public void setAccType(String accType)
	{
		this.accType = accType;
	}
	
	public float getAccBal() 
	{
		return accBal;
	}
	
	public void setAccBal(float accBal)
	{
		this.accBal = accBal;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accType=" + accType + ", accBal=" + accBal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accBal, accNo, accType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accBal == other.accBal && accNo == other.accNo && Objects.equals(accType, other.accType);
	}
	
	

}
