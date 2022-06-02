package com.syntax.class2Java;

public class Homework {

	public static void main(String[] args) {
		// Write a Java program to add, subtract, multiply and divide 2 decimal values.
		// Your program should say. “The _______ of 2 numbers ___ and ___ is equal to
		// _____”
		double pencil = 25.55;
		double paper = 55.25;
		double sum, sub, mult, div;
		sum = pencil + paper;
		sub = pencil - paper;
		mult = pencil * paper;
		div = pencil / paper;
		System.out.println(" The total price of " + pencil + " and " + paper + " equal to " + sum);
		System.out.println(" The total price of " + pencil + " minus " + paper + " equal to " + sub);
		System.out.println(" The total price of " + pencil + " multipied by " + paper + " equal to " + mult);
		System.out.println(" The total price of " + pencil + " diveded by " + paper + " equal to " + div);
		
		System.out.println("---------------------------------------------------------------------------------------------------");

//Write a program to find the square of the number 3.9. 
//You program should say “The square of the ____ is ____ ”

		double noteBook = 3.9;
		double squared = noteBook * noteBook;
		System.out.println(" The square of the notebook " + noteBook + " is " + squared);
		
		System.out.println("---------------------------------------------------------------------------------------------------");

//Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. Your program should say. 
//“The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
//-to find the perimeter, add width + height then multiply for 2.
//-to find the area multiply width * height 

		int width = 5;
		int height = 8;
		int perimeter = 2 * (width + height);
		int area = width * height;
		System.out.println(" The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equal to " + perimeter + " and the area is " + area);

	}

}
