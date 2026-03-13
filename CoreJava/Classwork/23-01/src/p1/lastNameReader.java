package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class lastNameReader extends Thread {

	
	File lName;

	lastNameReader(File lName) {
		
		this.lName = lName;
	}
	
	@Override
	public void run() {
		FileReader fr;
		try {
			 fr = new FileReader (lName);
			
			BufferedReader b1 = new BufferedReader(fr);
			
			String s1;
			while((s1 =b1.readLine()) != null) {
				System.out.println(s1+"");
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
			b1.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		} 		
	}
	
	
}
