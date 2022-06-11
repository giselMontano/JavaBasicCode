package com.syntax.class12JavaAdvance1;

public class StringDemo6 {

	public static void main(String[] args) {
		
		String numbers = "12345674861425411";//string is an array of char
		
		int counter = 0;
		for (int i = 0; i < numbers.length(); i++) {
			if (numbers.charAt(i) == '1') {//strings are arrays of char
				counter++;
			}

		}
		System.out.println(counter);
		

	}

}
