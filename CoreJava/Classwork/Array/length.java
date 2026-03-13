
class Employee
{
   int id;
   String name;
   double salary;
   
   Emp [] arr= new Emp [3];
   e 
   

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
     
     Employee [] arr=new Employee[3]; // array of reference
     arr[0] =new Employee(101,"Rahul",25000);
     arr[1] =new Employee()
     arr[2] =new Employee(102,"Vishal",30000);
         
     for(int i=0 i<arr.length; i++)
     {
       arr[i].display();
     }
 
     
   }

}// class TestEmployee ends here

