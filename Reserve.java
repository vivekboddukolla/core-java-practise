package com.hyrtutorial.telugu;

public class Reserve{
	public static int accountBalance=2000;
	public static void greetCustomer()
	{
		System.out.println("Hello customer welcome  to the bank");
	}
	public static void deposit(int amount) {
		accountBalance = accountBalance + amount;
		System.out.println("Amount is credited");

	}
	public static void withdraw(int amount) {
		accountBalance = accountBalance - amount;
		System.out.println("Amount is debited ");
	}
	public static int getAccountBalance() {
		return accountBalance;
	}

	public static void main(String[] args) {
    Reserve method1 = new Reserve();
		greetCustomer();
		System.out.println("Account balance is" + Reserve.getAccountBalance());
		deposit(200);
		System.out.println("Account balance is" + Reserve.getAccountBalance());
		withdraw(100);
		System.out.println("Account balance is" + Reserve.getAccountBalance());
	}

}
