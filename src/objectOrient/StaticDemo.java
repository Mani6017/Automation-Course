package objectOrient;

public class StaticDemo {
      static String name = "aha";
     
     
     static void bawarChi() {
    	 System.out.println("this francis is located at franklin, memphis " + name);
     }
     public void ahaRestaurant() {
    	 System.out.println("This one is located at s[pring hill " + name);
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          bawarChi();
          StaticDemo var = new StaticDemo();
          var.ahaRestaurant();
	}

}
