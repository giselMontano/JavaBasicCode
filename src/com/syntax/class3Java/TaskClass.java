package com.syntax.class3Java;

public class TaskClass {

	public static void main(String[] args) {
		// // Declare variable and increase it’s value by 500 and then by 200 using
		// shorthand operator
		// Declare variable and decrease it’s value by 60 using shorthand operator
		// Declare variable cakePiece=11 and divide the value of that variable between 4
		// people using shorthand operator
		// Declare variable cake=25 and divide cake between 7 people . Using shorthand
		// operator found out how many pieces of cake left after it was distributed
		// equally among 7 people
		int num = 5;
		num += 500;
		num += 200;
		System.out.println(num);

		int num2 = 100;
		num2 -= 60;
		System.out.println(num2);

		double cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);

		int cake = 25;
		cake /= 7;
		System.out.println(cake);

		int cakemod = 25;
		cakemod %= 7;
		System.out.println(cakemod);

	}

}
