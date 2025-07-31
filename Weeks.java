package com.hyrtutorial.telugu;

import java.util.Scanner;

public class Weeks {

	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the day");
	String day = scanner.nextLine();
	switch(day) {
	
	case "monday":
	case "tuesday":
	case "wednesday":
	case "thursday":
	case "friday":
	System.out.println(day + "it is a Weekday");
	break;
	case "saturday":
	case "sunday":
		System.out.println(day+"Yaay...!,Its a Weekend");
	}
	scanner.close();
	}

}
