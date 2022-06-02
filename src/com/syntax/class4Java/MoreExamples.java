package com.syntax.class4Java;

public class MoreExamples {

	public static void main(String[] args) {
		// // boolean variables don't need (>,<,==, etc)

		boolean mothersDay = true;

		if (mothersDay) {
			System.out.println("Happy Mother's day to all Moms");
		} // true statement

		else {
			System.out.println("Hello");
		} // false statement
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		boolean mothersDay1 = false;

		if (mothersDay1) {
			System.out.println("Happy Mother's day to all Moms");
		} // true statement

		else {
			System.out.println("Hello");
		} // false statement
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		// Another example with false
		boolean rain = false;
		if (rain) {
			System.out.println("I will take an umbrela");
		} else {
			System.out.println("No need umbrealla");
		} // false statement
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		// another example with true
		boolean breakTime = true;
		if (breakTime) {
			System.out.println("Let's take a break");
		} // true statement
		else {
			System.out.println("Continue class");
		}
	}

}
