package com.syntax.class9Java;

public class EnhanceForLoop {

	public static void main(String[] args) {
		// ENHANCE FOR LOOP/ ADVANCED FOR LOOP/ FOR EACH LOOP
		// CAN BE USED ONLY WHEN WE WORK WITH ARRAY
		// OR COLLECTIONS

		String[] colors = { "pink", "blue", "white", "black" };
		for (String printAll : colors) {
			System.out.print(printAll + " ");
		}

		System.out.println();

		// ENHANCE FOR LOOP INT; IT KNOWS WHERE TO ENTER

		int[] numbers = { 10, 20, 30, 40 };
		for (int total : numbers) {
			System.out.print(total + " ");
		}
	}

}
