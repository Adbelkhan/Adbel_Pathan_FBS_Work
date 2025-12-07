class BankAccount 
{
  int AcNo;
  String HolderName;
  double CurrentBalance;
  double InterestRate;
  void display()
  {
    System.out.println("Account Number  :" + this.AcNo);
    System.out.println("Holder Name     :" + this.HolderName);
    System.out.println("Current Balance :" + this.CurrentBalance);
    System.out.println("Interest Rate   :" + this.InterestRate);
  }

  void setAcNo(int a)
  {
    this.AcNo = a;
  }
  void setHolderName(String a)
  {
    this.HolderName = a;
  }
  void setCurrentBalance(double a)
  {
    this.CurrentBalance = a;
  }
  void setInterestRate(double a)
  {
    this.InterestRate = a;
  }
  
  int getAcNo()
  {
    return this.AcNo;
  }
  String getHolderName()
  {
    return this.HolderName;
  }
  double getCurrentBalance()
  {
    return this.CurrentBalance;
  }
  double getInterestRate()
  {
    return this.InterestRate;
  }


  


}// class BankAccount ends here

class TestBankAccount
{
  public static void main(String args[])
  {
     BankAccount a1, a2;
     a1 = new BankAccount();
     a1.setAcNo(100098765);
     a1.setHolderName("Walter White");
     a1.setCurrentBalance(8000000);
     a1.setInterestRate(3.4);

     a1.getAcNo();
     a1.getHolderName();
     a1.getCurrentBalance();
     a1.getInterestRate();

     a1.display();
     a2 = new BankAccount();
     a2.display();
  }

}// class TestBankAccount ends here