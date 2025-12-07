class HR
{
  int id;
  String name;
  double salary, commission;
  
  void display()
  {
     System.out.println("ID :" + this.id);
     System.out.println("Name :" + this.name);
     System.out.println("Salary :" + this.salary);
     System.out.println("Commission :" + this.commission);
  }

}// class HR ends here

class TestHR
{
  public static void main(String args[])
  {
    HR h1;
    h1 = new HR();
    h1.id = 108;
    h1.name = "Suraj";
    h1.salary = 30000;
    h1.commission = 5000;
    h1.display();
  }

}// class TestHR ends here
