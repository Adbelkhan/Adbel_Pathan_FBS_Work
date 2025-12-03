class Employee
{
   int id;
   String name;
   double salary;
   void display()
   {
     System.out.println("ID :" + this.id);
     System.out.println("Name :" + this.name);
     System.out.println("Salary :" + this.salary);
   }

}// class Employee ends here

class TestEmployee
{
   public static void main(String args[])
   {
     Employee e1;
     e1 = new Employee();
     e1.id = 105;
     e1.name = "Mike";
     e1.salary = 20000;
     e1.display();
   }

}// class TestEmployee ends here

