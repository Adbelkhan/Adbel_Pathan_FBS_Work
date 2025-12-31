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
	
	void display()
	{
		System.out.println();
		System.out.println("CURRENT ACCOUNT DETAILS");
		super.display();
		System.out.println("Overdraft Limit : " + this.overdraftLimit);
		System.out.println("Cheque Book     : " + this.chequeBook);
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
	
	void display()
	{
		System.out.println();
		System.out.println("FIXED DEPOSIT DETAILS");
		super.display();
		System.out.println("Interest Rate : " + this.interestRate);
	}	
}// class FixedDeposite ends here 

class TestBank {

	public static void main(String[] args) 
	{
		Account a1 = new Account(101, 5000);
		a1.display();

		SavingAccount s1 = new SavingAccount(201, 20000, "Yes");
		s1.display();

		CurrentAccount c1 = new CurrentAccount(301, 35000, 10000, "Yes");
		c1.display();

		FixedDeposit f1 = new FixedDeposit(401, 400000, 6.5);
		f1.display();

	}

}// class TestBank ends here
