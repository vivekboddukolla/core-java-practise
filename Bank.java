package com.hyrtutorial.telugu;

public class Bank { 
	static int currentBalance = 2000;
	public static  void greetCustomer(){
	System.out.println("Hello Welome To The Bank App");
	}
	public static void deposit(int amount  ) {
		currentBalance =currentBalance + amount ;
		System.out.println("Amount deposited successfully");
	}
	public static void withdrawal(int amount) {
		currentBalance = currentBalance - amount ;
		System.out.println("Amount  withdrawed successfully");
	}
	public int getCurrentBalanace(){
		return  currentBalance;
		
	}
	 public static void main(String[] args) {
		 Bank bank = new Bank();
		 greetCustomer();
		 System.out.println("CurrentBalance :" + bank.getCurrentBalanace());
		 deposit(500);
		 System.out.println("CurrentBalance :" + bank.getCurrentBalanace());
		 withdrawal(300);
		 System.out.println("CurrentBalance :" + bank.getCurrentBalanace());
		 	 }
}
