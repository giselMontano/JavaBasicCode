package com.syntax.class5Java;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {
		// //2. Create a Java program that will ask if user has a credit card or not.
		// If you user does not have a credit card then offer them. If they do have one
		// ask what is balance on the card?
		// If balance of the card is larger than 1000, tell them to pay off immediately,
		// otherwise you can tell them that they can spend more.
		Scanner scan = new Scanner(System.in);

		System.out.println("Do you have a credit card? yes or no");
		String answer = scan.next();
		// This equalsigonreCase is only for string, allow to enter any kind capital
		// letters or lower letters/no,NO,No,nO

		if (answer.equalsIgnoreCase("no")) {
			System.out.println("Do you want to apply for one card");

		} else {
			System.out.println("What is the balance on the card");
		}
		int balance = scan.nextInt();

		if (balance > 1000) {
			System.out.println("Pay it off inmediately");

		} else {
			System.out.println("You can spend more");
			scan.close();
		}

	}

}
