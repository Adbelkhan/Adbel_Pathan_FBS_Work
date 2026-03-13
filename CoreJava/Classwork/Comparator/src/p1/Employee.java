package p1;



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

	   
	  
   
	  
}// class Employee ends here

