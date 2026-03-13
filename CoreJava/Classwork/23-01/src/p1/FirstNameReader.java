package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FirstNameReader extends Thread {
	

	File fName;
	public FirstNameReader(File fname) {
		this.fName = fname;
	}
	
	@Override
	public void run() {
		FileReader fr;
		try {
			fr =new FileReader(fName);
			BufferedReader b1 = new BufferedReader(fr);
			String  s1;
			
			while((s1 = b1.readLine()) != null) {
				System.out.println(s1+"");
				Thread.sleep(1000);
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
