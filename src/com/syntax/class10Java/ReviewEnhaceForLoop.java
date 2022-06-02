package com.syntax.class10Java;

public class ReviewEnhaceForLoop {

	public static void main(String[] args) {
		
		String[] disney = { "Sherk", "Elsa", "Goofy", "Mulan", "Tom&Jerry" };
		System.out.println(disney[1]);// Elsa

		System.out.println("----------------All elements using for loop-----------------");

		// to get all elements from an array

		for (int i = 0; i < disney.length; i++) {
			if (disney[i].equalsIgnoreCase("Sherk")) {
				System.out.println(disney[i] + " is my favorite character");
			} else {
				System.out.println(disney[i]);
			}
			System.out.println(disney[i] + " ");
		}

		System.out.println("-------------All elementes using enhance for loop-------------");

		for (String character : disney) {
			if (character.equalsIgnoreCase("Mulan")) {
				System.out.println(character + " is my favorite character");

			} else {
				System.out.println(character + " ");
			}
		}

	}

}
