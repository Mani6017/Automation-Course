package com.learning.automation;

public class BankAccount {
	Long accountNumber = 1234567890l;
	String accountName = "Mani";
	Integer accountBalance = 7000;
	public void getAccount() {
		System.out.println("account number is : " + accountNumber);
	}
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		account.getAccount();

	}

}
