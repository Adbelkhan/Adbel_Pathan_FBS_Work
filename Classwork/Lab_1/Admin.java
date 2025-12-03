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
  
}// class Admin ends here 

class TestAdmin
{
   public static void main(String args[])
   { 
      Admin a1;
      a1 = new Admin();
      a1.id = 109;
      a1.name = "Shubham";
      a1.salary = 50000;
      a1.allowance = 6000;
      a1.display();
   }

}// class TestAdmin ends here