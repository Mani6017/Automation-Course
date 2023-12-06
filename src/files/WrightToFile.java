package files;

import java.io.FileWriter;
import java.io.IOException;

public class WrightToFile {

	public static void main(String[] args) {
         try {
			FileWriter wrightFile = new FileWriter("filename.txt");
			wrightFile.write("Files in java might be tricky, but it is fun enough! ");
			wrightFile.close();
			System.out.println("Successfully wrote to the file. ");
		} catch (IOException e) {
			System.out.println("An error occured ");
			e.printStackTrace();
		}
      
	}

}
