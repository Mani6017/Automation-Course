package objectOrient;

public class CarsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Cars var = new Cars();
          Cars var2 = new Cars();
          Cars var3 = new Cars();
          Cars var4 = new Cars();
		
		
		
		
		
		
		var.setColor("Orange");
		var2.setColor("blue");
		var3.setColor("green");
		var4.setColor("yellow");
		var.setMake("Toyota");
		var2.setMake("chevy");
		var3.setMake("nissan");
		var4.setMake("honda");
		var.setModel("corolla");
		var2.setModel("malibu");
		var3.setModel("xsq");
		var4.setModel("civic");

		var.setYear(2019);
		var2.setYear(1999);
		var3.setYear(2001);
		var4.setYear(2002);
		
		
		var.speedLevel("-----toyota");
		System.out.println("car color is " + var.getColor());
		System.out.println("car make is " + var.getMake());
		System.out.println("car model is " + var.getModel());
		System.out.println("car year is " + var.getYear());
		
		var.speedLevel("-----chevy");
		System.out.println("car color is " + var2.getColor());
		System.out.println("car make is " + var2.getMake());
		System.out.println("car model is " + var2.getModel());
		System.out.println("car year is " + var2.getYear());
		
		var.speedLevel("------nissan");
		System.out.println("car color is " + var3.getColor());
		System.out.println("car make is " + var3.getMake());
		System.out.println("car model is " + var3.getModel());
		System.out.println("car year is " + var3.getYear());
		
		var.speedLevel("------honda");
		System.out.println("car color is " + var4.getColor());
		System.out.println("car make is " + var4.getMake());
		System.out.println("car model is " + var4.getModel());
		System.out.println("car year is " + var4.getYear());
		
	}

	
	
}
