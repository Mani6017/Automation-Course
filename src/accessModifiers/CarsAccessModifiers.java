package accessModifiers;

public class CarsAccessModifiers {
	
	// default/ no modifiers - Accessible in the same package
	int speed;
	
	// private modifier - only accessible inside the class
	private int privateSpeed = 10;
	
	//public modifier - scope is  across the java world by importing package if necessary
	public int publicSpeed;
	
	//protected modifiers - Accessible in the sub class
	protected int protectedSpeed;
	
	public CarsAccessModifiers(int speed) {
		this.speed = speed;
	}
	
	public void increaseSpeed() {
		this.speed++;
		System.out.println("increase the speed " + speed);
	}
	
	protected void decreaseSpeed() {
		this.speed--;
		System.out.println("decrease the speed " + speed);

	}
	
	public void getPrivateSpeed() {
		System.out.println(privateSpeed);
	}
	

}
