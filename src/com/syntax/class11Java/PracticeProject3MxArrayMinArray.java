package com.syntax.class11Java;

public class PracticeProject3MxArrayMinArray {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		int[] arr = { 10, 20, 50, 5, 8 };

		int maxNumber = arr[0];
		int minNumber = arr[0];

		for (int num : arr) {

			if (num > maxNumber) {
				maxNumber = num;
			}
			if (num < minNumber) {
				minNumber = num;
			}
		}

		System.out.println(maxNumber);
		System.out.println(minNumber);

	}

}
