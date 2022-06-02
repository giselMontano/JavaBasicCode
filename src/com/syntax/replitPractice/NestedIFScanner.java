package com.syntax.replitPractice;

import java.util.Scanner;

public class NestedIFScanner {

	public static void main(String[] args) {
		/*
		 * 31-->For you to do:
		 * 
		 * Declare boolean variable isSunny, ask the user "Is it sunny outside?"
		 * Declare int temperature and ask user "What is the temperature outside?"
		 * 
		 * Your program should check:
		 * 
		 * If the weather is sunny output should be
		 * "It is a sunny day, I should go somewhere!"
		 * 
		 * If it is not sunny output should be "I stay home and practice Java"
		 * 
		 * If the weather is sunny you want to check the temperature
		 * "What is the temperature outside?"
		 * 
		 * If the temperature is higher than 85 then "I am going to the beach"
		 * 
		 * otherwise, "I am going to the park"
		 * 
		 * Example Output:
		 * 
		 * Is it sunny outside? It is a sunny day, I should go somewhere! What is the
		 * temperature outside? I am going to the beach! Example Output:
		 * 
		 * Is it sunny outside? I stay home and practice Java! Example Output:
		 * 
		 * Is it sunny outside? It is a sunny day, I should go somewhere! What is the
		 * temperature outside? I am going to the park!
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Is it sunny outside?");
		boolean isSunny = scan.nextBoolean();

		if (isSunny == true) {
			System.out.println("It is a sunny day, I should go somewhere!");
			System.out.println("What is the temperature outside?");
			int temp = scan.nextInt();
			if (temp > 85) {
				System.out.println("I am going to the beach");
			} else {
				System.out.println("I am going to the park");
			}
		} else {
			System.out.println("I stay home and practice Java");
		}
		
		System.out.println("-----------------------------------------------------");
		
		/*
		 * 32-->For you to do:
		 * 
		 * Ask the user to enter his/her gender "Please enter your gender: M or F" and
		 * their age "Please enter your age"
		 * 
		 * You have 2 conditions:
		 * 
		 * If age is above 25, then check if a user entered F then the output should be
		 * "Woman" otherwise it should say "Man"
		 * 
		 * If age is below 25, then check if a user entered F then the output should be
		 * "Girl" otherwise it should say "Boy"
		 * 
		 * Example Output:
		 * 
		 * Please enter your gender: M or F Please enter your age Man Example Output:
		 * 
		 * Please enter your gender: M or F Please enter your age Boy Example Output:
		 * 
		 * Please enter your gender: M or F Please enter your age Woman Example Output:
		 * 
		 * Please enter your gender: M or F Please enter your age Girl
		 */
		System.out.println("Please enter your gender: M or F");
		char gender;
		gender = scan.next().charAt(0);

		System.out.println("Please enter your age");
		int age = scan.nextInt();

		if (age > 25 && gender == 'F') {
			System.out.println("Woman");
		} else if (age < 25 && gender == 'F') {
			System.out.println("Girl");
		} else if (age > 25 && gender == 'M') {
			System.out.println("Man");
		} else if (age < 25 && gender == 'M') {
			System.out.println("Boy");
		}
		
		System.out.println("---------------------------------------------------");

		/*
		 * 33-->For you to do:
		 * 
		 * Ask the user to enter any number
		 * 
		 * if a user enters a number and it is even, print "Value is even", after that
		 * it should check if the number is greater than 1000 it should also print even
		 * number is large otherwise even value is just right. 
		 * 
		 * if number is not even it should print number is odd after that it should check if odd number is
		 * greater than 1000 it should say odd value is large otherwise odd value is
		 * just right
		 ** 
		 * Example Output: for 33** Please enter a number
		 *
		 * Value is odd
		 * 
		 */
		System.out.println("Please enter a number");
		int num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println("Value is even");
			if (num % 2 == 0 && num > 1000) {
				System.out.println("Even value is large");
			} else {
				System.out.println("Even value is just right");
			}
		} else if (num % 2 > 0) {
			System.out.println("Value is odd");
			if (num % 2 > 0 && num > 1000) {
				System.out.println("Odd value is just right");
			} else {
				System.out.println("Odd value is just right");
			}
		}
		
		System.out.println("-----------------------------------------------");
		
		/*
		 * Write a program to find the largest number among three distinct numbers using
		 * nested if condition
		 * 
		 * Please use Scanner class to take input from users
		 * 
		 * Expected Output:
		 * 
		 * Please enter 3 distinct numbers 4 5 and 14 The largest number is 14
		 */
		int value1 = scan.nextInt();

		int value2 = scan.nextInt();

		int value3 = scan.nextInt();
		if (value1 > value2 && value1 > value3) {
			System.out.println("The largest number is " + value1);
		} else if (value2 > value1 && value2 > value3) {
			System.out.println("The largest number is " + value2);
		} else if (value3 > value1 && value3 > value2) {
			System.out.println("The largest number is " + value3);
		}
		scan.close();

	}

}
