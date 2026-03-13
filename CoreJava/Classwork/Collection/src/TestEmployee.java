import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

class Employee implements Comparable<Employee> 
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

   @Override
	public String toString() {
		return "\n [id=" + id + ", name=" + name + ",salary=" +salary +" ]";
	}

  public int compareTo(Employee o) 
  {
	  return (int)(this.id-o.id);
	
	
  }
  
   
  
}// class Employee ends here


public class TestEmployee {

	public static void main(String[] args) 
	{
		Employee e1 =new Employee(106,"Aman",20000);
		Employee e2 =new Employee(105,"Atharv",25000);
		Employee e3 =new Employee(104,"Rahul",30000);
		
		List<Employee> al = new ArrayList<Employee>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		System.out.println("Before Sorting ");
		System.out.println(al);
		Collections.sort( al);
		System.out.println("After Sorting");
		System.out.println(al);

	}

}
