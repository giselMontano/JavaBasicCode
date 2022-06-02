package com.syntax.class5Java;

import java.util.Scanner;

public class LogTask {

	public static void main(String[] args) {
		// Prompt the user to enter person heights in inches. Person should be
		// classified as one of the following:
		// short (under 60 inch)
		// medium(between 60 -72 inch)
		// tall (over 72 inch)

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your height in inches");

		double height = scan.nextDouble();
		if (height < 60) {
			System.out.println("Short");
		} else if (height >= 60 && height <= 72) {
			System.out.println("Medium");
		} else if (height > 72) {
			System.out.println("Tall");
		}

		System.out.println(
				"---------------------------------------------------------------------------------------------------");

		// Write a program that will print whether it is a weekend or weekday.
		// If any day from 1-5 → output “It is a weekday”, any day from 6-7 → output “It
		// is a weekend”, any other day → output “Invalid day”

		System.out.println("What is the day of the week day? Enter the number");

		int day = scan.nextInt();
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("It is a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}

		System.out.println(
				"---------------------------------------------------------------------------------------------------");

		// ANOTHER WAY TO SOLVE

		System.out.println("What is the day of the week day? Enter the number");

		int day1 = scan.nextInt();
		if (day1 >= 1 && day1 <= 5) {
			System.out.println("It is a weekday");
		} else if (day1 >= 6 && day1 <= 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}

		System.out.println(
				"---------------------------------------------------------------------------------------------------");

		// Ask user to enter a number and then define if number is small, medium or
		// large
		// Small number is value between 1 and 10
		// Medium number is value between 11 and 100
		// Large number is value between 101 and 1000

		System.out.println("Please enter a number between 1 and 1000");

		int num = scan.nextInt();
		if (num >= 1 && num <= 10) {
			System.out.println("Small");
		} else if (num >= 11 && num <= 100) {
			System.out.println("Medium");
		} else if (num >= 101 && num <= 1000) {
			System.out.println("Large");
		}
		scan.close();

	}

}
