package com.syntax.replitPractice;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		/*
		 * 20-->For you to do:
		 * 
		 * Write a program that takes user's first name and last name and prints in
		 * console
		 * Instruct the user to enter first name: "Please Enter First Name"
		 * Capture the first name
		 * Instruct the user to enter last name:"Please Enter Last Name"
		 * Capture last name
		 * Print first name and last name
		 * 
		 * Final Output:
		 * 
		 * Example: Please Enter First Name Please Enter Last Name Cindy Crawford
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter First Name");
		String firstName = scan.next();
		System.out.println("Please Enter Last Name");
		String lastName = scan.next();

		System.out.println(firstName + " " + lastName);

		System.out.println("---------------------------------");
		
		/*
		 * 21-->For you to do:
		 * 
		 * Write a program that asks the user's age: "Enter your age "
		 * Then display it by adding 10 (i.e age + 10) in your final output.
		 * 
		 * Example Output:
		 * 
		 * Enter your age 30 Your age after 10 years is 40
		 */
		
		System.out.println("Enter your age");
		int age = scan.nextInt();
		int add = 10;
		int result = age + add;
		System.out.println("Your age after 10 years is " + result);
		
		System.out.println("-----------------------------------");
		
		/*
		 * 22-->For you to do:
		 * 
		 * Write a program to take user name, age and mobile number
		 * First Output: "Enter your name"
		 * Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
		 * Third Output: "Enter your age"
		 * 
		 * Example Output:
		 * 
		 * Enter your name Enter your mobile number Enter your age Your name is Weqas,
		 * your age is 45 and your mobile number is 123-456-7890
		 */
		System.out.println("Enter your name");
		String name = scan.next();

		System.out.println("Enter your mobile number");
		String phone = scan.next();

		System.out.println("Enter your age");
		int agE = scan.nextInt();

		System.out.println("Your name is " + name + "," + " your age is " + agE + " and your mobile number is " + phone);
		
		System.out.println("--------------------------------------");
		
		/*
		 * 23-->For you to do:
		 * 
		 * Create a program that will ask a user to input boolean value
		 * "Input the boolean value"
		 * If the input is true or false, then the output should look like below:
		 * 
		 * Example Output:
		 * 
		 * Input the boolean value The value is true 
		 * 
		 * Example Output:
		 * 
		 * Input the boolean value The value is false
		 */
		System.out.println("Input the boolean value");
		boolean a = scan.nextBoolean();

		if (a) {
			System.out.println("The value is " + a);
		} else {
			System.out.println("The value is false");
		}
		
		System.out.println("-----------------------------------------");
		
		/*
		 * 24-->For you to do:
		 * 
		 * Write a program that takes a user's name and prints it.
		 * 
		 * Example Output:
		 * 
		 * Hello, please enter your name Your name is Sumair
		 */
		System.out.println("Hello, please enter your name");
		String namE = scan.next();
		System.out.println("Your name is " + namE);
		scan.close();
		
		System.out.println("------------------------------------------");
		
		
	}

}
