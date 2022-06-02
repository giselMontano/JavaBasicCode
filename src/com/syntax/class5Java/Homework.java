package com.syntax.class5Java;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// You are a loan specialist and you need to ask user what is the amount of loan
		// is needed.
		// If loan is less or equal to 200,000 then you would lend the money otherwise
		// you would reject the client.
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter amount of loan needed");
		double loan = scan.nextDouble();

		if (loan <= 200000) {
			System.out.println("You are approve for the loan");
		} else {
			System.out.println("I am sorry you dont reach the requirements for the loan");
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		// Create a Java program that will ask user to input city and temperature.
		// Your program should convert Fahrenheit into celsius and print “The
		// temperature is the city __ is __”

		System.out.println("Please enter your city");

		String city = scan.next();
		city += scan.nextLine();

		System.out.println("Please enter the temperature");
		int fahrenheit = scan.nextInt();
		int temp = (fahrenheit - 32) * 5 / 9;

		System.out.println("The temperature is " + temp + " degrees celsius, the city is " + city);
		scan.close();
	}

}
