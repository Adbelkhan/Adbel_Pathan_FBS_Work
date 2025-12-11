class Employee
{
   int id;
   String name;
   double salary;
   
   Employee()
   {
      this.id=200;
      this.name="Jay";
      this.salary=23000;

       System.out.println("default constructor get call"+"\n");
   }
   
   Employee(int id, String name, double salary)
   {
      this.id=id;
      this.name=name;
      this.salary=salary;

      System.out.println("Parameterised constructor get call"+"\n");
   }


   void display()
   {
     System.out.println("ID :" + this.id);
     System.out.println("Name :" + this.name);
     System.out.println("Salary :" + this.salary);
   }
   
   void setId(int e)
   {
     this.id =e;
   }
   void setName(String e)
   {
     this.name =e;
   }
   void setSalary(double e)
   {
     this.salary =e;
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


   

}// class Employee ends here

class TestEmployee
{
   public static void main(String args[])
   {
     Employee e1, e2;
     e1 = new Employee();
     e1.setId(105);
     e1.setName("Mike");
     e1.setSalary(20000);

     e1.getId();
     e1.getName();
     e1.getSalary();

     e1.display();
 
     e2 = new Employee(103, "Atharv",50000);     
   }

}// class TestEmployee ends here

