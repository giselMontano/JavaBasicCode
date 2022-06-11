package com.syntax.replitPractice;

public class Arrat2D {

	public static void main(String[] args) {
		/*
		 * 79-->For you to do:
		 * 
		 * Write a program to print values from a 2D array
		 * 
		 * Example Output:
		 * 
		 * 1.4 2.0 3.3 2.0 
		 * 4.0 1.5 6.1 1.0 
		 * 1.2 3.1 4.0 1.6
		 */

		double array[][] = {
				           { 1.4, 2.0, 3.3, 2.0 }, 
				           { 4.0, 1.5, 6.1, 1.0 }, 
				           { 1.2, 3.1, 4.0, 1.6 } 
				           };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
System.out.println();

		/*
		 * 80-->For you to do:
		 * 
		 * Write a program to double the values of every element in the array and print
		 * it out.
		 * 
		 * Example Output:
		 * 
		 * 2.8 4.0 6.6 4.0 
		 * 8.0 3.0 12.2 2.0 
		 * 2.4 6.2 8.0 3.2
		 */
		double num[][] = {
                { 2.8, 4.0, 6.6, 4.0 },
                { 8.0, 3.0, 12.2, 2.0}, 
                { 2.4, 6.2, 8.0, 3.2 } };
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
System.out.println();

		/*
		 * 81-->For you to do:
		 * 
		 * Write a program that prints the highest value in the array.
		 * 
		 * Expected Output: 
		 * 
		 * input 
		 * 
		 * [5,4,8]
		 * 
		 * 8
		 */
		int numbers[] = { 5, 4, 8 };
		
		int maxNum = numbers[0];
		
		for (int max : numbers) {
			if (max > maxNum) {
				maxNum = max;
			}
		}
		System.out.println(maxNum);
System.out.println();
		/*
		 * 82-->For you to do:
		 * 
		 * Write a program that will print the sum of all elements in 2D array. 
		 * 
		 *  {-5,-2,-3,7}, {1,-5,-2, 2}, {1,-2, 3,-4}
		 * 
		 * Expected Output:
		 * 
		 * -9
		 */
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}

		}
		System.out.println(sum);
		System.out.println();
		/*
		 * 83-->For you to do:
		 * 
		 * Write a program that calculates the SUM of elements from each row in a 2D
		 * array.
		 * 
		 * For example, if we run rowSums for the following 2D array:
		 * 
		 * { {1,1,2}, //sum = 4 {3,1,2}, //sum = 6 {3,5,3}, //sum = 11 {0,1,2} //sum = 3
		 * }
		 * 
		 * Then we should get the following array back:
		 * 
		 * 4 6 11 3
		 */
		int[][] arr = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};

		int sum1;
		for (int i = 0; i < arr.length; i++) {
			sum1 = 0;
			for (int j = 0; j < arr[i].length; j++) {

				sum1 += arr[i][j];
			}
			System.out.println(sum1);
		}

System.out.println();
		/*
		 * 84-->For you to do:
		 * 
		 * Write a program that prints the total number of elements that are negative
		 * AND odd
		 * 
		 * Output: 
		 * 
		 * for example -3 is both negative and odd
		 * 
		 * 3
		 */
	}

}
