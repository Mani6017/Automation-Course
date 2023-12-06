package accessModifiers;

public class ProtectedAccessModifiers extends CarsAccessModifiers{
        
	 public ProtectedAccessModifiers(int startSpeed) {
		 super(startSpeed);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedAccessModifiers ab = new ProtectedAccessModifiers(12);
		ab.increaseSpeed();
	}

}
