package com.syntax.class3Java;

public class IfNoBraces {

	public static void main (String[] args) {
		
		
		String time = "morning";// check the "if" condition has to be met otherwise else. this variable is the
								// one that changes.

		if (time.equals("Morning")) {
			System.out.println("Say good morning");
		} else {
			System.out.println("Say good day");
		}

		System.out.println("End of the code");
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
// Without the curly braces
		String time1 = "Morning";

		if (time1.equals("Morning"))
			System.out.println("Say good morning");
		else
			System.out.println("Say good day");
		System.out.println("or say evening");// you don't have curly braces and java process everything together.

		System.out.println("End od the code");

	}

}
