package carsOverRiding;
public class CarsOverRidingChild extends CarsOverRidingParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarsOverRidingParent obj = new CarsOverRidingChild();
		obj.carDealer();
	    obj.engineSecret(7);
	}
@Override
	public void engineSecret(int i) {
	
		System.out.println("im child class of tennesse " + i);
	}
		

}
