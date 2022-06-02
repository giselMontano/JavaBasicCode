package com.syntax.class8Java;

import java.util.Scanner;

public class WhenUseWhile {

	public static void main(String[] args) {
		/*
		 * Declare a secret number; you want to ask user to guess your secret number
		 * your code should keep asking to guess until user gets your secret number once
		 * user gets secret numbers -->you go it!
		 */
		int secretNum = 25;
		int guessNum;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Guess my secret number");
			guessNum = scan.nextInt();

		} while (guessNum != secretNum);

		System.out.println("You got it");
		scan.close();

	}

}
