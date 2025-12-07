class SalesManager
{
   int id;
   String name;
   double salary,incentive;
   int target;
   
   void display()
   {
     System.out.println("ID :" + this.id);
     System.out.println("Name :" + this.name);
     System.out.println("Salary :" + this.salary);
     System.out.println("Incentive :" + this.incentive);
     System.out.println("Target :" + this.target);
   }
   
}// class Salesmanager ends here

class TestSalesManager
{
   public static void main(String args[])
   {
      SalesManager s1, s2;
      s1 = new SalesManager();
      s1.id = 107;
      s1.name = "Jack";
      s1.salary = 40000;
      s1.incentive = 6000;
      s1.target = 100;
      s1.display();
      s2 = new SalesManager();
      s2.display();
   }
}// class TestSalesManager ends here
