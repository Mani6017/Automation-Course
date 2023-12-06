package JavaIntro;

public class MethodInCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		conditionMethod(20);
		
		int a = hiMethod(28, 25);
		double b = hiMethod(12.0, 12.0);
		System.out.println(a);
		System.out.println(b);

	}
	//static void conditionMethod(int age) {
//		if (age < 21 ) {
//			System.out.println("Your not allowed to have drink ");
//		}else {
//			System.out.println("eligible to have a drink ");
//		} 

	// Method Overloading;
	
	static int hiMethod(int x, int y) {
		return x + y;
	}
	static double hiMethod(double r, double k) {
		return r + k;
		
	}
}
