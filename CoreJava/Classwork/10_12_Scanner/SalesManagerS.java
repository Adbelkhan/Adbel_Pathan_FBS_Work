import java.util.Scanner;

class SalesManager
{
   int id;
   String name;
   double salary,incentive;
   int target;
    
   SalesManager()
   {
      this.id= 333;
      this.name= "Hopper";
      this.salary=9000;
      this.incentive=5000;
      this.target=100;

      System.out.println("default constructor get call"+"\n");
   }
   
   SalesManager(int id, String name, double salary, double incentive, int target)
   {
      this.id=id;
      this.name=name;
      this.salary=salary;
      this.incentive=incentive;
      this.target=target;

      System.out.println("Parameterised constructor get call"+"\n");
   }
   
   void display()
   {
     System.out.println("ID :" + this.id);
     System.out.println("Name :" + this.name);
     System.out.println("Salary :" + this.salary);
     System.out.println("Incentive :" + this.incentive);
     System.out.println("Target :" + this.target);
   }
   void setId(int s)
   {
     this.id= s;
   }
   void setName(String s)
   {
     this.name= s;
   }
   void setSalary(double s)
   {
     this.salary= s;
   }
   void setIncentive(double s)
   {
     this.incentive= s;
   }
   void setTarget(int s)
   {
     this.target= s;
   }

   int getId()
   {
     return this.id;
   }
   String getName()
   {
     return this.name;
   }
   double getSalary()
   {
     return this.salary;
   }
   double getIncentive()
   {
     return this.incentive;
   }
   int getTarget()
   {
     return this.target;
   }


   
}// class Salesmanager ends here

class TestSalesManager
{
   public static void main(String args[])
   {
      SalesManager s1, s2;
      s1 = new SalesManager();
      s1.setId(107);
      s1.setName("Jack");
      s1.setSalary(50000);
      s1.setIncentive(6000);
      s1.setTarget(100);

      s1.getId();
      s1.getName();
      s1.getSalary();
      s1.getIncentive();
      s1.getTarget();

      s1.display();
      s2 = new SalesManager(111, "Om", 35000, 4500, 100);
     
      SalesManager s3=new SalesManager();
      Scanner sc=new Scanner(System.in);
     
      System.out.println("Enter an ID");
      int id=sc.nextInt();
    
      sc.nextLine();
     
      System.out.println("Enter Name");
      String name=sc.nextLine();
     
      System.out.println("Enter Salary");
      double salary=sc.nextDouble();

      System.out.println("Enter Incentive");
      double Incentive=sc.nextDouble();
   
      System.out.println("Enter Target");
      int target=sc.nextInt();

      System.out.println("Entered ID" + id);
      System.out.println("Enter Name" + name);
      System.out.println("Enter Salary" + salary);
      System.out.println("Enter Incentive" + Incentive);
      System.out.println("Enter Target" + target);
   }
}// class TestSalesManager ends here