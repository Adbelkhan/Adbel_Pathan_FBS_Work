import java.util.Scanner;

class BankAccount 
{
  int AcNo;
  String HolderName;
  double CurrentBalance;
  double InterestRate;

  BankAccount()
  {
     this.AcNo= 113009;
     this.HolderName="Rahul";
     this.CurrentBalance=8600000;
     this.InterestRate=3.4;
     System.out.println("default constructor get call"+"\n");
  }
 
  BankAccount(int AcNo, String HolderName, double CurrentBalance, double InterestRate)
  {
     this.AcNo= AcNo;
     this.HolderName=HolderName;
     this.CurrentBalance=CurrentBalance;
     this.InterestRate=InterestRate;
     System.out.println("Parameterised constructor get call"+"\n");
  }

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
     BankAccount a1;
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
     BankAccount a2= new BankAccount(200023347, "Rahul",300000, 4.4);

     BankAccount a3=new BankAccount();
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter an AcNo");
     int AcNo=sc.nextInt();
    
     sc.nextLine();
     
     System.out.println("Enter HolderName");
     String HolderName=sc.nextLine();
     
     System.out.println("Enter CurrentBalance");
     double CurrentBalance=sc.nextDouble();

     System.out.println("Enter InterestRate");
     double InterestRate=sc.nextDouble();
   
     System.out.println("Entered AcNo " + AcNo);
     System.out.println("Enter HolderName " + HolderName);
     System.out.println("Enter CurrentBalance " + CurrentBalance);
     System.out.println("Enter InterestRate " + InterestRate);

  }

}// class TestBankAccount ends here