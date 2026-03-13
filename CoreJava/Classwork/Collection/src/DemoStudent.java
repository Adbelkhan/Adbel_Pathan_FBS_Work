import java.util.ArrayList; 

 class Student  implements Comparable<Student>
{
	int id;
	String name;
	
	int getId() 
	{
		return id;
	}

	void setId(int id) 
	{
		this.id = id;
	}

	String getName() 
	{
		return name;
	}

	void setName(String name) 
	{
		this.name = name;
	}

	Student(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public boolean equals (Object o)
	{
		Student s2 = (Student) o;
		
		if( this.id == s2.id)
		{
			return true;
		}
		else {
			return false;
		}
	}	
	
	
	 
	
		public int compareTo(Student s2) 
		{
	      //Student s2=(Student)0; 
	      return (int)(this.id-s2.id);
		}
		
		@Override 
		public int hashCode()
		{
			System.out.println("Inside hashCode");
			return this.id;
		}

		
	
}// class student ends here 
	


public class DemoStudent 
{
	public static void main(String[] args) {
		Student s1 = new Student(10, "Sachin");
		Student s2 = new Student(7, "Dhoni");
		Student s3 = new Student(18, "Virat");
		
		ArrayList <Student> Slist = new ArrayList <Student> ();
		
		Slist.add(s1);
		Slist.add(s2);
		Slist.add(s3);
		
		s1.toString();
		s2.toString();
		s3.toString();
		
		//System.out.println(Slist);
		
		if(Slist.contains(new Student (7, "Dhoni")))
		{
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		
	
		
	}

}
