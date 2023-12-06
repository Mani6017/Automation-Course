package exceptionHandeling;



public class ExceptionDemo {

	
	static void someMethod(int age)  {
	  
		  if(age < 18) {
			 throw new SecurityException("Access denied! your atleast 18 yrs old"); 
		  }else {
			  System.out.println("Access granted ");
		  }
			}
	public static void main(String[] args)  {
		someMethod(11);
        try {
        	int[] array = {1, 2, 3};
            System.out.println(array[10]);
		} catch (Exception e) {
			System.out.println("something went wrong");
		}finally {
		      System.out.println("The 'try catch' is finished.");
		    }

		
	}
      
}
