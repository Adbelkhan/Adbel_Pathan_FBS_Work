class Course
{
	String name;
	String duration;
	double fees;
	
	double calFees()
	{
	    return fees;
	}

	Course()
	{
		
		this.name="nis";
		this.duration="100 weeks";
		this.fees=20091;
		
	}

	Course(String name, String duration, double fees)
	{
		
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}

	String getName()
	{
		return name;
	}

	void setName(String name) 
	{
		this.name = name;
	}

	String getDuration()
	{
		return duration;
	}

	void setDuration(String duration) 
	{
		this.duration = duration;
	}

	double getFees() 
	{
		return fees;
	}

	void setFees(double fees)
	{
		this.fees = fees;
	}
	
	void display()
	{
	
		System.out.println();
		System.out.println("Name            :"+this.name);
		System.out.println("Duration        :"+this.duration);
		System.out.println("Fees            :"+this.fees);
	}
	
	public String toString() 
	{
		return "\n"+"\nName  :"+this.name+"\nDuration :"+this.duration+"\nFees :"+this.fees;
	}
	
}//class Course ends here 

class Online extends Course
{
	String platform;
	String videoHours;
	
	double calFees()
	{
	    return fees + 2000;   
	}

	Online()
	{
		super();
		this.platform="icd";
		this.videoHours="234 h";
	}

	Online(String name, String duration, double fees, String platform, String videoHours)
	{
		super(name,duration,fees);
		this.platform = platform;
		this.videoHours = videoHours;
	}

	String getPlatform() 
	{
		return platform;
	}

	void setPlatform(String platform) 
	{
		this.platform = platform;
		
	}

	String getVideoHours() 
	{
		return videoHours;
	}

	void setVideoHours(String videoHours) 
	{
		this.videoHours = videoHours;
	}
	
	public String toString() 
	{
		return "\n"+"Online"+"\n"+super.toString()+"\nPlatform :"+this.platform+"\nVideoHours :"+this.videoHours;
	}	
	
}// class Online ends here 

class Offline extends Course
{
	String classRoom;
	int batchStrength;
	
	double calFees()
	{
	    return fees + 5000;   
	}

	Offline()
	{
		super();
		this.classRoom="FC00";
		this.batchStrength=00;
	}

	Offline(String name, String duration, double fees, String classRoom, int batchStrength) {
		super(name, duration, fees);
		this.classRoom = classRoom;
		this.batchStrength = batchStrength;
	}

	String getClassRoom() 
	{
		return classRoom;
	}

	void setClassRoom(String classRoom)
	{
		this.classRoom = classRoom;
	}

	int getBatchStrength() 
	{
		return batchStrength;
	}

	void setBatchStrength(int batchStrength)
	{
		this.batchStrength = batchStrength;
	}

	
	public String toString() 
	{
		return "\n"+"Offline"+"\n"+super.toString()+"\nClassRoom :"+this.classRoom+"\nBatchStrength :"+this.batchStrength;
	}
	
}//class Offline course

class Hybrid extends Course
{
	String platform;
	String videoHours;
	String classRoom;
	int batchStrength;
	
	double calFees()
	{
	    return fees + 7000;   
	}

	
	Hybrid()
	{
		super();
		this.platform="dcd";
		this.videoHours="200 h";
		this.classRoom= "eu90";
		this.batchStrength=00;
		
	}

	Hybrid(String name, String duration, double fees,String platform, String videoHours, String classRoom, int batchStrength) {
		super( name,  duration,  fees);
		this.platform = platform;
		this.videoHours = videoHours;
		this.classRoom = classRoom;
		this.batchStrength = batchStrength;
	}

	String getPlatform() 
	{
		return platform;
	}

	void setPlatform(String platform) 
	{
		this.platform = platform;
	}

	String getVideoHours() 
	{
		return videoHours;
	}

	void setVideoHours(String videoHours) 
	{
		this.videoHours = videoHours;
	}

	String getClassRoom() 
	{
		return classRoom;
	}

	void setClassRoom(String classRoom) 
	{
		this.classRoom = classRoom;
	}

	int getBatchStrength() 
	{
		return batchStrength;
	}

	void setBatchStrength(int batchStrength) 
	{
		this.batchStrength = batchStrength;
	}

	
	public String toString() 
	{
		return "\n"+"Hybrid"+"\n"+super.toString()+"\nPlatform :"+this.platform+"\nVideoHours :"+this.videoHours+"\nClassRoom :"+this.classRoom+"\nBatchStrength :"+this.batchStrength;
	}
	
	
}//class Hybrid ends here 
class TestCourse 
{

	public static void main(String[] args) 
	{
		Course c1= new Course("Devops","10 Months",40000);
		c1.toString();
	    System.out.println(c1);
		
		Online a1 = new Online("Java","7 M",20000,"Zoom","420 H");
		a1.toString();
	    System.out.println(a1);
		
		Offline b2 = new Offline("Python","6 M",30000,"FC17",30);
		b2.toString();
	    System.out.println(b2);
		
		Hybrid h3 = new Hybrid("Java","7 M",35000,"Zoom","420 H","FC17",30);
		h3.toString();
	    System.out.println(h3);
	}

}// class TestCourse ends here 

/*
 * class MyCourse {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * Course c; // generic reference
 * 
 * c = new Course("C Programming", "3 Months", 12000); c.toString();
 * System.out.println(c); System.out.println(+ c.calFees());
 * 
 * c = new Online("Web Development", "6 Months", 25000, "Zoom", "300 H");
 * c.toString(); System.out.println(c); System.out.println(+ c.calFees());
 * 
 * c = new Offline("Data Science", "8 Months", 45000, "DS-01", 45);
 * c.toString(); System.out.println(c); System.out.println(+ c.calFees());
 * 
 * c = new Hybrid("AI & ML", "10 Months", 60000, "Microsoft Teams", "500 H",
 * "AI-Lab", 35); c.toString(); System.out.println(c);
 * System.out.println(c.calFees()); }
 * 
 * }
 */

class TestCourseD 
{

	public static void main(String[] args) 
	{
		TestCourseD.updateFees(new Online("Java","7 M",20000,"Zoom","420 H"));
		TestCourseD.updateFees(new Offline("Python","6 M",30000,"FC17",30));
	}

	 static void updateFees(Course c1)
	 {
		if(c1 instanceof Online)
		{
			Online a1 = (Online) c1;
			a1.setFees(23000);
			System.out.println(a1);
		}
		
		if(c1 instanceof Offline)
		{
			Offline b1 = (Offline) c1;
			b1.setFees(35000);
			System.out.println(b1);
		}
		
	 }

}
