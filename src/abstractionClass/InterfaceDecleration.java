package abstractionClass;

interface Shape{
	void make();
}
class Rectangle implements Shape{

	public void make() {
		System.out.println("making Rectangle cake ");
	}
	
}
class Circle implements Shape{ public void make() {System.out.println(" making circle cake");}
}
public class InterfaceDecleration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Shape m = new Rectangle();
       m.make();
       Shape c = new Circle();
       c.make();

	}

}
