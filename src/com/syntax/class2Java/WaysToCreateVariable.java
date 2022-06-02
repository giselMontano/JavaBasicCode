package com.syntax.class2Java;

public class WaysToCreateVariable {

	public static void main(String[] args) {
		// to create a variable we need 2 things: datatype and name
		/*
		 * 1 way to create a variable datatype name= value
		 */
		int temperature = 60;
		System.out.println(temperature);
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		/*
		 * 2 way that is done in 2 steps create a variable (datatye and name ) assign
		 * the variable
		 */

		int sum;// create a variable
		sum = 30; // assign the value
		sum = 50; // reassing the value
		System.out.println(sum);// 50
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		int num1, num2, num3;// create 3 variables of int type
		num1 = 10; // assign the value
		num2 = 20; // assign the value
		num3 = 30; // assign the value

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

}
