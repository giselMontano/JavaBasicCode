package com.syntax.class12JavaAdvance1;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dude = "Sameer is funny is gulbadan and he is sheer badan";
		System.out.println(dude.charAt(2));// m-->string is an array that you can access with this char
		System.out.println(dude.charAt(5));// r
		for (int i = 0; i > dude.length(); i++) {
			System.out.println(dude.charAt(i));

		}
		int counter = 0;
		for (int i = 0; i < dude.length(); i++) {
			if ('s' == dude.charAt(i) || 'S' == dude.charAt(i) || 'a' == dude.charAt(i) || 'A' == dude.charAt(i)) {
				counter++;
			}
		}
		System.out.println("s and a appeared " + counter + " in the string");
	}

}
