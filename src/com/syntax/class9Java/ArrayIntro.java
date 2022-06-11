                                                                                                                                                                                                                                       package com.syntax.class9Java;

public class ArrayIntro {

	public static void main(String[] args) {
		// create an array

		int[] b = new int[4];

		// store values
		b[0] = 90;
		b[1] = 85;
		b[2] = 70;
		b[3] = 100;

		// access values from my array
		System.out.println(b[2]);// 70
		System.out.println(b[1] + b[3]);// 185

		
		
		// we need to create an array of my classmates
		
		// we must specify the size (how many elements)
		String[] classMates = new String[5];
		// how values are stored -->store based on index []//index starts from 0 always
		classMates[0] = "khistyna";
		classMates[1] = "Lexia";
		classMates[2] = "Oleg";
		classMates[3] = "Adem";
		classMates[4] = "Zameer";

		System.out.println("My classmate name is " + classMates[3]);

	}

}
