package objectOrient;

public class SedanInHeritance extends vehicleInheritence{
        private String brand2 = "camry";
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SedanInHeritance car = new SedanInHeritance();
		car.getVehicleInHeritence();
		System.out.println("sedan type of " + car.brand2);
	}

}
