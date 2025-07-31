package com.hyrtutorial.telugu;

import java.util.Scanner;

public class StudentsResult {

	public static void main(String[] args) {
		Scanner scanner =new Scanner (System.in);
		System.out.println("enter the marks");
		int marks = scanner.nextInt();
		if(marks>=85) {
			System.out.println("distiction");
		}
		else if(marks<=80)
		{
			System.out.println("Secound class");
		}
		else if(marks<=60) {
			System.out.println("Third Class");		
		}

		else {
			System.out.println("you are failed");
		}

	}


}

