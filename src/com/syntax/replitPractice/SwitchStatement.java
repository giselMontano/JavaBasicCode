package com.syntax.replitPractice;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		/*
		 * 40--> For you to do:
		 * 
		 * By using the switch statement concept please validate what is the
		 * responsibility each instructor in the syntax solution.
		 * 
		 * First Output: "Enter name of the instructor" case 1: if User provided the
		 * name as Asghar as input it should show "Will take care of Java Assignment"
		 * case 2: if User provided the name as Moazzam as input it should show
		 * "Will take care of SDLC Assignment" case 3: if User provided the name as
		 * Weqas as input it should show "Will take care of Selenium Assignment" case 4:
		 * if User provided the name as Asel as input it should show
		 * "Will take care of every Assignment" Other than these four names if the user
		 * provides any other names --> " Invalid instructor selected"
		 */
		Scanner scan = new Scanner(System.in);
		String name, assign;
		System.out.println("Enter name of the instructor");
		name = scan.nextLine();

		switch (name.toLowerCase()) {
		case "asghar":
			assign = "Will take care of Java Assignment";
			break;
		case "moazzam":
			assign = "Will take care of SDLC Assignment";
			break;
		case "weqas":
			assign = "Will take care of Selenium Assignment";
			break;
		case "asel":
			assign = "Will take care of every Assignment";
			break;
		default:
			assign = "Invalid instructor selected";
		}

		{
			System.out.println(assign);
		}
		
System.out.println();


		/*
		 * 41-->For you to do:
		 * 
		 * Write a program using the switch statement
		 * 
		 * Let us consider the scenario regarding the born baby age
		 * 
		 * First Output:
		 * 
		 * "Enter the age of the Child" case 1: if age is 1 print as "You can Crawl"
		 * case 2 : if age is 2 print as "You can Talk" case 3: If age is 3 print as
		 * "You can Dance" case 4: if age is 4 print as "You can get Trouble" Other than
		 * this age (1-4) it should print "I don't know how old you are"
		 */
		System.out.println("Enter the age of the child");
		int age = scan.nextInt();
		String can;

		switch (age) {
		case 1:
			can = "You can Crawl";
			break;
		case 2:
			can = "You can Talk";
			break;
		case 3:
			can = "You can Dance";
			break;
		case 4:
			can = "You can get Trouble";
			break;
		default:
			can = "I don't know how old you are";
		}
		{
			System.out.println(can);
		}
		
System.out.println();


		/*
		 * 42-->For you to do:
		 * 
		 * Write a program using the switch statement
		 * 
		 * Let us consider there are three students in the class with roll number
		 * starting from (101 to 103) if any number other than 101-103 are present
		 * display "Not found Student name: in Class"
		 * 
		 * First Output: "Enter the roll number of the Child"
		 * 
		 * case 101: if roll number is 101 print as "Student name: Ramesh" case 102 :if
		 * roll number is 102 print as "Student name: Mahesh" case 103:if roll number is
		 * 103 print as "Student name: Mukesh" Other than this roll number it should
		 * print "Not found Student name: in Class"
		 */
		System.out.println("Enter the roll number of the Child");
		int roll = scan.nextInt();
		String namE;
		switch (roll) {
		case 101:
			namE = "Student name: Ramesh";
			break;
		case 102:
			namE = "Student name: Mahesh";
			break;
		case 103:
			namE = "Student name: Mukesh";
			break;
		default:
			namE = "Not found Student name: in Class";
		}
		{
			System.out.println(namE);
		}
		
System.out.println();

		/*
		 * 43-->For you to do:
		 * 
		 * Write a program to input number "Input a number between 1-12" and when you
		 * input a number it should display the month using Scanner and Switch
		 * statement.
		 * 
		 * case: 1 will display January
		 * 
		 * case: 12 will display December
		 * 
		 * Anything outside of 12 will display "Invalid"
		 * 
		 * Example Output:
		 * 
		 * Input a number between 1-12 Invalid Example Output:
		 * 
		 * Input a number between 1-12 January
		 */
		
		System.out.println("Input a number between 1-12");
		int num = scan.nextInt();
		String nAme;
		switch (num) {
		case 1:
			nAme = "January";
			break;
		case 2:
			nAme = "February";
			break;
		case 3:
			nAme = "March";
			break;
		case 4:
			nAme = "April";
			break;
		case 5:
			nAme = "May";
			break;
		case 6:
			nAme = "June";
			break;
		case 7:
			nAme = "July";
			break;
		case 8:
			nAme = "August";
			break;
		case 9:
			nAme = "September";
			break;
		case 10:
			nAme = "October";
			break;
		case 11:
			nAme = "November";
			break;
		case 12:
			nAme = "December";
			break;
		default:
			nAme = "Invalid";
		}
		{
			System.out.println(nAme);
		}
		
System.out.println();

		/*
		 * 44-->For you to do:
		 * 
		 * Prompt user with questions: "Please enter your favorite car make"
		 * 
		 * if user enters BMW --> carOrigin = "german car"
		 * 
		 * if user enters Toyota --> carOrigin = " japanese car"
		 * 
		 * if user enters Maserati --> carOrigin = "italian car"
		 * 
		 * anything else besides those values --> carOrigin = "unknown"
		 * 
		 * The output of your program should be:
		 * 
		 * "Your favorite car is ___"
		 */
		String car, favoriteCar;

		System.out.println("Please enter your favorite car make");
		car = scan.nextLine();

		switch (car.toLowerCase()) {
		case "bmw":
			favoriteCar = "german car";
			break;
		case "toyota":
			favoriteCar = "japanese car";
			break;
		case "maserati":
			favoriteCar = "italian car";
			break;
		default:
			favoriteCar = "unknown";
			break;
		}
		{
			System.out.println("Your favorite car is " + favoriteCar);
		}
		
		
System.out.println();


		/*
		 * 45-->For you to do:
		 * 
		 * Ask the user to enter any number from 1-7.
		 * 
		 * Based on the number define the day of the week
		 * 
		 * Example Output:
		 * 
		 * Input a number between 1-7 IMPUT:5 Friday
		 * 
		 * Example Output:
		 * 
		 * Input a number between 1-7 IMPUT:9 Invalid
		 */
		System.out.println("Input a number between 1-7");
		int day = scan.nextInt();
		String naMe;

		switch (day) {
		case 1:
			naMe = "Monday";
			break;
		case 2:
			naMe = "Tuesday";
			break;
		case 3:
			naMe = "Wednesday";
			break;
		case 4:
			naMe = "Thursday";
			break;
		case 5:
			naMe = "Friday";
			break;
		case 6:
			naMe = "Saturday";
			break;
		case 7:
			naMe = "Sunday";
			break;
		default:
			naMe = "Invalid";

		}
		{
			System.out.println(naMe);
		}
		scan.close();

	}

}
