package JavaIntro;

public class NewMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NewMethod met = new NewMethod();
		met.newMehod1();
		NewMethod met2 = new NewMethod();
		met2.newMehod2("Mani", 12, "US");
		met2.newMehod2("Molly", 23, "SA");
		met2.newMehod2("Maddy", 34, "DA");
		met2.newMehod2("Marc", 23, "WI");
		met2.newMehod2("Mike", 24, "US");
		newMetho3(200);
		newMetho3(45);
		newMetho3(300);
		newMetho3(100);
	}
	
//	static void newMethod() {
//		System.out.println("This is my new method");
//	}
	
	public void newMehod1() {
		System.out.println("This is my method 2 ");
	}
	public void newMehod2(String name, int age, String nation) {
		System.out.println("list out of calling name:, " + name + " AGE -, " + age + " Country, " + nation);
	}
	static void newMetho3(int num) {
	  System.out.println("number : " + num);
	}

}
