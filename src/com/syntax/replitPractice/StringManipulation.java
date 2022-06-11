package com.syntax.replitPractice;


public class StringManipulation {

	public static void main(String[] args) {
		/*
		 * 89-->For you to do:
		 * 
		 * Create a String "name" and assign the value "Timmy" to it. Find out how many
		 * characters are there in the given String.
		 */
		String name = "Timmy";
		System.out.println(name.length());

System.out.println("------------------------------------");
		/*
		 * 90-->For you to do:
		 * 
		 * Create a String named s1 = "hello" check weather string is empty or not
		 * 
		 * Create a String named s2 = "" check weather string is empty or not
		 * 
		 * Expected Output:
		 * 
		 * false true
		 */
		String s1 = "hello";
		String s2 = "";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());

System.out.println("------------------------------------");

		/*
		 * 91-->For you to do:
		 * 
		 * Create String str1= syntax technologies and convert into SYNTAX TECHNOLOGIES
		 * 
		 * Create String str2= SYNTAX TECHNOLOGIES and convert into syntax technologies
		 * 
		 * Expected Output:
		 * 
		 * SYNTAX TECHNOLOGIES syntax technologies
		 */
		String str1 = "syntax technologies";
		String str2 = "SYNTAX TECHNOLOGIES";
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());

System.out.println("------------------------------------");
		/*
		 * 92-->For you to do:
		 * 
		 * Validate if the string ends with "u" prints the boolean value accordingly.
		 * 
		 * Validate if the string ends with "world" prints the boolean value
		 * accordingly.
		 * 
		 * Validate if the string ends with "are" prints the boolean value accordingly.
		 * 
		 * Validate if the string ends with "you" prints the boolean value accordingly.
		 */
		String end = "hello how are you";
		System.out.println(end.endsWith("u"));
		System.out.println(end.endsWith("world"));
		System.out.println(end.endsWith("are"));
		System.out.println(end.endsWith("you"));

System.out.println("------------------------------------");
		/*
		 * 93-->For you to do: String “abracadabra alakazam”;
		 * 
		 * Print out the position of the first occurrence of "c". Print out the position
		 * of the first occurrence of " ". Print out the position of the first
		 * occurrence of the variable target1. Print out the position of the first
		 * occurrence of the variable target2.
		 * 
		 * Expected Output:
		 * 
		 * 4 11 6 -1
		 */
		String check = "abracadabra alakazam";
		String target1 = "dab";
		String target2 = "ABRA";
		System.out.println(check.indexOf("c"));
		System.out.println(check.indexOf(" "));
		System.out.println("finding index target 1 " + target1 + " in the first String");
		System.out.println(check.indexOf("d"));
		System.out.println("finding index target 2 " + target2 + " in the first String");
		System.out.println(check.indexOf("A"));

System.out.println("--------------------------------------------------");
		/*
		 * 94-->For you to do:
		 * 
		 * Create a String given="I love Java classes at Syntax" Retrieve 2 Strings
		 * using substring method from given String and print them
		 * 
		 * Expected Output:
		 * 
		 * classes at Syntax 
		 * 
		 * I love Java
		 */
//IN ORDER TO SUBSTRACT YOU MUST START FROM 0
		String given = "I love Java classes at Syntax ";
		System.out.println(given.substring(12));
		System.out.println(given.substring(0, 11));


			}

}
