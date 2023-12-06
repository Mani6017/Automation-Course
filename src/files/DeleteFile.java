package files;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          File dFile = new File("filename.txt");
          if(dFile.delete()) {
        	  System.out.println("deleted file " + dFile.getName());
          }else {
        	  System.out.println("file cant be delete");
          }
	}

}
