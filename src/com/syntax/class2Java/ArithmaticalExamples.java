package com.syntax.class2Java;

public class ArithmaticalExamples {

	public static void main(String[] args) {

		int num1 = 40;
		int num2 = 20;

//variables where is store results 
		int sum, sub, mult, div;

//example as a regular math operation 
		System.out.println(num1 / num2);

		sum = num1 + num2;
		System.out.println(sum);

		sub = num1 - num2;
		System.out.println(sub);

		mult = num1 * num2;
		System.out.println(mult);

		div = num1 / num2;
		System.out.println(div);
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		double num3 = 9.99;
		double num4 = 3.50;

		double sum1, sub1, mult1, div1;

		sum1 = num3 + num4;
		System.out.println(sum1);

		sub1 = num3 - num4;
		System.out.println(sub1);

		mult1 = num3 * num4;
		System.out.println(mult1);

		div1 = num3 / num4;
		System.out.println(div1);
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		// problems you can face/ int represent whole numbers
//any time you need to divide use double or float.

		int a = 10;
		int b = 3;

		int result;
		result = a / b;

		System.out.println(result);
		
		System.out.println("---------------------------------------------------------------------------------------------------");

//every time you have division the best is to use double

		double c = 10.0;
		double d = 3.0;

		double correct;
		correct = c / d;

		System.out.println(correct);
		
		System.out.println("---------------------------------------------------------------------------------------------------");

//you can also use float but it has less decimals 

		float e = 10.0f;
		float f = 3.0f;

		float correct2;
		correct2 = e / f;

		System.out.println(correct2);
	}

}
