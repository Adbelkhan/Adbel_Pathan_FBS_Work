class Admin
{
  int id;
  String name;
  double salary, allowance;
  
  Admin()
  {
    this.id=501;
    this.name="Shantanu";
    this.salary=44000;
    this.allowance= 3400;
    System.out.println("default constructor get call"+"\n");
  }
   
  Admin(int id, String name, double salary, double allowance)
  {
    this.id=id;
    this.name=name;
    this.salary=salary;
    this.allowance=allowance;
    System.out.println("Parameterised constructor get call"+"\n");
  }

  void display()
  {
    System.out.println("ID :" + this.id);
    System.out.println("Name :" + this.name);
    System.out.println("Salary :" + this.salary);
    System.out.println("Allowanc :" + this.allowance);
  }

  void setId(int a)
  {
    this.id = a;
  }
  void setName(String a)
  {
    this.name = a;
  }
  void setSalary(double a)
  {
    this.salary = a;
  }
  void setAllowance(double a)
  {
    this.allowance = a;
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
  double getAllowance()
  {
    return this.allowance;
  }

  
}// class Admin ends here 

class TestAdmin
{
   public static void main(String args[])
   { 
      Admin a1;
      a1 = new Admin();
      a1.setId(111);
      a1.setName("Hank");
      a1.setSalary(20000);
      a1.setAllowance(1000);

      a1.getId();
      a1.getName();
      a1.getSalary();
      a1.getAllowance();

      a1.display();
      Admin a2= new Admin(222,"Harsh",40000,2000);
      
   }

}// class TestAdmin ends here