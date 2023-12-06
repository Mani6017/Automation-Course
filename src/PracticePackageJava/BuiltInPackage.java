package PracticePackageJava;

import java.util.Scanner;

public class BuiltInPackage {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the user name: ");
		String name = obj.nextLine();
		System.out.println(name);
		obj.close();
	}
	

}
