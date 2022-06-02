package com.syntax.replitPractice;

public class ForLoopReplit {

	public static void main(String[] args) {

		/*
		 * 54-->Create a for loop that prints out numbers from 0 to 12 Must not include
		 * the number 12 in the output
		 * 
		 * Output:
		 * 
		 * 0 1 2 3 4 5 6 7 8 9 10 11
		 * 
		 */

		for (int i = 0; i < 12; i++) {
			System.out.println(i + " ");
		}
		
System.out.println("------------------------------------------------");
		
		/*
		 * 55-->Create a for loop that prints out EVEN numbers from 10 to 0 Must not
		 * include the number 0 in the output
		 * 
		 * Output:
		 * 
		 * 10 8 6 4 2
		 * 
		 */
		
		for (int i = 10; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		
System.out.println("------------------------------------------------");
		
		/*
		 * 56-->Create a for loop that prints out EVEN numbers from 2 to 14 using if
		 * condition Must include the number 14 in the output
		 * 
		 * Output:
		 * 
		 * 2 4 6 8 10 12 14
		 */
		for (int i = 2; i <= 14; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}

System.out.println("------------------------------------------------");

		/*
		 * 57-->Create a for loop that prints out ODD numbers from 5 to 22 Must NOT
		 * include the number 22 in the output
		 * 
		 * Expected Output:
		 * 
		 * 5 7 9 11 13 15 17 19 21
		 */
		
		for (int i = 5; i < 22; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " ");
			}
		}

System.out.println("------------------------------------------------");

		/*
		 * 58-->Using for loop print "Good Morning" 20 times
		 */
		for (int i = 1; i <= 20; i++) {
			System.out.println("Good Morning");
		}

System.out.println("------------------------------------------------");

		/*
		 * 59-->Write a program that prints the string "Hey, it is year: " and the years
		 * between 2011 and 2019. Must include year 2019 in the output
		 * 
		 * Output:
		 * 
		 * Hey, it is year: 2011 
		 * Hey, it is year: 2012 
		 * Hey, it is year: 2013 
		 * Hey, it is year: 2014 
		 * Hey, it is year: 2015 
		 * Hey, it is year: 2016 
		 * Hey, it is year: 2017
		 * Hey, it is year: 2018 
		 * Hey, it is year: 2019
		 */
		for (int i = 2011; i <= 2016; i++) {
			System.out.println("Hey it is year:" + i);
		}

System.out.println("------------------------------------------------");
		
		/*
		 * 60-->Write a program that prints the count down from 10 up to 1 and then says
		 * "Happy New Year!".
		 * 
		 * Output:
		 * 
		 * 10 9 8 7 6 5 4 3 2 1 Happy New Year!
		 */
		for (int i = 10; i >= 0; i--) {
			if (i == 0) {
				System.out.println("Happy New Year!");
			} else
				System.out.println(i + " ");
		}

System.out.println("------------------------------------------------");

		/*
		 * 61-->Write a program that uses for loop to prints multiplication of number 3
		 * from 1 to 10
		 * 
		 * Expected Output:
		 * 
		 * 3*1=3 
		 * 3*2=6 
		 * 3*3=9 
		 * 3*4=12 
		 * 3*5=15 
		 * 3*6=18 
		 * 3*7=21 
		 * 3*8=24
		 * 3*9=27 
		 * 3*10=30
		 */
		int num = 3;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + i * num);
		}

System.out.println("------------------------------------------------");

		/*
		 * 62-->Using for loop Print 1 to 10 Numbers except 5 and 6
		 * 
		 * Expected Output:
		 * 
		 * 1 2 3 4 7 8 9 10
		 * 
		 * 
		 */
		for (int i = 1; i <= 10; i++) {
			if (i == 5 || i == 6) {
				continue;
			}
			System.out.println(i);
		}
	}
}
