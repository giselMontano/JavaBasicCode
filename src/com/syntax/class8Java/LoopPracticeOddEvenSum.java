package com.syntax.class8Java;

public class LoopPracticeOddEvenSum {

	public static void main(String[] args) {
		
		// when SYSO is in MAIN
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum += i;
		}
		System.out.println(sum);

		System.out.println("-----------------------------------------");

		// when SYSO is inside code
		int sum1 = 0;
		for (int i = 1; i < 6; i++) {
			sum1 += i;
			System.out.println(sum1 + " ");
		}

		System.out.println("-------------------------------------------");

		// FIND SUM OF ALL EVEN AND ALL ODD NUMBERS FROM 1 TO 70

		// EVEN
		int sumEven = 0;

		for (int i = 1; i <= 70; i++)
			if (i % 2 == 0) {
				sumEven += i;
			}
		System.out.println("sum of even " + sumEven);

		System.out.println("----------------------------------------");
		
		//EVEN another way

		int sum3 = 0;// CHANGE THE START POINT
		for (int i = 0; i <= 70; i += 2) {
			sum3 += i;

		}
		System.out.println(sum3);

		System.out.println("--------------------------------------------");

		// ODD
		int sumOdd = 0;
		for (int i = 1; i <= 70; i++)
			if (i % 2 != 0) {
				sumOdd += i;
			}
		System.out.println("sum of odd " + sumOdd);

		System.out.println("----------------------------------------");

       //ODD another way

		int sum4 = 0;
		for (int i = 1; i <= 70; i += 2) {
			sum4 += i;

		}
		System.out.println(sum4);

		System.out.println("-------------------------------------");

		// ANOTHER WAY to do both at the same time
		int sumeven = 0;
		int sumodd = 0;

		for (int i = 1; i <= 70; i++) {

			if (i % 2 == 0) {
				sumeven += i;
			} else {
				sumodd += i;
			}
		}

		System.out.println("Sum Even numbers is " + sumeven);
		System.out.println("Sum Odd numbers is " + sumodd);
	}

}
