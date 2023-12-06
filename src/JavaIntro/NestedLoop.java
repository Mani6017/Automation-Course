package JavaIntro;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*for (int i = 0; i < 2; i++ ) {
        	System.out.println("outer " + i);
        		for (int j = 0; j < 3; j++) {
        			System.out.println("inner " + j);
        		}
        	
        }*/
		
	// Break statement. It is used to jump out of loop same as switch statement.
		

	for(int i = 0; i < 10; i++) {
		if (i == 4) {
			break;
		}
		System.out.println("1 to 10: break at 4: " + i);
	}
	

	for(int i = 0; i < 10; i++) {
		if (i == 4) {
			continue;
		}
		System.out.println("1 to 10: keep continue on 4: " + i);
	}
	
	
	
	
	}

	
}
