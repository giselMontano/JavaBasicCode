package com.syntax.class8Java;

public class ForLoopTaskEvenOdd {

	public static void main(String[] args) {
		//WE CAN USE (i) AS MUCH AS WE WANT AS LONG IT IS INSIDE OF A LOPP MEANING INSIDE THE BRAKETS() 
		//NOT VISIBLE TO MAIN METHOT
		
		//Print numbers from 1 to 100 in 1 line with space
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		
		
		System.out.println();
		
		//Print numbers from 100 to 1
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();

		// Print EVEN numbers from 20 to 1 (2 ways)
		for (int i = 20; i >= 1; i -= 2) {
			System.out.print(i + " ");
		}

		System.out.println();
		
		// ANOTHER WAY EVEN
		for (int i = 20; i >= 1; i--) {
			if (i % 2 == 0) {

				System.out.print(i + " ");
			}
		}

		System.out.println();

		// Print ODD numbers between 20 and 50 (2 ways)
		for (int i = 21; i <= 50; i += 2) //starting point must be fix for ODD numbers
		{
			System.out.print(i + " ");
		}

		System.out.println();
		
		
		// ANOTHER WAY ODD
		for (int i = 20; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
