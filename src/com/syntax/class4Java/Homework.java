package com.syntax.class4Java;

public class Homework {

	public static void main(String[] args) {
		
//Write a program to store a value whether user has diploma or not. 
//If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree
//Then if user has a degree program should check a gpa score.
//If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”, otherwise → “You should have studied harder” .

		boolean diploma = true;
		double gpa;
		if (diploma) {
			System.out.println("Congratulations");
			gpa = 4;
			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("I encourage you to get a diploma");
		}
		
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
//Create a Java program and store values of mortgage rate and mortgage price. 
//First, program should check if rate is higher than 4.5 user will not buy a house
//otherwise user will consider buying. Once user decides to buy a house, if price of the house is larger than 50000 than user will take a loan
//otherwise user will pay cash.
		
		double mortgageRate=4;
		double mortgagePrice=23000;
		
		
		if (mortgageRate>4.5) {System.out.println(" Not buy a house ");}
		  else {System.out.println(" Consider buying ");
		    if (mortgagePrice>50000) { System.out.println(" I will take a loan ");}
		    else {System.out.println(" I will pay cash ");}}
	
		  
		

		}
	}


