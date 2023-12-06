package nestedClasses;

public class NestedClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass obj1 = new OuterClass();
		
		System.out.println(obj1.addInt(25, 30));
		
	
	
		OuterClass.InnerClass obj2 = obj1. new InnerClass();
		obj2.privateInt();
		
		System.out.println("inner class variable y: " + obj2.y);
	}

}
