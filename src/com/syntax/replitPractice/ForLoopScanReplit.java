package com.syntax.replitPractice;

import java.util.Scanner;

public class ForLoopScanReplit {

	public static void main(String[] args) {
		/*
		 * 63-->Given the following inputs: int x; Write a for loop that will print out
		 * a series of numbers starting at 0 and ending at the x(value must be taken
		 * from a user), exclusive. int x;
		 * 
		 * Example Output:
		 * 
		 * In: 3 0 1 2 
		 * In: 8 0 1 2 3 4 5 6 7 
		 * In: 5 0 1 2 3 4
		 */
		
		Scanner scan = new Scanner(System.in);
		int x;
		System.out.println("Please enter a number");
		x = scan.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.print(i + " ");
		}
		
System.out.println("----------------------------------------------");
		
		/*
		 * 64-->You should input: int end; Write a for loop that will print out a series
		 * of numbers starting at 0 and ending at the doubled value of end(value must be
		 * taken from a user), exclusive. Each number should be on the same line,
		 * separated by a space.
		 * 
		 * Output:
		 * 
		 * 0 1 2 3 4 5 6 7 8 9 10
		 * 
		 */

		int end;
		
		System.out.println("Please enter a number");
		end = scan.nextInt();
		end = end + end;

		for (int i = 0; i < end; i++) {

			System.out.print(i + " ");
		}
		
System.out.println("----------------------------------------------");
		
		/*
		 * 65-->Given the following inputs: int y; Write a for loop that will print out
		 * a series of numbers starting at one less than x and ending at 0.
		 * 
		 * Sample input/outputs:
		 * 
		 * In: 7 6 5 4 3 2 1 0 In: 12 11 10 9 8 7 6 5 4 3 2 1 0 In: 20 19 18 17 16 15 14
		 * 13 12 11 10 9 8 7 6 5 4 3 2 1 0
		 */
		System.out.println("Please enter a number");
		int y = scan.nextInt();
		y -= 1;

		for (int i = y; y >= -1; i--) {
			if (i <= -1)
				break;

			System.out.print(i + " ");
		}
		scan.close();
	}

}
