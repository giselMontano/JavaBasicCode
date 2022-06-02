package com.syntax.class6Java;

import java.util.Scanner;

public class Enhance {

	public static void main(String[] args) {

		// NORMAL CODE IF
		Scanner scan = new Scanner(System.in);

		System.out.println("Quiz Score?");
		int Quiz = scan.nextInt();
		System.out.println("Mid Term Score?");
		int Term = scan.nextInt();
		System.out.println("Final Score?");
		int Final = scan.nextInt();

		int Average = ((Quiz + Term + Final) / 3);
         System.out.println("Your average score is "+Average);
		
        if (Average >= 90) {
			System.out.println("Your grade is A ");

		} else if (Average >= 70 && Average < 90) {
			System.out.println("Your grade is B ");

		} else if (Average >= 50 && Average < 70) {
			System.out.println("Your grade is C ");

		} else if (Average < 50) {
			System.out.println("Your grade is F ");
		}
		
		System.out.println("-----------------------------------------------------------");
		
		
		// ENHANZED
		System.out.println("Quiz Score?");
		int Quiz1 = scan.nextInt();
		System.out.println("Mid Term Score?");
		int Term1 = scan.nextInt();
		System.out.println("Final Score?");
		int Final1 = scan.nextInt();

		int AverageS = ((Quiz1 + Term1 + Final1) / 3);
		 System.out.println("Your average score is "+AverageS);
			
		char grade;
		if (AverageS >= 90) {
			grade = 'A';
		} else if (AverageS >= 70 && AverageS <= 90) {
			grade = 'B';
		} else if (AverageS >= 50 && AverageS < 70) {
			grade = 'c';
		} else {
			grade = 'F';
	    }
		
		// ONLY ONE SYSO
		System.out.println("Your are a " + grade + " student");
		
		// If you are A or B student ---> you are doing great
		// otherwise --->please try to study more

		if (grade == 'A' || grade == 'B') {
			System.out.println("You are doing great");
		} else {
			System.out.println("Please try to study more");
	    scan.close();
		}
	}
	}
