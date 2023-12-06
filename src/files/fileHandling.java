package files;
import java.io.File;
import java.io.IOException;

public class fileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			File obj = new File("filename.txt");
	        if (obj.createNewFile()) {
	        	System.out.println("File created: " + obj.getName());
	        }else {
	        	System.out.println("file already exist ");
	        }
		} catch (IOException e) {
			System.out.println("An error occured ");
			e.printStackTrace();
		}
        
	}

}
