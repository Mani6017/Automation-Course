// Default constructor.. I'm little bit confused
public class ConstructorDemo {
	int id;
	String name;
	public static void main(String[] args) {
		ConstructorDemo demo = new ConstructorDemo(1, "mani");
		ConstructorDemo demo1 = new ConstructorDemo();

		
		

	}
	// parameter constructor
	ConstructorDemo(int i, String n){
		id = i;
       name = n;
		System.out.println("id and name : " + id + " " +name);
	}
 // no parameter constructor
        ConstructorDemo() {
		// TODO Auto-generated method stub
		System.out.println("print a id and name "+ "id: " + id + " name: " + name);
		
	}
	 

}
