package abstractionClass;
// an abstraction class can have both implemented or non-implemented method.

 abstract class Bike {
	
	Bike(){
		System.out.println("bike looks amazing ");
	}
	
	abstract void type();
	
	void Brand(){
		System.out.println(" i got a pulsar model");
	}

}

// creating child class which inherits abstract  class
 class Pulsar extends Bike {

	@Override
	void type() {
	 System.out.println("This type of bike has 6 gear fast feature. ");
		
	}
	 
 }

 // creating a test class which calls abstract and non- abstract class.
 
public class AbstractionDemo{
	
	public static void main(String[] args) {
	 Bike obj = new Pulsar();
	 obj.Brand();
	 obj.type();
	 
	}
}
 