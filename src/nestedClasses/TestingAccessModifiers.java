package nestedClasses;

import accessModifiers.CarsAccessModifiers;

public class TestingAccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarsAccessModifiers as = new CarsAccessModifiers(10);
		as.getPrivateSpeed();
		//as.decreaseSpeed();
		as.increaseSpeed();
	}

}
