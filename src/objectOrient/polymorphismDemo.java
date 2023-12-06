package objectOrient;

public class polymorphismDemo {
     private String brand = "Automible Dealer ";
     
     public void vechicles() {
    	 System.out.println(" all type of vehicle is available here ");
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicleInheritence toyota = new vehicleInheritence();
		toyota.getVehicleInHeritence();
		System.out.println(toyota.brand);
		
		SuvInheritence suv= new SuvInheritence();
		suv.getSuv();
		System.out.println(suv.brand);
		
		SportsInheritence sports = new SportsInheritence();
		sports.getSports();
		System.out.println(sports.brand);
		
		VanInHeritence van = new VanInHeritence();
		van.getVan();
		System.out.println(van.brand);
		
		polymorphismDemo am = new polymorphismDemo();
		am.vechicles();
		System.out.println(am.brand);

	}

}
