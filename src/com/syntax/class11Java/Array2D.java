package com.syntax.class11Java;

public class Array2D {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.
		
		int[][] num = { { 10, 20, 30 }, { 20, 49, 69 }, { 90, 78, 67, 67 } };
		/*
		 * System.out.println(num[0][0]);//10 
		 * System.out.println(num[0][1]);//20
		 * System.out.println(num[2][3]);//67-->THIS IS HOW TO ACCCES TO INDEX
		 * System.out.println(num[0][0]);
		 * System.out.println(num[0][1]); 
		 * System.out.println(num[0][2]);
		 * System.out.println(num[1][0]); 
		 * System.out.println(num[1][1]);
		 * System.out.println(num[1][2]); 
		 * System.out.println(num[2][0]);
		 * System.out.println(num[2][1]); 
		 * System.out.println(num[2][2]);
		 */

		int sum = 0;
		for (int j = 0; j < num.length; j++) {

			for (int i = 0; i < num[j].length; i++) {
				sum = sum + num[j][i];
			}

		}
		System.out.println(sum);

	}

}
