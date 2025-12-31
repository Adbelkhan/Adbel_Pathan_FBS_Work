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
	 //System.out.println("Employee Details");
	 System.out.println();
     System.out.println("ID :" + this.id);
     System.out.println("Name :" + this.name);
     System.out.println("Salary :" + this.salary);
     //System.out.println();
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
  
  class HR extends Employee
  {
   
    double  commission;
    
    HR()
    {
      super();
      this.commission=4000;

      
    }
   
    HR(int id, String name, double salary, double commission)
    {
      super(id,name,salary);//parameter initialization list
      this.commission= commission;

      
    }

   
    void display()
    {
       System.out.println();
       System.out.println("HR Details");
       System.out.println();
       super.display();
       System.out.println("Commission :" + this.commission);
       System.out.println();
    }
    
     void setCommission(double h)
     {
       this.commission =h;
     }

     
     double getCommission()
     {
       return this.commission;
     }
     
  }// class HR ends here


  class Admin extends Employee
  {
    
    double allowance;
    
    Admin()
    {
      super();
      this.allowance= 3400;
      
    }
     
    Admin(int id, String name, double salary, double allowance)
    {
      super(id,name,salary);
      this.allowance=allowance;
      
    }

    void display()
    {
      System.out.println("Admin Details");
      System.out.println();
      super.display();
      System.out.println("Allowanc :" + this.allowance);
      System.out.println();
    }

    
    void setAllowance(double a)
    {
      this.allowance = a;
    }
    
    
    double getAllowance()
    {
      return this.allowance;
    }

    
  }// class Admin ends here
  
  
  class SalesManager extends Employee
  {
     
     double incentive;
     int target;
      
     SalesManager()
     {
        super();
        this.incentive=5000;
        this.target=100;

        
     }
     
     SalesManager(int id, String name, double salary, double incentive, int target)
     {
        super(id,name,salary);
        this.incentive=incentive;
        this.target=target;

        
     }
     
     void display()
     {
       System.out.println("SalesManager");
       System.out.println();
       super.display();
       System.out.println("Incentive :" + this.incentive);
       System.out.println("Target :" + this.target);
       System.out.println();
     }
     
     void setIncentive(double s)
     {
       this.incentive= s;
     }
     void setTarget(int s)
     {
       this.target= s;
     }
     
     
     double getIncentive()
     {
       return this.incentive;
     }
     int getTarget()
     {
       return this.target;
     }    
  }// class Salesmanager ends here
  
  
class TestEmployee 
{
	public static void main(String args[])
	   {
		    Employee e1=new Employee(101,"Vishal",20000);
		    e1.display();
			Employee e2=new Employee();
			//e2.display();
			
			HR h1=new HR(201,"mack",50000,3000);
			h1.display();
			HR h2=new HR();
			//h2.display();
			
	        Admin a1=new Admin(301,"Rahul",6000,200);
	        a1.display();
			Admin a2=new Admin();
			//a2.display();
			
			SalesManager s1 = new SalesManager(401,"Mike",70000,430,100);
			s1.display();
			SalesManager s2 = new SalesManager();
			//s2.display();
	          
	   }


}// class TestEmployee ends here
