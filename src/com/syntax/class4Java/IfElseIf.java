package com.syntax.class4Java;

public class IfElseIf {

	public static void main(String[] args) {
		// Declare 2 numbers and verify which one is the largest

		int z = 20;
		int x = 67;
		if (z > x) {
			System.out.println(z + " is larger than " + x);
		} else {
			System.out.println(x + " is larger than " + z);
		}

		System.out.println("--------------------------------------------------------------------------------------------------");

		// multiple conditions
		int num1 = 20;// TEST YOUR CODE WITH DIFFERENT NUMBERS IN CASE YOU NEED ANOTHER VALUE YOU CAN
						// ADD "ELSE IF"
		int num2 = 20;// if you change this in same values you add "ELSE IF"

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		}

		else if (num2 > num1) {
			System.out.println(num2 + " is larger than " + num1);
		}

		else {
			System.out.println(num1 + " is equal to " + num2);
		}

		System.out.println("---------------------------------------------------------------------------------------------------");

		// ladder if; java goes one by one until find the true condition is met once it
		// is met it execute the program.

		int day = 7;// if you have 9 you can add else in order to have an output otherwise you will
					// have no output.

		if (day == 1) {
			System.out.println("Monday}");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("sunday");
		}

		System.out.println("---------------------------------------------------------------------------------------------------");

		// Task; Create a Java program and declare int variable that will hold a month.
		// Based on the value of the variable your program should print the name of the
		// month.

		int month = 13;
		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("Octuber");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		} else {
			System.out.println("Happy new year");
		}

		System.out.println(
				"---------------------------------------------------------------------------------------------------");

		// write a program to check
		// whether number is positive or negative

		boolean number = true;
		if (number) {
			System.out.println("It is positive");
		} else {
			System.out.println("It is negative ");
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		int a = 0;
		if (a > 2) {
			System.out.println(a + " it is positive");
		} else if (a == 0) {
			System.out.println(a + " is not positive or negative ");
		} // (a=0) do not forget to put == need a boolean expression (>,<,==,+!,etc)
		else {
			System.out.println(a + " is negative");
		}

	}

}
