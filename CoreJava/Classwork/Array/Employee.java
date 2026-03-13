
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
       
   }
   
   Employee(int id, String name, double salary)
   {
      this.id=id;
      this.name=name;
      this.salary=salary;  
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
     
     Employee [] earr=new Employee[3]; // array of reference

     earr[0] =new Employee(101,"Rahul",25000);
     earr[1] =new Employee();
     earr[2] =new Employee(102,"Vishal",30000);
         
     //for(int i=0 i<arr.length; i++)
    // {
     //  arr[i].display();
     //}
     for(Employee e:earr)//for each employee e in arr
     {
       System.out.println();
       e.display();
     }
     
   }

}// class TestEmployee ends here

