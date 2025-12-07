class Admin
{
  int id;
  String name;
  double salary, allowance;
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
      Admin a1, a2;
      a1 = new Admin();
      a1.setId(109);
      a1.setName("Shubham");
      a1.setSalary(50000);
      a1.setAllowance(6000);

      a1.getId();
      a1.getName();
      a1.getSalary();
      a1.getAllowance();

      a1.display();
      a2 = new Admin();
      a2.display();
   }

}// class TestAdmin ends here