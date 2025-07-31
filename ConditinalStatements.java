package com.hyrtutorial.telugu;

public class ConditinalStatements {

	public static void main(String[] args) {
		String checkStatus = "Pass";
		if(checkStatus == "Pass") {
			System.out.println("Wait for te next round1");
			String round1 = "Pass";
			if(round1 == "Pass") {
				System.out.println("Congrats..wait for next round2");
				String round2 = "Fail";
				if(round2 == "Pass") {
					System.out.println("Congrats..wait for HR Round");
				}
				else 	{
					System.out.println("you are not qualified");
				}
			}
		}

			else {
				System.out.println("You are not qualified");
			}

		}

	}
