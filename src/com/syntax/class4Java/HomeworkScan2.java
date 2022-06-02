package com.syntax.class4Java;

import java.util.Scanner;

public class HomeworkScan2 {

	public static void main(String[] args) {
		// //2. Create a java program in which using Scanner you are going to capture 2
		// numbers.
		// And once you capture 2 numbers, please check which one is the largest.
		Scanner scan = new Scanner(System.in);

		System.out.println("Provide one number");

		int a = scan.nextInt();

		System.out.println("Provide the second number");

		int b = scan.nextInt();

		if (a > b) {
			System.out.println(a + " is the largest number");
		} else {
			System.out.println(b + " is the largest");
			scan.close();
		}

	}

}
