package com.syntax.replitPractice;

public class ClassAndObjects86 {
	String name;
	int roll;

	public static void main(String[] args) {
		/*
		 * 86-->Create a class 'Main' (please do not make it public as Repl will give
		 * you an error)
		 * 
		 * Inside class declare a String variable 'name' and integer variable 'roll_no'.
		 * 
		 * Create an object of the class and assign the value of 2 to roll_no and value
		 * of "John" to name
		 * 
		 * Your program should print the following:
		 * 
		 * Name is John and roll number is 2
		 */
		ClassAndObjects86 student = new ClassAndObjects86();
		student.name = "John";
		student.roll = 2;
		System.out.println("Name is " + student.name + " and roll number is " + student.roll);
	}

}
