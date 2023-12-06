
package reverseString;

public class ReverseChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Good Morning ";
		
		
		
		String reverseChars = "";
		
		
		/* for (int i = name.length()-1; i >= 0; i-- ) {
			 reverseChars += name.charAt(i);
			 System.out.println(reverseChars);
			 }*/
		 
		 // usingStringBuffer...
		 
		 /*StringBuffer buffer = new StringBuffer();
		 buffer.append(name);
		 System.out.println("-------"+ "using the string buffer object \n to get the reverse character:> "  + 
		 buffer.reverse() + "-------" );*/
		 
		 
		 //usingArray..
		  char[] charArray = name.toCharArray();
		  for(int i = charArray.length-1; i>= 0; i--) {
			  reverseChars += charArray[i];
		  
				 System.out.println(reverseChars);
 }
		  
		  
		  
		  

	}

}
