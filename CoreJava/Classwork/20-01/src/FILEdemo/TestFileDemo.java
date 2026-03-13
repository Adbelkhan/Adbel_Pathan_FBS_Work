package FILEdemo;

import java.io.*;

class TestFileDemo {

	public static void main(String[] args)
	{
		try {
		FileOutputStream fos = new FileOutputStream("MyData.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(dos);
		
		
		oos.writeObject(new Employee(101,"Sachin",23000));
		
		System.out.println("Written Successfully");
		}
		catch(IOException e){
			e.printStackTrace();
			
		}

	}

}

class ReadDemo
{
	public static void main(String[] args) {
		try {
			FileInputStream fis= new FileInputStream("MaData.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee e1=(Employee)ois.readObject();
			
			System.out.println(e1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
