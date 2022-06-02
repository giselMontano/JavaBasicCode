package com.syntax.class5Java;

import java.util.Scanner;

public class ScannerClassImportant {

	public static void main(String[] args) {
		// Scanner types
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter name");
		String name = scan.nextLine();// capture String one value next()/ capture a complete value John Smith
										// nextlLine()
		System.out.println(name);

		System.out.println("Please enter your age");
		int age = scan.nextInt();// capture int
		System.out.println(age);

		System.out.println("Please enter price");
		double price = scan.nextDouble();// capture double
		System.out.println(price);

		System.out.println("Please enter boolean");
		boolean boo = scan.nextBoolean();// capture boolean true or false
		System.out.println(boo);

		System.out.println("Please enter any charater");
		char character = scan.next().charAt(3);// capture 1 character/ the first character for example JOHN it will get
												// 1J-2O-3H-4N
		System.out.println(character);
		
		
		System.out.println("-------------------------------------------------------------------------------------------------------");

		// CHAR EXAMPLE
		System.out.println("Please enter gender: M or F");
		char gender = scan.next().charAt(0);

		System.out.println("Please enter your age");
		int age1 = scan.nextInt();

		if (age1 > 25 && gender == 'F') {
			System.out.println("Woman");
		} else if (age1 < 25 && gender == 'F') {
			System.out.println("Girl");
		} else if (age1 > 25 && gender == 'M') {
			System.out.println("Man");
		} else if (age1 < 25 && gender == 'M') {
			System.out.println("Boy");
			
		}

		System.out.println("--------------------------------------------------------------------------------------------------------");

		// CHAR ANOTHER WAY System.out.println("Please enter gender: M or F");
		char gender1 = scan.next().charAt(0);

		System.out.println("Please enter your age");
		int age2 = scan.nextInt();

		if (age2 > 25) {
			if (gender1 == 'F') {
				System.out.println("Woman");
			} else if (gender1 == 'M') {
				System.out.println("Man");
			}
		} else {
			if (gender1 == 'F') {
				System.out.println("Girl");
			} else if (gender1 == 'M') {
				System.out.println("Boy");
				scan.close();
			}
		}

	}

}
