package files;

import java.io.File;

public class GetFileInfo {

	public static void main(String[] args) {
            File myObj = new File("filename.txt");
            if (myObj.exists()) {
				System.out.println("file name " + myObj.getName());
				System.out.println("file can read " + myObj.canRead());
				System.out.println("file can wright" + myObj.canWrite());
				System.out.println("Absolute path" + myObj.getAbsolutePath());
				System.out.println("file size in bytes" + myObj.length());
				System.out.println("file can execute " + myObj.canExecute());
			}else {
				System.out.println("The file not found ");
			}
		
	}

}
