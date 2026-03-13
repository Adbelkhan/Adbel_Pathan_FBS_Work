package p1;

import java.io.File;
import java.io.IOException;

class Test {

	public static void main(String[] args) {
		File fName = new File("firstName.txt");
		try {
			fName.createNewFile();
		} catch(IOException e) 
		{
			e.printStackTrace();
		}
		
		File lName = new File("lastName.txt");
		try {
			lName.createNewFile();
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		
		FirstNameReader f1 = new FirstNameReader(fName);
		lastNameReader l1 = new lastNameReader(lName);
		f1.start();
		l1.start();
	}

}
