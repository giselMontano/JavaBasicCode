package com.syntax.class9Java;

public class MultiplicationTableNestedLoop {

	public static void main(String[] args) {
		// How to create a multiplication table

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				System.out.println(x + " x " + y + " = " + (x * y));
			}
			System.out.println("-------------");
		}

	}

}
