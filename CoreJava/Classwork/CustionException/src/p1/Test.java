package p1;


public class Test {

	public static void main(String[] args) 
	{
		voter v1 = new voter(17);
		try {
			
		v1.validate();
		}
			catch(InvalidAgeException ae)
			{
				System.out.println(ae);
			}

	}

}
