package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
       try {
    	File myReader = new File("filename.txt");
		Scanner obj = new Scanner(myReader);
		while(obj.hasNextLine()) {
			//String data = obj.nextLine();
			//System.out.println(data);
			System.out.println(obj.nextLine());
		}
		obj.close();
	} catch (FileNotFoundException e) {
	System.out.println("An error occured ");
		e.printStackTrace();
	}
       
	}

}
