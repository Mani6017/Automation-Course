package nestedClasses;

public class OuterClass {
      private int x = 2;
      private int z = 3;
      class InnerClass{
    	  int y =2;
    	  public void privateInt() {
       	   System.out.println("im accessing private variable from outer class and \n and "
       	   		+ "another class as well x : " + x + " z : " + z);
    	  }
      }
      // Accessing private variable from another class
//       public void privateInt() {
//    	   System.out.println(x);
//       }

	public int addInt(int x, int y) {
		return x + y;
	}
      
    	 
}
