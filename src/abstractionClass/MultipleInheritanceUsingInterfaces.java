package abstractionClass;

interface Printable{
	void print();
}
interface Showable{
	void show();
}
public class MultipleInheritanceUsingInterfaces implements Printable,Showable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceUsingInterfaces r = new MultipleInheritanceUsingInterfaces()
;
		r.print();
		r.show();
	}

	public   void show() {
		System.out.println(" Hello ");
		
	}

	public void print() {
		System.out.println((" How you doing? "));
		
	}

}
