package com.syntax.class11Java;

import java.util.Arrays;
import java.util.Scanner;

public class Intro2DArrayScan {

	public static void main(String[] args) {
		//Using scanner create an array of integer values. after the array is created,
		//calculate the sum of all stored elements in the array
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the size of the array you want to reate");
		int arraySize = scan.nextInt();

		System.out.println("The size of the array is " + arraySize);
		int[] integerArray = new int[arraySize];//creating an array size that will be entered by user

		// we can't use enhance loop for inserting or updating the value of an array
		System.out.println("Please enter " + arraySize + " elements");
		for (int i = 0; i < integerArray.length; i++) {
			integerArray[i] = scan.nextInt();//taking the input from the user and storing it inside the array
		}
		System.out.println(Arrays.toString(integerArray));// PRINT THE ELEMENTS OF THE ARRAY

		int sum = 0;
		for (int total : integerArray) {//total is new variable to be store all the sum
			sum = sum + total;

		}
		System.out.println("The sum of all the elements is " + sum);
        scan.close();
	}

}
