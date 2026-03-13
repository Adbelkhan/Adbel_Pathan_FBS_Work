package p1;

public class voter 
{

	int age;

	voter(int age) 
	{
		
		this.age = age;
	}

	public void validate() throws InvalidAgeException 
	{
		if(this.age <18)
		{
			throw new InvalidAgeException();
		}
		else 
		{
			System.out.println("You can Vote");
		}
		
	}
	
}
