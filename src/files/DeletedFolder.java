package files;

import java.io.File;

public class DeletedFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         File dFolder = new File("C:\\Users\\maddy\\recentFolder");
         if (dFolder.delete()) {
			System.out.println("deleted folder " + dFolder.getName());
		}else {
			System.out.println("folder fail to delete ");
		}
	}

}
