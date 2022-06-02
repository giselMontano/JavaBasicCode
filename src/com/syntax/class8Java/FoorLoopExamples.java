package com.syntax.class8Java;

public class FoorLoopExamples {

	public static void main(String[] args) {
		// I need to print numbers from 1 to 90

		for (int i = 1; i <= 90; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		/* specify START POINT 
		 * END POINT 
		 * increment/decrement
		 */
		
		
		// I need number from 60 to 10

		for (int i = 60; i >= 10; i--) {
			System.out.print(i + " ");
		}
		
		
		System.out.println();
		
		
		//incrementing by 5
		for (int i = 5; i <= 40; i += 5) {
			System.out.print(i + " ");
		}
	}

}
