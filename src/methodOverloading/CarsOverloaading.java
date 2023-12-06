package methodOverloading;

public class CarsOverloaading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increaseHeight(2);
		increaseHeight(2, 6);
		}
	
	public static void increaseHeight(int seatToIncrease) {
		System.out.println("increase the car seat to height: " + seatToIncrease);
		
	}
	
	public static void increaseHeight(int seatToIncrease, int regSeat) {
		if(regSeat > 5) {
			System.out.println("increase the car seat to height: " + seatToIncrease + "and resverd  " + regSeat);
		}else {
			System.out.println("increase the car seat to height and no feature : " + seatToIncrease + " and reserved " + regSeat);

		}
	}

}
