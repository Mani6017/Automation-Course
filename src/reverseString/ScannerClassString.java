package reverseString;

import java.util.Scanner;

public class ScannerClassString {
	
	
	public String reverseChars(String original) {
		String reverse = " ";
		for (int i = original.length()-1; i>=0; i--) {
			reverse += original.charAt(i);
			System.out.println(reverse);
		}
		return reverse;
	}
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println(" enter the name " );
		String original = obj.next();
		obj.close();
		ScannerClassString obj2 = new ScannerClassString();
		obj2.reverseChars(original);
		System.out.println(original);
	}

}
