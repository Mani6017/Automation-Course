package objectOrient;

public class CarsConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
          
          
          
          CarsConstructor chevy = new CarsConstructor(25, 1);
          int chevySpeed = chevy.getSpeed();
          int chevygear = chevy.getGear();

          System.out.println("chevy speed and gear : " + chevySpeed + ", " + chevygear);
	}

}
