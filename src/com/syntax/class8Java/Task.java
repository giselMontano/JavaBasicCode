package com.syntax.class8Java;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// Print numbers from 1 to 50 except those that are divisible by 3
		
		for (int i=1; i<=50; i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
System.out.println();

		 //Create a program that will keep asking user to apply for a credit card. 
		// As soon you get “yes” from a user program should stop asking.
		String card = "yes";
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Do you want to apply for credit card?");
			card = scan.next();
		} while (!card.equalsIgnoreCase("Yes"));// loop will keep on going till the condition is not met/ if input is
												// YES (!) turns into NO and doesn't equal YES then goes to next block
		System.out.println("Great");
		scan.close();
	}
	
}
