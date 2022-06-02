package com.syntax.class4Java;

public class HomeworkDonor {

	public static void main(String[] args) {
// Write a Java Program to check whether number is Even or Odd.

		int num = 50;
		if (num % 2 == 0) {
			System.out.println("This is  a even number");
		} else {
			System.out.println("This is an odd number");
		}
		System.out.println("---------------------------------------------------------------------------------------------------");
		
//2.  Create a Java program and call it a Donor.
//In order to be eligible to donate your blood you have to be 18 years old. 
//Also once you identify age eligibility then we have to see if person matches weight requirements. 
//If person weight it more than 110 lbs → then he/she is eligible, otherwise we cannot accept such a patient.

		System.out.println("---------------------------------------------------------------------------------------------------");
		int age = 18;
		double weight = 100;
		if (age >= 18) {
			System.out.println("Check weight requarements");
			if (weight > 110) {
				System.out.println("You are elegible");
			} else {
				System.out.println("Sorry we can not accept as a candidate");
			}
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
////3. Write a program to find largest number among three numbers using nested if provided by a user (numbers must be distinct)		

		double a = 899.77;
		double b = 290.6;
		double c = 700.5;
		if (a >= b && a >= c) {
			System.out.println(a + " is the biggest number");
		} else if (b >= a && b >= c) {
			System.out.println(b + " is the biggest number");
		} else {
			System.out.println(c + " is the biggest number");
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
		// nested if
		int num1 = 45;
		int num2 = 44;
		int num3 = 23;// 50 if you change it for this num3 is the biggest

		if (num3 >= num2) {
			if (num1 >= num3) {
				System.out.println(num1 + " is largest number");
			} else {
				System.out.println(num3 + " is the largest number");
			}
			// otherwise num2>num1
		} else {//// otherwise num2>num1
			if (num2 >= num3) {
				System.out.println(num2 + " is largest number");
			} else {// num3>num2
				System.out.println(num3 + "is largest number");
			}

		}
	}
}
