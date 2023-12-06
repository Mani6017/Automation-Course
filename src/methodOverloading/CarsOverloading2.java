package methodOverloading;

public class CarsOverloading2 {
	// change the data sequence in the overloading method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        increaseToHeight(3, "bmw");
        increaseToHeight("bmw", 4);

	}
	public static void increaseToHeight(int seatHeight, String greet) {
		System.out.println(" increase the seat height by "+ seatHeight + " in " + greet + " car");
	}
     public static void increaseToHeight(String greet, int seatHeight) {
 		System.out.println(" increase the seat height by "+ seatHeight + " in " + greet + " car");

	}
	

}
