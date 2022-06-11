package com.syntax.class11Java;

public class PracticeProject1 {

	public static void main(String[] args) {
	
		//Write a java program to check whether a given number is prime or not?
		
		int x = 12;
		boolean isPrime = true;

		if (x > 1) {
			for (int i = 2; i < x; i++) {
				if (x % i == 0) { //if the number that user has provided if that number is completely divisible by any other number 
					isPrime = false;
					break;

				}
			}
		} else {
			isPrime = false;

		}
		if (isPrime) {
			System.out.println(x + " is prime");
		} else {
			System.out.println(x + " is not prime");
		}

	}

}
