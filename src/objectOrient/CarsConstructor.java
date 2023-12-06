package objectOrient;

public class CarsConstructor {
	
	String brake;
	int speed;
	int gear;
	
	public CarsConstructor() {
		this.speed = 1;
		this.gear = 1;
		System.out.println("Iam inside the constructor: ");
	}
	public CarsConstructor(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		System.out.println(" iam inside the constructor with parameter: ");
	}
	
	public int getSpeed() {
	
		return this.speed;	
	}
	public int getGear() {
		return this.gear;
	}

}
