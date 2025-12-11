import java.util.Scanner;
class HR
{
  int id;
  String name;
  double salary, commission;
  
  HR()
  {
    this.id=402;
    this.name="harry";
    this.salary= 70000;
    this.commission=4000;

    System.out.println("default constructor get call"+"\n");
  }
 
  HR(int id, String name, double salary, double commission)
  {
    this.id=id;
    this.name=name;
    this.salary= 330000;
    this.commission=4000;

    System.out.println("parameterised constructor get call"+"\n");
  }

 
  void display()
  {
     System.out.println("ID :" + this.id);
     System.out.println("Name :" + this.name);
     System.out.println("Salary :" + this.salary);
     System.out.println("Commission :" + this.commission);
  }
  void setId(int h)
   {
     this.id =h;
   }
   void setName(String h)
   {
     this.name =h;
   }
   void setSalary(double h)
   {
     this.salary =h;
   }
   void setCommission(double h)
   {
     this.commission =h;
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
   double getCommission()
   {
     return this.commission;
   }
   
}// class HR ends here

class TestHR
{
  public static void main(String args[])
  {
    HR h1,h2;
    h1 = new HR();
    h1.setId(108);
    h1.setName("Suraj");
    h1.setSalary(30000);
    h1.setCommission(5000);

    h1.getId();
    h1.getName();
    h1.getSalary();
    h1.getCommission();

    h1.display();
    
    h2 = new HR(109,"Rahul",3300,500);
    
    HR h3=new HR();
    Scanner sc=new Scanner(System.in);
     
    System.out.println("Enter an Id");
    int id=sc.nextInt();

    sc.nextLine();
    
    System.out.println("Enter Name");
    String name=sc.nextLine();

    System.out.println("Enter Salary");
    double salary=sc.nextDouble();
    
    System.out.println("Enter Commission");
    double commission=sc.nextDouble();
     
    System.out.println("Entered id " +id);
    System.out.println("Enter Name " +name);
    System.out.println("Enter Salary " +salary);
    System.out.println("Enter Commission " +commission);
  }

}// class TestHR ends here
