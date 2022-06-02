package com.syntax.replitPractice;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 * 46-->Using while loop print numbers from 0 to 8
		 * 
		 * Output:
		 * 
		 * 0 1 2 3 4 5 6 7 8
		 */
		int a = 0;
		while (a <= 8) {
			System.out.print(a + " ");
			a++;
		}

System.out.println();

		/*
		 * 47-->For you to do:
		 * 
		 * Using while loop print numbers from 15 to 0
		 *
		 * Example Output:
		 * 
		 * 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
		 */

		int b = 15;
		while (b >= 0) {
			System.out.println(b + " ");
			a--;
		}

System.out.println();

		/*
		 * 48-->For you to do:
		 * 
		 * Using while loops that print out even numbers from 1 to 13
		 ** 
		 * Example Output:** 2 4 6 8 10 12
		 */

		int c = 2;
		while (c <= 13) {
			System.out.println(c + " ");
			c += 2;
		}

System.out.println();

		/*
		 * 49-->For you to do:
		 * 
		 * Write a java program to print "Hello Syntax Team! How are you?" three times
		 * using the while loop
		 */

		int time = 1;
		while (time <= 3) {
			System.out.println("Hello Syntax Team! How are you?");
			time++;
		}
		
System.out.println();

		/*
		 * 50-->For you to do:
		 * 
		 * Step 1: Initialize the i value as int i=7.
		 * 
		 * Step 2: Write a program to print a sequence of numbers starting from 7 to 98.
		 * 
		 * Output:
		 * 
		 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98
		 */
		int i = 7;
		while (i <= 98) {
			System.out.println(i + " ");
			i += 7;
		}

	}
}
