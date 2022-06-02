package com.syntax.class3Java;

public class IfStaitment {

	public static void main(String[] args) {
		// declare a variable rate.
		// if rate is more than 5 --> i am not buying the house

		double mortgageRate = 5.5;// to the condition we use {}
		if (mortgageRate > 5) {
			System.out.println("I am not buying the house");
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		// double mortgageRate=4.5;
		// if (morgageRate>5) {System.out.println("I am buying a house ");}//it doesn't
		// have output because the condition must be true

		// Declare 2 variables and check if num1 is bigger than num2
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		int num1 = 99;
		int num2 = 10;
		if (num1 > num2) {
			System.out.println(num1 + " is bigger than " + num2);
		} // if the "if condition" is not met, it will not work and jump to else ELSE
			// statement, not ELSE statement not output..

		// * Declare a variable, if tempt is higher than 75-->i will go for a walk
		// OTHERWISE I am going to study JAVA

		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
		int temp = 78;
		if (temp > 75) {
			System.out.println("I will go for a walk");
		} else {
			System.out.println("I am going to study JAVA");
		}

		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
		int temp1 = 40;
		if (temp1 > 75) {
			System.out.println("I will go for a walk");
		} else {
			System.out.println("I am going to study JAVA");
		}

		System.out.println("---------------------------------------------------------------------------------------------------");
		
		// example with chart

		char gender = 'f';// if you change this into "m" it will change the input//never use "+" because
							// it will give you a weird result.//review
		if (gender == 'f') {
			System.out.println("You like shopping");
		} else {
			System.out.println("You like sports");
		}

		System.out.println("---------------------------------------------------------------------------------------------------");
		
		// example with string
		String browser = "chrome";// everything inside the string matter lower cases and upper cases/ case
									// sensitive //you can use "+"
		if (browser.equals("chome")) {
			System.out.println("All test cases will be executed o chrome");
		} // always use equal after "string" browser, that is a boolean expression
		else {
			System.out.print("I am not executing any test cases");// print only one line// you can also use "+"
			System.out.println(" Reason - wrong browser");
		}

	}

}
