class Course
{
	String name;
	String duration;
	double fees;
	
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
	
	
	
}//class Course ends here 

class Online extends Course
{
	String platform;
	String videoHours;
	
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
	
	void display()
	{
	
		System.out.println();
		System.out.println("ONLINE COURSE DETAILS");
		super.display();
		System.out.println("Platform        :"+this.platform);
		System.out.println("VideoHours      :"+this.videoHours);
		
	}
	
	
	
}// class Online ends here 

class Offline extends Course
{
	String classRoom;
	int batchStrength;
	
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
	
	void display()
	{
	
		System.out.println();
		System.out.println("OFFLINE COURSE DETAILS");
		super.display();
		System.out.println("ClassRoom       :"+this.classRoom);
		System.out.println("BatchStrength   :"+this.batchStrength);
		
	}
	
}//class Offline course

class Hybrid extends Course
{
	String platform;
	String videoHours;
	String classRoom;
	int batchStrength;
	
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
	
	void display()
	{
	
		System.out.println();
		System.out.println("HYBRID COURSE DETAILS");
		super.display();
		System.out.println("Platform        :"+this.platform);
		System.out.println("VideoHours      :"+this.videoHours);
		System.out.println("ClassRoom       :"+this.classRoom);
		System.out.println("BatchStrength   :"+this.batchStrength);
	}	
	
}//class Hybrid ends here 
class TestCourse {

	public static void main(String[] args) 
	{
		Course c1= new Course("Devops","10 Months",40000);
		c1.display();
		
		Online a1 = new Online("Java","7 M",20000,"Google Calender","420 H");
		a1.display();
		
		Offline b2 = new Offline("Python","6 M",30000,"FC17",30);
		b2.display();
		
		Hybrid h3 = new Hybrid("Java","7 M",35000,"Google Calender","420 H","FC17",30);
		h3.display();
	}

}// class TestCourse ends here 
