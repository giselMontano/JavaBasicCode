package com.syntax.class4Java;

import java.util.Scanner;

public class UserImput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a scanner
		Scanner input = new Scanner(System.in);// class already created has to be import from library.

		// send instruction to the console
		System.out.println("Please enter your name");

		// we need to grab the value from console
		String name = input.next();// after you type the value ->hit enter

		// let's send instruction
		System.out.println("Hi " + name + " please enter your age ");// hit enter

		// need to capture and store age
		int age = input.nextInt();
		System.out.println(name + " is " + age + " years old");
		input.close();
	}

}
