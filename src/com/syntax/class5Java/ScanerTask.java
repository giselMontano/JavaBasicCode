package com.syntax.class5Java;

import java.util.Scanner;

public class ScanerTask {

	public static void main(String[] args) {
		// You are DMV representative and you need to ask customer their age. If they are 18 and older you will issue a driver license to them, 
		//otherwise you will offer them to get a learners permit.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		
		if (age >=18) {
			System.out.println("Your driver license will be issue");
		} else {
			System.out.println("You are not old enoight to optain a driver license");
			scan.close(); 
		}
	}

}
