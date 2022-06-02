package com.syntax.class5Java;

public class LogicalOper {

	public static void main(String[] args) {
		// Test two condition in one statement/TO TES ONE OR MORE CONDITION IN 1
		// STATEMENT
		// AND&&

		boolean job = true;
		double salary = 100000;
		if (job && salary >= 100000) {
			System.out.println("I am super duper happy");
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		// ANOTHER EXAMPLE

		boolean study = true;
		boolean homework = false;
		boolean practice = true;

		if (study && homework && practice) {
			System.out.println("you will succeed in the course");
		} else {
			System.out.println("You will struggle");
		}

		System.out.println("---------------------------------------------------------------------------------------------------");

		// ANOTHER EXAMPLE

		int num1 = 65;
		int num2 = 66;
		int num3 = 23;
		if (num1 > num2 && num1 > num3) {
			System.out.println("The largest number is " + num1);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("The largest number is " + num3);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("The largest number is " + num2);

		} else {
			System.out.println("All the numbers are equal");
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
		// OR|| //when one of the condition is true it will give TRUE
		// Monday and Friday -->No class
		// Tuesday and Wednesday--->Manual testing
		// Thursday -->Review
		// Saturday and Sunday--->Java
		//
		String day = "Saturday";

		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("I have no class");
		} else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("I have Manual Testing class");
		} else if (day.equals("Thursday")) {
			System.out.println("I have Review class");
		} else if (day.equals("Satuday") || day.equals("Saturday")) {
			System.out.println("I have Java class");
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
		// NOT! //REVERSE THE CONSITION
		boolean boo = !true;// false
		System.out.println(boo);
		boolean boo1 = !false;// true
		System.out.println(boo1);

		// IF THERE IS TRAFFIC -->I WILL NOT REACH WORK ON TIME
		boolean traffic = true;
		if (!traffic) {
			System.out.println("I will not reach work on time");
		} // no traffic
		else {
			System.out.println("I will be on time ");
		}

		String name = "Sara";
		if (!name.equals("Emre")) {
			System.out.println("You are not Emre, and I need Emre");
		}

		boolean checkboxSelected = false;
		if (!checkboxSelected) {
			System.out.println("Click on checkbox");

		}

	}

}
