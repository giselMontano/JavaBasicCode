package com.syntax.class9Java;

public class ReviewContinueBreak {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			for (int y = 1; y <= 3; y++) {
				continue;
				// System.out.println("Bye");
			}
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			for (int y = 1; y <= 3; y++) {
				System.out.println("Bye");
                    //break;
			}

		}
	}
}