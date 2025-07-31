package com.hyrtutorial.telugu;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Hello User ..! what is your name ");
		String name =	scanner.nextLine();
		System.out.printf("Hey ...!%s How are you...?",name);
		String  status = scanner.nextLine();
		System.out.printf("what is your age");
		int age  = scanner.nextInt();
		System.out.println("thank you for the information");
		scanner.close();
		


	}

}
