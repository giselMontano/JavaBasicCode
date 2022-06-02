package com.syntax.class8Java;

public class ForLoopIntro {

	public static void main(String[] args) {
		// I wan to say good morning 5 times

		// 5 times is execute
		for (int i = 1; i <= 5; i++) {
			System.out.println("Good morning");
		} // 5

		System.out.println();

		// Can not run because the condition is false 1 is not big than 5
		for (int i = 1; i >= 5; i++) {
			System.out.println("How you doinnn");
		} // 0

		System.out.println();
		for (int i = 1; i <= 5; i--) {
			System.out.println("Good morning");
		} // infinite loop 

	}
}
