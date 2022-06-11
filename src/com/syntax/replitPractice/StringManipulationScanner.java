package com.syntax.replitPractice;

import java.util.Scanner;

public class StringManipulationScanner {

	public static void main(String[] args) {
		/*
		 * 95-->For you to do:
		 * 
		 * Using Scanner class input string value.
		 * 
		 * Print out the following:
		 * 
		 * "The first 3 letters of ___ is ___"
		 * 
		 * For example, if the input is "banana", your output should be:
		 * 
		 * "The first 3 letters of banana is ban".
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = scan.next();
		System.out.println("The first 3 letters of " + word + " is " + word.substring(0, 3));
System.out.println("--------------------------------------------------------");
		/*
		 * 96-->For you to do:
		 * 
		 * You have Scanner class to input string value.
		 * 
		 * If language is Java it should print the:
		 * 
		 * "Java is a programming language".
		 * 
		 * If language is C it should print the:
		 * 
		 * "C is a procedural programming language"
		 * 
		 * If language is C++ it should print the:
		 * 
		 * "C++ is a middle-level programming language"
		 * 
		 * If any other should print:
		 * 
		 * "Doesn't match any programming language"
		 */

		System.out.println("Enter any programming language");
		String language = scan.nextLine();
		String meaning;
		switch (language.toLowerCase()) {
		case "java":
			meaning = "Java is a programming language";
			break;
		case "c":
			meaning = "C is a procedural programming language";
			break;
		case "c++":
			meaning = "C++ is a middle-level programming language";
			break;
		default:
			meaning = "Doesn't match any programming language";

		}
		System.out.println(meaning);
System.out.println("---------------------------------------------------");
		/*
		 * 97-->For you to do:
		 * 
		 * Based on the user inputs program should give a correct answer.
		 * 
		 * If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:
		 * 
		 * "Proceed with Chrome browser"
		 * 
		 * If browser is firefox, FIREFOX or FireFOX it should print the:
		 * 
		 * "Proceed with Firefox browser"
		 * 
		 * If browser is IE, ie or iE it should print the:
		 * 
		 * "Proceed with IE browser"
		 * 
		 * If any other browser it should print the:
		 * 
		 * "Invalid browser"
		 */
		System.out.println("Enter the browser name to proceed further with execution");
		String browser = scan.nextLine();
		String meaning1;
		switch (browser.toLowerCase()) {
		case "chrome":
			meaning1 = "Proceed with Chrome browser";
			break;
		case "firefox":
			meaning1 = "Proceed with Firefox browser";
			break;
		case "ie":
			meaning1 = "Proceed with IE browser";
			break;
		default:
			meaning1 = "Invalid browser";
		}
		System.out.println(meaning1);
		
System.out.println("--------------------------------------");
		/*
		 * 98-->For you to do:
		 * 
		 * Create a String given="Hello Syntax friends".
		 * 
		 * Using String methods from given String create new String
		 * "Welcome Syntax family"
		 * 
		 * Expected Output:
		 * 
		 * Welcome Syntax family
		 */
		String given = "Hello Syntax friends";
		System.out.println(given.replace("Hello", "Welcome").replace("friends", "family"));
System.out.println("---------------------------------------");
		/*
		 * 99-->Write code that will take in a String input and check to see if it is a
		 * palindrome or not.
		 * 
		 * A palindrome means that the characters are the same forwards and backwards,
		 * ignoring spaces.
		 * 
		 * Examples of palindromes:
		 * 
		 * racecar 
		 * was it a car or a cat I saw 
		 * never odd or even 
		 * rats live on no evil star 
		 * 
		 * Your check should be case insensitive too. For example, "Bob" is a
		 * palindrome, despite the first B being capitalized.
		 * 
		 * Your program will print out "true" if it's a palindrome and "false" if not.
		 */
		 System.out.print("In:");
		    String givenString = scan.nextLine().toLowerCase().replaceAll(" ", "");
		    // write your code below
		    String reverse = "";
		    for (int i = givenString.length() - 1; i >= 0; i--) {
		      reverse += givenString.charAt(i);
		    }
		    if (givenString.equals(reverse)) {
		      System.out.println("true");
		    } else {
		      System.out.println("false");
		    }
System.out.println("---------------------------------------");
			/*
			 * 100-->Given the following inputs:
			 * 
			 * String s; Write a for loop that will print out the reverse of the string.
			 * 
			 * Sample input/outputs:
			 * 
			 * In: manhattan 
			 * 
			 * nattahnam 
			 * 
			 * In: processor 
			 * 
			 * rossecorp 
			 * 
			 * In: racecar 
			 * 
			 * racecar
			 * 
			 */
		    System.out.print("In:");
		    String s = scan.nextLine();
		    //write your code below
		    String reverse2="";
		    for(int i=s.length()-1; i>=0; i--){
		      reverse2+=s.charAt(i);}
		    System.out.println(reverse2);
		    scan.close();
		      
		}

	}
