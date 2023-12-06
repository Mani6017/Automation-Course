package objectOrient;

public class Cars {
	//Always try to define first on stat(attribute)and then figure out about behaviour(functions)
	private String color;
	private String make;
	private int year;
	private String model;
	
	public void speedLevel(String company) {
		System.out.println(" Welcome to " + company + " and choose which model would you like : ");
		
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
		if (year > 2000) {
			this.year = year;
		}else {
			System.out.println(" sorry, this model is not available in the market ");
		}
	
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	

}
