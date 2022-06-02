package com.syntax.class4Java;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean vaccine = true;
		int dose = 2;

		if (vaccine) {
			System.out.println("Let me check how many doses you have");// this "if" has to be true in order for second
																		// "if" to work

			if (dose == 1) {
				System.out.println("You need 1 more shot");
			} // Won't work because is false

			else {
				System.out.println("You are fully vacinated");
			}
		}

		System.out.println("---------------------------------------------------------------------------------------------------");

		// ANOTHER EXAMPLE with "outer if" is true and then "depend if" true as well to
		// run. TRUE STATEMENT AND SUB IF TRUE AS WELL.
		boolean vaccine1 = true;
		int dose1 = 1;

		if (vaccine1) {
			System.out.println("Let me check how many doses you have");// this "if" has to be true in order for second
																		// "if" to work

			if (dose1 == 1) {
				System.out.println("You need 1 more shot");
			} // WORK

			else {
				System.out.println("You are fully vacinated");
			}
		}

		System.out.println("---------------------------------------------------------------------------------------------------");

		// ANOTHER EXAMPLE FOR "FALSE"
		boolean vaccine2 = false;
		int dose2 = 1;

		if (vaccine2) {
			System.out.println("Let me check how many doses you have");// This is false therefore nothing is going to
																		// work

			if (dose2 == 1) {
				System.out.println("You need 1 more shot");
			}

			else {
				System.out.println("You are fully vacinated");
			}
		}

		System.out.println("---------------------------------------------------------------------------------------------------");

		// CONDITION TRUE
		String month = "May";
		int day = 8;
		if (month.equals("May")) {
			System.out.println("Let me check what date is today");
			if (day == 8) {
				System.out.println("Today is a Mother's day");
			}
		}

		System.out.println("---------------------------------------------------------------------------------------------------");

		// CONDITION FALSE but TRUE IN ELSE IF// in case first statement is true second
		// else if gets ignore
		String month1 = "June";
		int day1 = 19;
		if (month1.equals("May")) {
			System.out.println("Let me check what date is today");// WONT PRINT ANYTHING/ FALSE STATEMENT
			if (day1 == 8) {
				System.out.println("Today is a Mother's day");
			}
		} // WONT EVEN CHECK BECAUSE FIRST IS FALSE/ end first nest
		else if (month1.equals("June")) {
			System.out.println("Let me check date in June");// second nest outer if
			if (day1 == 19) {
				System.out.println("Today is a Father's date");
			}
		} // nested if to the second outer if

		System.out.println("---------------------------------------------------------------------------------------------------");

		// MORE EXAMPLES
		// WE NEED TO CHECK IF REPLIT WAS COMPLITED.
		// if replit was completed we want to see
		// if you did 15 and more -->great job
		// if you did more than 10-->good
		// if less than 10-->try to complete all assignments

		boolean didReplit = true;
		int assigments;

		if (didReplit) {
			System.out.println("how many assigments have you done");
			assigments = 14;// this is the line of the answer how many assignments were done//another way to
							// add a value.

			if (assigments > 15) {
				System.out.println("You did a great job");
			} else if (assigments > 10) {
				System.out.println("You did a good job");
			} else {
				System.out.println("Please complete all you homework");
			}
		} else {
			System.out.println("You should complete you replit homewoork");
		}
	
	}
		

	}


