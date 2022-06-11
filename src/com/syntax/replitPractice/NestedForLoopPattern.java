package com.syntax.replitPractice;

public class NestedForLoopPattern {

	public static void main(String[] args) {
		//PATTERN
		/*
		 * 66-->For you to do:
		 * 
		 * Write a program to print out the pattern:
		 * 
		 * syntax
		 * 
		 * syntax
		 * 
		 * syntax
		 * 
		 * syntax
		 * 
		 * syntax
		 * 
		 * syntax
		 */
		for (int a = 0; a < 3; a++) {
			System.out.println("syntax");
			System.out.println();
		}
		for (int b = 0; b < 3; b++) {
			System.out.println("syntax");
			System.out.println();
		}

System.out.println();

		/*
		 * 67-->For you to do:
		 * 
		 * Write a program to print out the pattern:
		 * 
		 * 1 2 3 4 5 6 7 8 9 10
		 * 
		 * 2 4 6 8 10 12 14 16 18 20
		 * 
		 * 3 6 9 12 15 18 21 24 27 30
		 * 
		 * 4 8 12 16 20 24 28 32 36 40
		 * 
		 * 5 10 15 20 25 30 35 40 45 50
		 */
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int j = 2; j <= 20; j += 2) {
			System.out.print(j + " ");
		}
		System.out.println();
		for (int k = 3; k <= 30; k += 3) {
			System.out.print(k + " ");
		}
		System.out.println();
		for (int l = 4; l <= 40; l += 4) {
			System.out.print(l + " ");
		}
		System.out.println();
		for (int m = 5; m <= 50; m += 5) {
			System.out.print(m + " ");
		}
		System.out.println();

System.out.println();
		
        /*
		 * 68-->For you to do:
		 * 
		 * Write a program to print out the pattern:
		 * 
		 * Expected output:
		 * 
		 * $$$$
		 * $  $
		 * $  $
		 * $$$$
		 */

		for (int c = 0; c < 2; c++) {
			System.out.println("$$$$");
			if (c == 1)
				continue;
			for (int e = 0; e < 2; e++) {
				System.out.println("$  $");
			}
		}

System.out.println();
		
        /*
		 * 69-->For you to do:
		 * 
		 * Write a program to print out the pattern:
		 * 
		 * Expected output:
		 * 
		 *  1 2 3 4 5 6 7 
		 *  1 2 3 4 5 6
		 *  1 2 3 4 5 
		 *  1 2 3 4 
		 *  1 2 3 
		 *  1 2 
		 *  1 
		 *  1 2 
		 *  1 2 3 
		 *  1 2 3 4 
		 *  1 2 3 4 5 
		 *  1 2 3 4 5 6 
		 *  1 2 3 4 5 6 7
		 */
		for (int f = 1; f <= 7; f++) {
			int h = 1;

			for (int g = f; g <= 7; g++) {

				System.out.print(h++ + " ");
			}
	System.out.println();
		    }
		
		for (int f1 = 2; f1 <= 7; f1++) {
			int h1 = 1;
			
			for (int g1 = 1; g1 <= f1; g1++) {
				
				System.out.print(h1++ + " ");
			}
			System.out.println();
		    }
	}

}
