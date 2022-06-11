package com.syntax.class12JavaAdvance1;

import java.util.Scanner;

public class HomeWorkStringMethod {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: 
		 * if the String has an odd number of characters and has 3 or more characters,
		 * print the character in the middle of the String.
		 */
		String str = "Hello";
		if (!str.isEmpty()) {
			if (str.length() % 2 != 0 && str.length() >= 3) {
				int middle = str.length() / 2;
				System.out.println(str.charAt(middle));
			}
		}
System.out.println("---------------------------------------------------");
	// Create a String and print it in reverse order (Sunday → yadnuS).

		String day = "Sunday";
		for (int i = day.length()-1; i >= 0; i--) {//IT IS -1 IN LEGTH BECAUSE IT CONTROLS ELEMETNS--> 6 INSIDE BUT ONLY 5 INDEXES 
			System.out.print(day.charAt(i));
		}
		System.out.println();

System.out.println("---------------------------------------------------");
		/*
		 * Write a program that reads two people's first names 
		 * and if they expecting boy or girl? 
		 * 
		 * Based on the input suggests a name for a baby:
		 * 
		 * Example Output: Mom's first name? Mary 
		 * Dad's first name? Daniel 
		 * Boy or Girl? boy 
		 * 
		 * Suggested baby name: DANRY
		 * 
		 * Example Output:
		 * 
		 * Mom's first name? Mary 
		 * Dad's first name? Daniel 
		 * Boy or Girl? girl 
		 * Suggested baby name: MAIEL
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first name of the father");
		String father = scan.next();
		System.out.println("Please enter the first name of the mother");
		String mother = scan.next();
		System.out.println("Are you expecting a baby boy or a girl?");
		String baby = scan.next();

		if (baby.equalsIgnoreCase("boy")) {
			String firstHalf = father.substring(0, father.length() / 2);
			String secondHalf = mother.substring(mother.length() / 2);
			System.out.println("Suggested baby boy name " + firstHalf.trim() + secondHalf.trim());
		} else {
			String firstHalf = mother.substring(0, father.length() / 2);
			String secondHalf = father.substring(mother.length() / 2);
			System.out.println("Suggested baby girl name " + firstHalf.trim() + secondHalf.trim());
			scan.close();
		}
	}

}
