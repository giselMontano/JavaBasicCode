package com.syntax.replitPractice;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		/*
		 * 35-->For you to do:
		 * 
		 * Create a program that prompt user with question: "Do you need a loan?"(Use a
		 * boolean)
		 * 
		 * If the result is true then prompt user with question:
		 * "What is your credit score?". Otherwise eligibility is "Unknown"
		 * 
		 * Based on the score define users eligibility:
		 * 
		 * if score is below 600 --> eligibility = "Not eligible" if score is between
		 * 600 and 700 inclusive --> eligibility = "Maybe eligible" if score is between
		 * 701 and 800 inclusive --> eligibility = "Eligible" if score is higher than
		 * any other previous values --> eligibility = "Definitely eligible" .
		 * 
		 * Output:
		 * 
		 * The eligibility is ____
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you need a loan?");
		Boolean loan = scan.nextBoolean();
		
		if (loan == true) {
			System.out.println("What is your credit score?");
		} else {
			System.out.println("Unknown");
		}
		
		double score = scan.nextDouble();
		
		if (score < 600) {
			System.out.println("The eligibility is Not eligible");
		} else if (score >= 600 && score <= 700) {
			System.out.println("The eligibility is Maybe eligible");
		} else if (score >= 701 && score <= 800) {
			System.out.println("The eligibility is Eligible");
		} else if (score > 800) {
			System.out.println("The eligibility is Definitely eligible");
		} else {
			System.out.println("Unknown");
		}

System.out.println();

		/*
		 * 36-->For you to do:
		 * 
		 * Prompt user to input two strings : "Please enter two strings"and two
		 * integers: "Please enter two numbers"
		 * 
		 * and make the comparisons:
		 * 
		 * if int1 and int2 are equal and word1 and word2 are equal, output "AND" if
		 * int1 and int2 are equal or word1 and word2 are equal, output "OR" if int1 and
		 * int2 are not equal and word1 and word2 are not equal, output "NONE"
		 * 
		 * Example input/output:** word1: banana word2: banana int1: 2 int2: 2 Output:
		 * AND
		 * 
		 * Another Output: word1: banana word2: apple int1: 2 int2: 2 Output: OR
		 * 
		 * Another Output: word1: phone word2: pie int1: 2 int2: 3 Output: NONE
		 */

		System.out.println("Please enter the name of a fruit");
		String fruit = scan.next();
		
		System.out.println("Please enter the name of another fruit");
		String fruit2 = scan.next();
		
		System.out.println("Please enter one number");
		int num1 = scan.nextInt();
		
		System.out.println("Please enter second number");
		int num2 = scan.nextInt();

		if (num1 == num2 && fruit.equals(fruit2)) {
			System.out.println("AND");
		} else if (num1 == num2 || fruit.equals(fruit2)) {
			System.out.println("OR");
		} else if (num1 != num2 && !fruit.equals(fruit2)) {
			System.out.println("NONE");
		}
		
System.out.println();

		/*
		 * 37-->For you to do:
		 * 
		 * Take 2 boolean inputs from a user:
		 * 
		 * "Are you thirsty?"
		 * 
		 * "Are you sleepy?"
		 * 
		 * If user is thirsty and not sleepy--> drink=water
		 * 
		 * If user is thirsty and sleepy--> drink=coffee
		 * 
		 * If user is not thirsty and sleepy --> drink=tea
		 * 
		 * Otherwise drink="nothing"
		 * 
		 * Output:
		 * 
		 * Looks like you need to drink ___
		 */
		
		System.out.println("Are you thirsty");
		
		boolean ty = scan.nextBoolean();
		
		System.out.println("Are you sleepy");
		
		boolean sy = scan.nextBoolean();
		
		if (ty == true && sy == false) {
			System.out.println("Looks like you need to drink water");
		} else if (ty == true && sy == true) {
			System.out.println("Looks like you need to drink coffee");
		} else if (ty == false && sy == true) {
			System.out.println("Looks like you need to drink tea");
		} else {
			System.out.println("Looks like you need to drink nothing");
		}
		
System.out.println();

		/*
		 * 38-->For you to do:
		 * 
		 * Prompt user with a question: "Is it weekend?"
		 * 
		 * If it is not a weekend --> subject="manual testing"
		 * 
		 * Otherwise --> subject="Java"
		 * 
		 * Output:
		 * 
		 * Today you will be learning ____
		 */
		
		System.out.println("Is it a weekend");
		boolean wd = scan.nextBoolean();

		if (!wd == true) {
			System.out.println("Today you will be learning manual testing");
		} else {
			System.out.println("Today you will be learning Java");
		}
		
System.out.println();
		
		/*
		 * 39-->A school has following rules for grading system: a. 1 to 25 - F b. 25 to
		 * 45 - E c. 45 to 50 - D d. 50 to 60 - C e. 60 to 80 - B f. Above 80 - A Ask
		 * the user to enter marks and print the corresponding grade.
		 * 
		 * Example Output:
		 * 
		 * Please enter your mark Your grade is A
		 * 
		 * Example Output when invalid mark is placed:
		 * 
		 * Please enter your mark
		 * 
		 * Please enter valid mark
		 */
		System.out.println("Please enter your grade");
		int mark = scan.nextInt();
		
		if (mark > 1 && mark < 25) {
			System.out.println("Your grade is F");
		} else if (mark > 25 && mark <= 45) {
			System.out.println("Your grade is E");
		} else if (mark > 45 && mark <= 50) {
			System.out.println("Your grade is D");
		} else if (mark > 50 && mark <= 60) {
			System.out.println("Your grade is C");
		} else if (mark > 60 && mark <= 80) {
			System.out.println("Your grade is B");
		} else if (mark > 80) {
			System.out.println("Your grade is A");
		} else {
			System.out.println("Please enter valid mark");
		}
		scan.close();

	}

}
