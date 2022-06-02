package com.syntax.replitPractice;

import java.util.Scanner;

public class ConditionalStatementScanner {

	public static void main(String[] args) {
		/*
		 * 25-->For you to do:
		 * 
		 * The variable "num" holds an integer input from a user Write a conditional
		 * statement starting on line 9 that does the following:
		 * 
		 * If num is positive, print "__ is positive" 
		 * If num is negative, print "__ is negative" 
		 * If num is equals to 0, then print "Entered number is equals to 0" 
		 * 
		 * Examples:
		 * 
		 * In: 5 5 is positive 
		 * In: -2 -2 is negative 
		 * In: 0 
		 * Entered number is equals to 0
		 */
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		int num = inp.nextInt();
		// DO NOT CHANGE ABOVE CODE! Write your code below

		if (num > 0) {
			System.out.println(num + " is positive");
		} else if (num < 0) {
			System.out.println(num + " is negative");
		} else {
			System.out.println("Entered number is equals to 0");
		}
		
		System.out.println("------------------------------------");
		
		/*
		 * 26-->For you to do:
		 * 
		 * The variable "name" holds a String user input
		 * 
		 * Write a conditional statement starting on line 9 that does the following:
		 * 
		 * If name is equal to "Chen", print "teacher" 
		 * For any other input, print "student" 
		 * 
		 * Examples: 
		 * 
		 * In: Chen teacher 
		 * 
		 * In: Faa student 
		 * 
		 * Hint: for your if
		 * condition use if(name.equals("Chen")) - we haven't study it yet, but this is
		 * code to compare Strings. We will cover this topic soon.
		 */
		
		System.out.print("In:");
		String name = inp.next();
		// DO NOT CHANGE ABOVE CODE! Write your code below
		if (name.equals("Chen")) {
			System.out.println("teacher");
		} else {
			System.out.println("student");
		}
		
		System.out.println("---------------------------------------");

		/*
		 * 27-->For you to do:
		 * 
		 * Write a Java program to ask age "Please enter your age".
		 * 
		 * Based on the age define whether the user is eligible to vote or not.
		 * 
		 * A person who is eligible to vote must be older or equal to 18 years old and
		 * the program will show "You are eligible to vote".
		 * 
		 * Otherwise, the program will show "You are not eligible to vote".
		 * 
		 * Examples:
		 * 
		 * Please enter your age 18 You are eligible to vote Please enter your age 16
		 * You are not eligible to vote
		 */
		System.out.println("Please enter your age");
		int age = inp.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		}
		
		System.out.println("------------------------------------------");
		
		/*
		 * 28-->For you to do:
		 * 
		 * Write a program to take values of length and width from the user.
		 * 
		 * Based on value define whether the shape is a square or rectangle.
		 * 
		 * Examples:
		 * 
		 * Please enter the length 18 Please enter the width 16 The shape of your object
		 * is rectangle 
		 * 
		 * Please enter the length 16 Please enter the width 16 The shape
		 * of your object is square
		 */
		
		System.out.println("Please enter the length");
		int le = inp.nextInt();
		System.out.println("Please enter the width");
		int wi = inp.nextInt();
		if (le == wi) {
			System.out.println("The shape of your object is square");
		} else {
			System.out.println("The shape of your object is rectangle");
		}
		
		System.out.println("--------------------------------------------");
		
		/*
		 * 29-->For you to do:
		 * 
		 * Write a java program that prints out true if ( x * y ) returns a positive
		 * value. Else prints out false if (x * y) returns a negative value.
		 * 
		 * Step 1: Your program should ask "Please enter first number" - for the 1st
		 * number and "Please enter second number" - for the 2nd number.
		 * 
		 * Step 2: Create if condition to check if the multiplication of x and y values
		 * is positive or negative.
		 * 
		 * If the result of a multiplication is positive print true, otherwise print
		 * false.
		 * 
		 * Example Output:
		 * 
		 * Please enter first number Please enter second number true 
		 * 
		 * Example Output:
		 * 
		 * Please enter first number Please enter second number false 
		 * 
		 * IMPORTANT: Must use a Scanner class
		 */
		System.out.println("Please enter first number");
		double num1 = inp.nextDouble();
		System.out.println("Please enter second number");
		double num2 = inp.nextDouble();
		if (num1 * num2 > 0) {
			System.out.println("true");
		} else if (num1 * num2 < 0) {
			System.out.println("false");
		}
		
		System.out.println("--------------------------------------------");
		
		/*
		 * 30-->For you to do:
		 * 
		 * Write a program to take the month number from a user.
		 * 
		 * Provide month name to the corresponding month number
		 * 
		 * If a user provides any number that is out of month range, the program should
		 * display "Invalid"
		 * 
		 * IMPORTANT: use Scanner Class
		 * 
		 * Example Output:
		 * 
		 * Please enter month number 1 January Example Output:
		 * 
		 * Please enter month number 33 Invalid
		 */
		System.out.println("Please enter month number");
		int nuM = inp.nextInt();
		if (nuM == 1) {
			System.out.println("January");
		} else if (nuM == 2) {
			System.out.println("February");
		} else if (nuM == 3) {
			System.out.println("March");
		} else if (nuM == 4) {
			System.out.println("April");
		} else if (nuM == 5) {
			System.out.println("May");
		} else if (nuM == 6) {
			System.out.println("June");
		} else if (nuM == 7) {
			System.out.println("July");
		} else if (nuM == 8) {
			System.out.println("August");
		} else if (nuM == 9) {
			System.out.println("September");
		} else if (nuM == 10) {
			System.out.println("October");
		} else if (nuM == 11) {
			System.out.println("November");
		} else if (nuM == 12) {
			System.out.println("December");
		} else {
			System.out.println("Invalid");
		}
		inp.close();

	}

}
