package com.hyrtutorial.telugu;

import java.util.Scanner;

public class ArithematicOperation {

	public static void main(String[] args) {
		Scanner scanner =new  Scanner(System.in);
		System.out.println("Enter first number");
		double num1 = scanner.nextDouble();	
		System.out.println("Enter secound number");
		double num2 = scanner.nextDouble();
		System.out.println("Enter the operator: +,_,*,/,%");
		char operator =scanner.next().charAt(0);
		double result;
		
		switch (operator) {
		case '+':
			result= num1 +num2;
			System.out.println(result);
			break;
		case '-':
			result=num1 -num2;
			System.out.println(result);
		break;
		
		case '*':
			result= num1*num2;
			System.out.println(result);
			break;
		case '/':
			result= num1/num2;
			System.out.println(result);
			break;
		
		case '%':
			result= num1%num2;
			System.out.println(result);
			break;
		default:
			System.out.println("Invalid operation");
			break;
	
		}
		scanner.close();

		}
	}