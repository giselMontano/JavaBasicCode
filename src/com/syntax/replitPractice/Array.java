package com.syntax.replitPractice;



public class Array {

	public static void main(String[] args) {
		/*
		 * 70-->For you to do:
		 * 
		 * Write a program that creates an array of integers and stores the following
		 * values: 45, 78, 12, 67, 55 and then prints all array values.
		 ** 
		 * Output:** 45 78 12 67 55
		 */
		int[] num = { 45, 78, 12, 67, 55 };
		for (int i = 0; i < num.length; i++)

		{
			System.out.print(num[i] + " ");
		}

		System.out.println();//PART OF THE BLOCK
		
System.out.println();

		/*
		 * 71--> you to do:
		 * 
		 * Write a program that creates an array of integers that stores the following
		 * values: 45,78, 12, 67, 55, 89, 23, 77, 88
		 * 
		 * Print only values that stored with EVEN INDEX.
		 * 
		 * Output:
		 * 
		 * 45 12 55 23 88
		 */
		int nuM[] = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };

		for (int i = 0; i < nuM.length; i += 2) {

			System.out.print(nuM[i] + " ");
		}

	    System.out.println();
	    
System.out.println();
		
		/*
		 * 72-->For you to do:
		 * 
		 * Write a program that creates an array with the following values{s, a, y, b, n, c, t, d, a, e, x}
		 * 
		 * Print the values so the output should look like below
		 *
		 * Output: 
		 * 
		 * syntax
		 */
		String syntax[] = { "s", "a", "y", "b", "n", "c", "t", "d", "a", "e", "x" };
		for (int i = 0; i < syntax.length; i += 2) {
			System.out.print(syntax[i]);
		}
		
        System.out.println();
        
 System.out.println();

		/*
		 * 73-->For you to do:
		 * 
		 * Write a program that creates an array of strings with the following
		 * values{"This", "is", "array", "of", "strings"} 
		 * and prints all values in one line.
		 *
		 * Output: 
		 * 
		 * This is array of strings
		 */
		String array[] = { "This", "is", "array", "of", "strings" };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
        System.out.println();
        
 System.out.println();

		/*
		 * 74-->For you to do:
		 * 
		 * Write a program that creates an array of integers of size 11. 
		 * Add the years
		 * 2010 to 2020 to your array one by one using a for loop and then print all
		 * those values.
		 * 
		 * Example:
		 * 
		 * 2010 
		 * 2011 
		 * 2012 
		 * 2013 
		 * 2014 
		 * 2015 
		 * 2016 
		 * 2017 
		 * 2018 
		 * 2019 
		 * 2020
		 */
		int year[] = { 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020 };
		for (int i = 0; i < year.length; i++) {
			System.out.println(year[i]);
		}
		
        System.out.println();
        
 System.out.println();
		
		/*
		 * 75-->For you to do:
		 * 
		 * Using the following array.
		 * 
		 * {45, 78, 12, 67, 55, 89, 23, 77, 88}
		 * 
		 * Create a for loop to extract values from that array so your output looks as
		 * below:
		 *
		 * Expected Output:** 
		 * 78 55 77
		 * 
		 * Note: Find out what is the start point an how
		 * much you need to increment to get the result.
		 */
		int nUm[] = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
		for (int i = 1; i < nUm.length; i += 3) {
			System.out.print(nUm[i] + " ");
		}

        System.out.println();
System.out.println();

	}
}