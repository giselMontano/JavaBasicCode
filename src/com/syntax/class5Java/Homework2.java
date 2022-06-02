package com.syntax.class5Java;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// Write a program to ask user to enter numbers of worked years and annual
		// salary. If user worked for more or equals to 5 years than user is eligible
		// for the bonus,
		// otherwise he is not. Once user is eligible and salary is larger than 50000
		// than bonus = 5000, otherwise bonus=3000.
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Please enter number of years worked in the company");
		double years = scan.nextDouble();

		if (years >= 5) {
			System.out.println("You are elegible for a bonus");
			System.out.println("Please enter anual salary");
			double salary = scan.nextDouble();

			if (salary >= 50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}
		} else {
			System.out.println("You are not elgible for a bonus");

		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		// Write a program that will ask user to input inputs the current time (use 24
		// hour format).
		// Based on the given time define:
		// if hour is between 1-11 --> Morning
		// if hour between 12-15 --> Afternoon
		// if hour between 16-20 --> Evening
		// if hour between 21-24 --> Night

		System.out.println("Current time");
		int time = scan.nextInt();

		if (time >= 1 && time <= 11) {
			System.out.println("Morning");
		} else if (time >= 12 && time <= 15) {
			System.out.println("Afternoon");
		} else if (time >= 16 && time <= 20) {
			System.out.println("Evening");
		} else if (time >= 21 && time <= 24) {
			System.out.println("Night");
		} else {
			System.out.println("Invalid time entered");
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		// Write a program for user to enter his/hers birth month. Based on the month
		// define the season.
		// Example: if user is born in March, April, May → season =“Spring”
		// if user is born in June, July, August →
		// season =“Summer” etc …
		// At the end of the program we should see output as “You were born is season
		// ______“.
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		System.out.println("Please enter your month of birth");
		String month = scan.next();

		if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("You were born in Spring");
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			System.out.println("You were born in Summer");
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("Octuber")
				|| month.equalsIgnoreCase("November")) {
			System.out.println("You were born in Autumn");
		} else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")
				|| month.equalsIgnoreCase("February")) {
			System.out.println("You were born in winter");
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		// 6. Write a program that will read three inputs of scores (quiz, mid term, and
		// final scores) and determine the grade based on the following rules:
		// if the average score >=90 → grade=A
		// if the average score >= 70 and <90 → grade=B
		// if the average score>=50 and <70 → grade=C
		// if the average score<50 → grade=F

		System.out.println("Please enter your quiz score");
		int quiz = scan.nextInt();
		System.out.println("Plase enter your mid term score");
		int mid = scan.nextInt();
		System.out.println("Please enter your final score");
		int fin = scan.nextInt();

		int ave = (quiz + mid + fin) / 3;
		System.out.println("Your average score is" + ave);

		if (ave >= 90) {
			System.out.println("Grade A");
		} else if (ave >= 70 && ave < 90) {
			System.out.println("Grade B");
		} else if (ave >= 50 && ave < 70) {
			System.out.println("Grade C");
		} else if (ave < 50) {
			System.out.println("Grade F");
		}
		scan.close();

	}

}
