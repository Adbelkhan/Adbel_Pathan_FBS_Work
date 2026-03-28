class Account
{
	int acNo;
	double balance;
	
	Account()
	{
		this.acNo = 0;
		this.balance = 0;
	}

	Account(int acNo, double balance) 
	{
		
		this.acNo = acNo;
		this.balance = balance;
	}

	int getAcNo() 
	{
		return acNo;
	}

	void setAcNo(int acNo) 
	{
		this.acNo = acNo;
	}

	double getBalance() 
	{
		return balance;
	}

	void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	void display()
	{
		System.out.println();
		System.out.println("Account Number : " + this.acNo);
		System.out.println("Balance        : " + this.balance);
	}
	
	public String toString() 
	{
		return "\n"+"\nAccount Number :"+this.acNo+"\nBalance :"+this.balance;
	}
	
}// class Account ends here

class SavingAccount extends Account
{
	String atmCard;
	
	SavingAccount()
	{
		super();
		this.atmCard = "biewu";
	}

	SavingAccount(int acNo,double balance, String atmCard) 
	{
		super( acNo, balance);//parameter initialization list 
		this.atmCard = atmCard;
	}

	String getAtmCard() 
	{
		return atmCard;
	}

	void setAtmCard(String atmCard) 
	{
		this.atmCard = atmCard;
	}
	
	void display()
	{
		System.out.println();
		System.out.println("SAVING ACCOUNT DETAILS");
		super.display();
		System.out.println("ATM Card : " + this.atmCard);
	}	
	
	public String toString() 
	{
		return "\n"+"SavingAccount"+"\n"+super.toString()+"\nATM Card :"+this.atmCard;
	}
	
}// class SavingAccount ends here

class CurrentAccount extends Account
{
	double overdraftLimit;
	String chequeBook;
	
	CurrentAccount()
	{
		super();
		this.overdraftLimit = 00;
		this.chequeBook = "l ci";
	}

	CurrentAccount(int acNo,double balance, double overdraftLimit, String chequeBook) 
	{
		super(acNo, balance);//parameter initialization list
		this.overdraftLimit = overdraftLimit;
		this.chequeBook = chequeBook;
	}

	double getOverdraftLimit() 
	{
		return overdraftLimit;
	}

	void setOverdraftLimit(double overdraftLimit) 
	{
		this.overdraftLimit = overdraftLimit;
	}

	String getChequeBook()
	{
		return chequeBook;
	}

	void setChequeBook(String chequeBook) 
	{
		this.chequeBook = chequeBook;
	}
	
	
	public String toString() 
	{
		return "\n"+"CurrentAccount"+"\n"+super.toString()+"\nOverdraft Limit :"+this.overdraftLimit+"\nCheque Book :"+this.chequeBook;
	}
	
}// class CurrentAccount ends here 

class FixedDeposit extends Account
{
	double interestRate;
    
	FixedDeposit()
	{
		super();
		this.interestRate = 00;
	}

	FixedDeposit(int acNo,double balance,double interestRate)
	{
		super( acNo,balance);
		this.interestRate = interestRate;
	}

	double getInterestRate() 
	{
		return interestRate;
	}

	void setInterestRate(double interestRate) 
	{
		this.interestRate = interestRate;
	}
	
	public String toString() 
	{
		return "\n"+"FixedDeposit"+"\n"+super.toString()+"\nInterestRate :"+this.interestRate;
	}
	
	 
}// class FixedDeposite ends here 

class TestBank {

	public static void main(String[] args) 
	{
		Account a1 = new Account(101, 5000);
		a1.toString();
	    System.out.println(a1);
	    
		SavingAccount s1 = new SavingAccount(201, 20000, "Yes");
		s1.toString();
	    System.out.println(s1);

		CurrentAccount c1 = new CurrentAccount(301, 35000, 10000, "Yes");
		c1.toString();
	    System.out.println(c1);

		FixedDeposit f1 = new FixedDeposit(401, 400000, 6.5);
		f1.toString();
	    System.out.println(f1);

	}

}// class TestBank ends here

/*
 * class MyBank {
 * 
 * public static void main(String[] args) { Account a = new Account(501, 6000);
 * a.toString(); System.out.println(a);
 * 
 * a= new SavingAccount(601, 90000, "No"); a.toString(); System.out.println(a);
 * 
 * a= new CurrentAccount(701, 5000, 80000, "Yes"); a.toString();
 * System.out.println(a);
 * 
 * a=new FixedDeposit(801, 700000, 7.5); a.toString(); System.out.println(a);
 * 
 * }
 * 
 * }// class MyBank ends here
 */
class TestBankD {

	public static void main(String[] args) 
	{
		TestBankD.updateAccount(new SavingAccount(201, 20000, "Yes"));
		TestBankD.updateAccount(new CurrentAccount(301, 35000, 10000, "Yes"));

	}

	 static void updateAccount(Account a1) 
	 {
		if(a1 instanceof SavingAccount)
		{
			SavingAccount s1 = (SavingAccount) a1;
			s1.setAtmCard("No");
			System.out.println(s1.getAtmCard());
		}
		
		if(a1 instanceof CurrentAccount)
		{
			CurrentAccount c1 = (CurrentAccount) a1;
			c1.setOverdraftLimit(200000);
			System.out.println(c1);
		}
	}

}
