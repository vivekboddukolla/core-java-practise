package com.hyrtutorial.telugu;

import java.util.Scanner;

public class SwitchEvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int number = scanner.nextInt();
		switch(number % 2) {
		case 0:
			System.out.println("Even Number");
			break;
		case 1:
			System.out.println("Odd Number");
			break;
		default:
			System.out.println("Invalid Number");
			break;




		}
		scanner.close();



	}
}


