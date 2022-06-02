package com.syntax.class6Java;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// 
		char choice = 'Y';
		String meaning;
		//Variables and matching cases MUST BE of same type
		//Switch does not allow to have duplicated cases
		switch (choice) {
		case'Y'://has to be same as the char you declared 
			meaning="Yes";
			break;
		case'M':
			meaning="Maybe";
			break;
		case 'N':
			meaning="No";
			break;
		default:
			meaning="Unknown";
			
		}
		System.out.println(meaning);
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		// STRING CASE
		/*
		 * ask the user where is he from, based on the country we will define favorite food
		 */
		
		Scanner scan = new Scanner(System.in);

		String country, favoriteFood;// containers the value should be on between ""
		
		System.out.println("Please tell me where are you from?");

		country = scan.nextLine();// here is just assigning a value.

		switch (country.toLowerCase()) { // in order to accept whatever imput it gets from user like "ignoringCase" in
								        // if statements string we use (vaiable.toLowerCase())
		// if the user put CANADA, JAVA will transform Capital letters into lower case
		// and start looking in the code.
		// TO USE THIS ALLL THE CASES MUST BE ON LOWER CASE IN ORDER FOR JAVA TO
		// TRANSFORM ANY CHARACTER EXTRACTED FROM USER INTO "LOWER CASES"
		// AND LOOK FOR MATCHING IN THE CODE.
		case "mexico":
			favoriteFood = "tacos";
			break;
		case "canada":
			favoriteFood = "poutine";
			break;
		case "turkey":
			favoriteFood = "lahmacun";
			break;
		case "pakistan":
			favoriteFood = "pati chai";
			break;
		case "egypt":
			favoriteFood = "koshary";
			break;
		case "usa":
			favoriteFood = "burgers";
			break;
		default:
			favoriteFood = "unknown";
		}
			
			System.out.println("You are from "+country+" and your favorite food is "+favoriteFood);
			scan.close();
				
		
	
	}
	
	

}
