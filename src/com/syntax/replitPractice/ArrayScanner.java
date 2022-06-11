package com.syntax.replitPractice;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		/*
		 * 76-->For you to do:
		 * 
		 * Write a program that creates a String array with size 7.
		 * 
		 * Ask the user to input Days of a week beginning with Sunday using Scanner
		 * class.
		 * 
		 * Add these inputs to your array and then print all values from that array
		 * 
		 * Example:
		 * 
		 * Please enter day 1 of the week
		 * 
		 * Sunday
		 * 
		 * Please enter day 2 of the week
		 * 
		 * Monday
		 * 
		 * Please enter day 3 of the week
		 * 
		 * Tuesday etc
		 * 
		 * Example Output:
		 * 
		 * Please enter day 1 of the week Sunday 
		 * Please enter day 2 of the week Monday
		 * Please enter day 3 of the week Tuesday 
		 * Please enter day 4 of the week Wednesday 
		 * Please enter day 5 of the week Thursday 
		 * Please enter day 6 of the week Friday 
		 * Please enter day 7 of the week Saturday 
		 * 
		 * Sunday Monday Tuesday
		 * Wednesday Thursday Friday Saturday
		 */
String total;
         Scanner scan= new Scanner (System.in);
         System.out.println("How many days a a week have?");
         int week=scan.nextInt();
         System.out.println("Please enter day 1 of the week");
         //String day= scan.next();
         System.out.println("Please enter day 2 of the week");
         //String day2= scan.next();
         System.out.println("Please enter day 3 of the week");
         //String day3= scan.next();
         System.out.println("Please enter day 4 of the week");
        // String day4= scan.next();
         System.out.println("Please enter day 5 of the week");
        // String day5= scan.next();
         System.out.println("Please enter day 6 of the week");
         //String day6= scan.next();
         System.out.println("Please enter day 7 of the week");
        // String day7= scan.next();
         
         String arr[]= new String[week+1];
         for(int i=0; i<arr.length; i++) {System.out.println(arr[i]);
         }
	}

	}

