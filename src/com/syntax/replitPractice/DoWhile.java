package com.syntax.replitPractice;

public class DoWhile {

	public static void main(String[] args) {
		/*
		 * 51-->For you to do:
		 * 
		 * Using do while loop print numbers from 10 to 20
		 * 
		 * Must not include the number 20 in the output
		 * 
		 * Output:
		 * 
		 * 10 11 12 13 14 15 16 17 18 19
		 */
		int d = 10;
		do {
			System.out.println(d + " ");
			d++;
		} while (d < 20);

		
System.out.println();


		/*
		 * 52-->For you to do:
		 * 
		 * Create a do while loop that prints out "Hello World!" 5 times.
		 * 
		 * Output:
		 * 
		 * Hello World! Hello World! Hello World! Hello World! Hello World!
		 */
		int time = 1;
		do {
			System.out.println("Hello World!");
			time++;
		} while (time <= 5);
		
System.out.println();


		/*
		 * 53-->For you to do:
		 * 
		 * Using do while loop print even numbers from 20 to 1
		 * 
		 * Expected Output:
		 * 
		 * 20 18 16 14 12 10 8 6 4 2
		 */
		int a = 20;
		do {
			System.out.println(a + " ");
			a -= 2;
		} while (a >= 1);

	}

}
