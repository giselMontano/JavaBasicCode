package com.syntax.class4Java;

import java.util.Scanner;

public class HomeworkScan {

	public static void main(String[] args) {
//Create a java program in which using Scanner you are going to capture user’s first name, last name and state where he/she lives.

		Scanner scan = new Scanner(System.in);

		System.out.println("What is your first name?");
		String name = scan.next();

		System.out.println("What is yor last name? ");
		String lastName = scan.next();

		System.out.println("What state do you live?");
		String state = scan.next();
		state = state + scan.nextLine();
		// state += scan.nextLine();
		System.out.println("Hello " + name + " " + lastName + " from the state " + state);
		scan.close();

	}

}
