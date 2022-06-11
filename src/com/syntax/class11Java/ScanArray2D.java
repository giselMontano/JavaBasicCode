package com.syntax.class11Java;

import java.util.Scanner;

public class ScanArray2D {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries. 
		 * When an array is created, retrieve all values from it 
		 * and while retrieving those values print capital for each country. (use 2 different loops).
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of the array that you want to create");
		int arraySize = scanner.nextInt();
		System.out.println("Please enter the countries");
		String[] countryArray = new String[arraySize]; // creating an array of size that will be entered by user
		for (int i = 0; i < countryArray.length; i++) {
			countryArray[i] = scanner.next(); // taking the input from the user and storing it inside the array
		}

		for (String element : countryArray) {
			if (element.equalsIgnoreCase("usa")) {
				System.out.println("Washington DC");
			} else if (element.equalsIgnoreCase("turkey")) {
				System.out.println("Anakara");
			} else if (element.equalsIgnoreCase("Thailand")) {
				System.out.println("Bangkok");
			} else {
				System.out.println("Contry not supported by My Great java program version 1.0");
			}
			scanner.close();
		}

	}
}

	
