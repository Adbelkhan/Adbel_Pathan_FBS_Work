class Student
{
	int frn;
	String sName;
	double distance;
	static int count;
	static {
		count=0;
	}
	
	String getType()
	{
	    return "Regular Student";
	}

	
	Student() {
		this.frn = 0;
		this.sName = "Not Given";
		this.distance = 0;
		count++;
	}

	Student(int frn, String sName, double distance) 
	{
		this.frn = frn;
		this.sName = sName;
		this.distance = distance;
		count++;
	}

	int getFrn() 
	{
		return frn;
	}

	void setFrn(int frn) 
	{
		this.frn = frn;
	}

	String getsName() 
	{
		return sName;
	}

	void setsName(String sName)   
	{
		this.sName = sName;
	}

	double getDistance()
	{
		return distance;
	}

	void setDistance(double distance)
	{
		this.distance = distance;
	}

	static int getCount() 
	{
		return count;
	}

	void display() 
	{
		System.out.println();
		System.out.println("FRN: "+this.frn);
		System.out.println("Name: "+this.sName);
		System.out.println("Distance: "+this.distance);
		//System.out.println();
	}
	
	public String toString() 
	{
		return "\n"+"\nFRN :"+this.frn+"\nName :"+this.sName+"\nDistance :"+this.distance;
	}
	
}//class student ends here


class PlacedStudent extends Student // is-a 
   {
	
	String companyName;
	String designation;
	
	String getType()
	{
	    return "Placed Student";
	}

	public PlacedStudent() 
	{
		
		super();
		companyName="nexo";
		designation="Ceo";
	}

	PlacedStudent(int frn, String sName, double distance, String companyName, String designation) 
	{
		super(frn,sName,distance);//parameter initialization list
		this.companyName = companyName;
		this.designation = designation;
	}

	

	String getCompanyName() 
	{
		return companyName;
	}

	void setCompanyName(String companyName) 
	{
		this.companyName = companyName;
	}

	String getDesignation() 
	{
		return designation;
	}

	void setDesignation(String designation) 
	{
		this.designation = designation;
	}
	
	
	public String toString() 
	{
		return "\n"+"Placedstudent"+"\n"+super.toString()+"\nCompany Name :"+this.companyName+"\nDesignation :"+this.designation;
	}
	
}//class Placedstudent ends here 


class TestStudent
{
	public static void main(String[] args) 
	{
		
		Student s1=new Student(10,"Sachin",500);
		s1.toString();
	    System.out.println(s1);
	    
		Student s2=new Student(7,"Dhoni",450);
		s2.toString();
	    System.out.println(s2);
		
		
		PlacedStudent ps1=new PlacedStudent(12,"Yuvi",700,"BCCI","Batsman");
		ps1.toString();
	    System.out.println(ps1);
		
		PlacedStudent ps2=new PlacedStudent(25,"Rahul",950,"BCCI","WK");
		ps2.toString();
	    System.out.println(ps2);
		System.out.println("Student Count: "+Student.getCount());
        
		
	}

}// class TestStudent ends here 

/*
 * class MyStudent {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * Student s; // generic reference
 * 
 * s = new Student(101, "Rohit", 500); s.toString(); System.out.println(s);
 * System.out.println(s.getType());
 * 
 * s = new PlacedStudent(201, "Virat", 800, "Infosys", "Software Engineer");
 * s.toString(); System.out.println(s); System.out.println(s.getType());
 * 
 * s = new PlacedStudent(301, "Hardik", 650, "TCS", "System Analyst");
 * s.toString(); System.out.println(s); System.out.println(s.getType());
 * 
 * System.out.println("Total Students Count : " + Student.getCount()); }
 * 
 * }
 */

class TestStudentD 
{

	public static void main(String[] args) 
	{
		TestStudentD.updateStudent(new PlacedStudent(12,"Yuvi",700,"BCCI","Batsman"));

	}

     static void updateStudent(Student s1) 
     {
		if(s1 instanceof PlacedStudent)
		{
			PlacedStudent ps1 = (PlacedStudent) s1;
			ps1.setDesignation("Keeper");
			System.out.println(ps1);
		}
		
	 }

}
