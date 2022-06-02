package com.syntax.class2Java;

public class TaskVariable {

	public static void main(String[] args) {
		// Create a Java program and name it Variables
//In your program create different type of variables to store student’s information(name, last name, grade, city, state, phone number) and then print value of those variables in the format:
//*My name is ___ and my last name is ____
//*I am A/B student
//*I live in city__ and state___And my phone number is …..
//b) Change student’s city, state, phone number and grade. And print those updated values:
//Example: My name is __ and I moved to new city__ and new state__. My new phone number is ___

		String name = "Alejandra";
		String lastName = "Ruiz";
		String grade = "first grade";
		String city = "Manhattan";
		String state = "New York";
		String phoneNumber = "554-444-4444";

		System.out.println(" My name is " + name + " " + lastName);
		System.out.println(" I am " + grade);
		System.out.println(" I live in the city of " + city + " and state " + state);
		System.out.println(" And my phone number is " + phoneNumber);
		
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
		name = "Lidia";
		lastName = "Perez";
		grade = "second grade";
		city = "Chicago";
		state = "Illinois";
		phoneNumber = "222-222-22222";

		System.out.println(" My name is " + name + " " + lastName);
		System.out.println(" I am " + grade);
		System.out.println(" I live in the city of " + city + " and state " + state);
		System.out.println(" And my phone number is " + phoneNumber);

		System.out.println(" My name is " + name + " " + lastName + " and I moved to new city " + city + "."
				+ " My new phone number is " + phoneNumber + ".");
	}

}
