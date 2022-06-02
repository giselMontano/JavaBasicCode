package com.syntax.class6Java;

import java.util.Scanner;

public class EnhanzedMoreExamples {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your month of birth");
		String month = scan.next();

		if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("You were born in Spring");
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			System.out.println("You were born in Summer");
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("Octuber")
				|| month.equalsIgnoreCase("November")) {
			System.out.println("You were born in Autumn");
		} else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")
				|| month.equalsIgnoreCase("February")) {
			System.out.println("You were born in winter");
		}

		//ENHANCE
		System.out.println("Please enter your month of birth");
		String month1 = scan.next();
		String season;
		
		if (month1.equalsIgnoreCase("March") || month1.equalsIgnoreCase("April") || month1.equalsIgnoreCase("May")) {
			season="Spring";
		} else if (month1.equalsIgnoreCase("June") || month1.equalsIgnoreCase("July")
				|| month1.equalsIgnoreCase("August")) {
			season="Summer";
		}else if (month1.equalsIgnoreCase("September") || month1.equalsIgnoreCase("Octuber")
				|| month1.equalsIgnoreCase("November")) {
			season="Autumn";
		}else if (month1.equalsIgnoreCase("December") || month1.equalsIgnoreCase("January")
				|| month1.equalsIgnoreCase("February")) {
			season="Winter";
		}else {
			season="Invalid";
		}
		if (!season.equals("Invalid")) {
		System.out.println("You were born in "+season);
		scan.close();
		}
		
	
	}

}
