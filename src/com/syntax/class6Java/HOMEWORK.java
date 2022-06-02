package com.syntax.class6Java;

import java.util.Scanner;

public class HOMEWORK {

	public static void main(String[] args) {
		/*Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program should print which grade was entered by a user with explanation.
		HW:  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
		Please complete this assignment in 2 ways: using if statement and switch case.
        */
		Scanner scan = new Scanner(System.in);
		
		revisar esta tarea no la hiciste clase 7 resuelto
		

		System.out.println("Please entre two numbers");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		System.out.println("Please entre the operators + , - , * , / ");
		char opp = scan.next().charAt(0);
        
		if (opp == '+') {
			System.out.println(x + y);
		} else if (opp == '-') {
			System.out.println(x - y);
		} else if (opp == '*') {
			System.out.println(x * y);
		} else if (opp == '/') {
			if (y != 0) {//this condition is because any number / by 0 is an error
				System.out.println(x / y);
			} else {
				System.out.println("Invalid");

System.out.println("------------------------------------------------------------------------");

				System.out.println("Please enter two numbers");
				double a = scan.nextInt();
				double b = scan.nextInt();

				double result = 0;// MUST BE INITIALIZED TO 0 BECAUSE IN CASE NONE OF THE CASES ARE TRUE IT WILL 
				String operator = null;
				System.out.println("Please enter operator");
				char op = scan.next().charAt(0);
				switch (op) {
				case '*':
					result = a * b;
					break;
				case '/':
					result = a / b;
					break;
				case '+':
					result = a + b;
					break;
				case '-':
					result = a - b;
					break;
				default:
					System.out.println("Invalid Operator");
					operator = "Invalid";//
				}
				if (result != 0 || operator == null) {//THIS IS IN CASE YOU DO NOT WANT TO SEE THE SYSO BELOWW WHEN THE CODE GOES TO DEFAULT PART ABOVE
					System.out.println(a + " " + op + " " + b + " = " + result);
					scan.close();
				}
				
System.out.println("-----------------------------------------------------------------------");

				/*
				 * Write a program to ask user to enter value for sale: yes or no 
				 * if there is no sale --> you are not going for shopping 
				 * if there is sale ask user which item they want to buy and it’s price 
				 * Based on the price you have to calculate the price of the item after the discount.
				 * 
				 * discount rule: 
				 * 
				 * if price is less than $20 --> apply 10% 
				 * if price is between $20 & $100 --> 20% 
				 * if price between $100 & $500 --> 30% 
				 * otherwise apply 50% discount 
				 * 
				 * output:
				 * After discount ___ the price of the item reduce from __ to ___
				 * 
				 */

				Scanner input = new Scanner(System.in);
				System.out.println("Is there a sale? Please enter yes or no");
				String sale = input.next();

				double price;
				double discount = 0.00, salePrice = 0.00, discountPrice = 0.0;
				;

				if (sale.equalsIgnoreCase("yes")) {

					System.out.println("Which product do you wish to purchase?");
					String product = input.next();// just a example we do not use this string

					System.out.println("Please enter the price of the product");
					price = input.nextDouble();

					if (price < 20) {
						discount = 10;
					} else if (price >= 20 && price <= 100) {
						discount = 20;
					} else if (price >= 101 && price <= 500) {
						discount = 30;
					} else {
						discount = 50;
					}

					discountPrice = price * discount / 100;
					salePrice = price - discountPrice;

					System.out.println(product + " after a discount of $" + discountPrice
							+ " the price of the item reduced from " + price + " to " + salePrice);
				} else {
					System.out.println("There is no sale, so you are not going shopping");
					input.close();
				}

			}
		}
	}

}
