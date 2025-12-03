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

}// class BankAccount ends here

class TestBankAccount
{
  public static void main(String args[])
  {
     BankAccount a1;
     a1 = new BankAccount();
     a1.AcNo = 100098765;
     a1.HolderName = "Walter White";
     a1.CurrentBalance = 8000000;
     a1.InterestRate = 3.4;
     a1.display();
  }

}// class TestBankAccount ends here