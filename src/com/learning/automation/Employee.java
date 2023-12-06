package com.learning.automation;
// no parameter constructor 
public class Employee {
         int id;
         String name;
	
	Employee(){
		id = 1;
		name = "mani";
		
		
	}
	void someMethod() {
		System.out.println("print employee info " + id + " : " +name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee demo = new Employee();
       demo.someMethod();
	}

}
