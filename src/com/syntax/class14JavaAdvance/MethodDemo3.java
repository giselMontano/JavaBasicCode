package com.syntax.class14JavaAdvance;

public class MethodDemo3 {
	// WRITE A METHOD THAT TAKES AN INT VALUE IF THAT VALUE IS EVEN THIS METHOD RETURN TRUE
			//OTHERWISE IT RETURNS FALSE 

	boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// WRITE A METHOD THAT TAKES A (STRING) this goes inside()!!! AND RETURNS (TRUE)
	// boolean!!!
	// IF NUMBER OF CHARACTERS IN THAT STRING ARE EVEN OTHERWISE ODD
	boolean checkString(String check) {
		if (check.length() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		MethodDemo3 create = new MethodDemo3();
		System.out.println(create.isEven(2));// TRUE//WE PROVIDE THE NUMBER HERE
		System.out.println(create.isEven(5));// FALSE

		System.out.println("-----------------------------------------");

		System.out.println(create.checkString("hello"));// false
		System.out.println(create.checkString("hi"));// true

	}

}
