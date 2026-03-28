class Employee
{
   int id;
   String name;
   double salary;
   double calsal()
   {
       return this.salary;
   }

   
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
  
  public String toString()
  {
	   return "ID:"+this.id+"\nNAME:"+this.name+"\nSALARY:"+this.salary; 
  }
  
}// class Employee ends here
  
  class HR extends Employee
  {
   
    double  commission;
    double calsal()
    {
    	return salary+commission;
    }
    
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

   
    
    
     void setCommission(double h)
     {
       this.commission =h;
     }

     
     double getCommission()
     {
       return this.commission;
     }
     
     public String toString()
     {
    	 return super.toString()+"\nCOMMISSION :"+this.commission;
     }
     
  }// class HR ends here


  class Admin extends Employee
  {
    
    double allowance;
    
    double calsal()
    {
    	return salary + allowance;
    }
    
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

   
    
    void setAllowance(double a)
    {
      this.allowance = a;
    }
    
    
    double getAllowance()
    {
      return this.allowance;
    }
    
    public String toString()
    {
    	return super.toString()+"\nALLOWANCE :"+this.allowance;
    }

    
  }// class Admin ends here
  
  
  class SalesManager extends Employee
  {
     
     double incentive;
     int target;
     
     double calsal()
     {
    	 return salary + incentive;
     }
      
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
     
     public String toString()
     {
    	 return super.toString()+ "\nINCENTIVE :"+this.incentive+ "\nTARGET:"+this.target;
     }
  }// class Salesmanager ends here
  
  
class TestEmployee 
{
	public static void main(String args[])
	   {
		    Employee e1=new Employee(101,"Vishal",20000);
		    e1.toString();
		    System.out.println(e1);
		    
			//Employee e2=new Employee();
			//e2.display();
			
			HR h1=new HR(201,"mack",50000,3000);
			h1.toString();
			System.out.println(h1);
			//HR h2=new HR();
			//h2.display();
			
	        Admin a1=new Admin(301,"Rahul",6000,200);
	        a1.toString();
	        System.out.println(a1);
			//Admin a2=new Admin();
			//a2.display();
			
			SalesManager s1 = new SalesManager(401,"Mike",70000,430,100);
			s1.toString();
			System.out.println(s1);
			//SalesManager s2 = new SalesManager();
			//s2.display();
	          
	   }

}// class TestEmployee ends here

/*class MyTest 
{

	public static void main(String[] args)
	{
		Employee e1; // generic references
		
		e1= new Employee(501,"Raju",2200);
		e1.toString(); 
		System.out.println(e1);
		
		e1 = new HR(601,"hopper",5900,3700);
		e1.toString();
		System.out.println(e1.calsal());
		
		e1 = new Admin(701,"mangesh",6900,200);
		e1.toString();
		System.out.println(e1.calsal());
		
		e1 = new SalesManager(801,"karan",78000,830,900);
		e1.toString();
		System.out.println(e1.calsal());
	}

}// class MyTest ends here*/


class TestEmployeeD 
{
	public static void main(String[] args)
	{
		TestEmployeeD.getSalaryHike(new SalesManager(801,"karan",78000,830,900));
		
		TestEmployeeD.getSalaryHike(new Admin(701,"mangesh",6900,200));
		

	}

	static void getSalaryHike(Employee e1)
	{
		//System.out.println(e1.calsal());
		//System.out.println(e1.getName());
		//System.out.println();
		
		if(e1 instanceof SalesManager)
		{
			SalesManager s1 = (SalesManager) e1;
			s1.setIncentive(5000);
			System.out.println(s1.getIncentive());
			
		}
		
		if(e1 instanceof Admin)
		{
			Admin a1 = (Admin) e1;
			a1.setAllowance(6000);
			System.out.println(a1.getAllowance());
			
		}
		
	 }

}
