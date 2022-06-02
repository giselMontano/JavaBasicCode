package com.syntax.class3Java;

public class TaskIf {

	public static void main(String[] args) {
		
		// *Declare 2 double values
		// if value of first variable is higher then the second, print “Double value __
		// is larger than __ .” Otherwise print

		double a = 50.55;
		double b = 20.22;
		if (a > b) {
			System.out.println("Double value " + a + " is larger than " + b);
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		// Create variable to store temperature.
		// Your program should check if temperature is below 32 then it should print
		// “Water will freeze with temperature __“,
		// otherwise “Water will NOT freeze with temperature __“.

		int temp = 15;//
		if (temp < 32) {
			System.out.println("Water will freeze with temperature " + temp);
			System.out.println("Its is cold outside");
			System.out.println("Make sure to use a javket and scarf");
		} else {
			System.out.println("water will NOT freze with temperature " + temp);
		}

		System.out.println("---------------------------------------------------------------------------------------------------");
		
		// another example changing temperature to higher
		int temp1 = 67;
		if (temp1 < 32) {
			System.out.println("Water will freeze with temperature " + temp);
			System.out.println("Its is cold outside");
			System.out.println("Make sure to use a javket and scarf");
		} else {
			System.out.println("water will NOT freze with temperature " + temp);
		}

		// cmd+shift+f to organize the code
	}

}
