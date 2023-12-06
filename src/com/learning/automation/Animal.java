package com.learning.automation;
// parameter constructor
public class Animal {
      String animal_name;
      String animal_type;
      
      Animal(String name, String type){
    	  animal_name = name;
    	  animal_type = type;
      }
      void sayAboutAnimal(){
    	  System.out.println("animal name is " + animal_name + " and " + " animal type is " + animal_type);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal ex = new Animal("peagion", "Bird");
        Animal ex1 = new Animal("Bear", "wild");
        ex1.sayAboutAnimal();
        ex.sayAboutAnimal();
	}
	

}
