package com.learning.automation;

public class CollectAmount {
 Integer amount = 1000;
public Integer getAmount() {
	System.out.println(" ram have amount " + amount + " and brought it to me");
	return amount;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         CollectAmount ram = new CollectAmount();
         Integer received = ram.getAmount();
         System.out.println("i got it " + received);
	}

}
