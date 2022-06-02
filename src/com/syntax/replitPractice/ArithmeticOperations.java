package com.syntax.replitPractice;

public class ArithmeticOperations {

	public static void main(String[] args) {
		/*
		 * 09-->For you to do:
		 * Create a float data type variable and assign a value of 8.2 to it
		 * Multiply the value by itself and print the result.
		 * 
		 * Output:
         *
         *The multiplication of ___ with itself is equal to ____
		 */
		float value = 8.2f;
		float mult;
		mult = value * value;

		System.out.println("The multiplication of " + value + " with itself is equal to " + mult);
		
		System.out.println("-------------------------------------------------");
		
		/*
		 * 10-->For you do to: Declare 2 numbers and assign values 200 and 100
		 * respectively. First, add numbers, then subtract, third multiply, forth
		 * divide. Please use variables to print the values of each operation result on
		 * a separate line. 
		 * 
		 * Output:
		 * 
		 * 300 
		 * 100 
		 * 20000 
		 * 2
		 */
		int number1 = 200;
		int number2 = 100;
		int sum1, sub1, mult1, div1;
		sum1 = number1 + number2;
		sub1 = number1 - number2;
		mult1 = number1 * number2;
		div1 = number1 / number2;
		System.out.println(sum1);
		System.out.println(sub1);
		System.out.println(mult1);
		System.out.println(div1);
		
		System.out.println("-------------------------------------------------");
		
		/*
		 * 11-->For you to do: Write a program to print the perimeter and area of a
		 * rectangle with width = 5 and height = 8. 
		 * 
		 * Output:
		 * 
		 * The perimeter of a rectangle with width __ and height __ is equals to __ and
		 * the area equals to __
		 */
		int width = 5;
		int height = 8;
		int perimeter = 2 * (width + height);
		int area = width * height;
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equals to " + perimeter + " and the area equals to " + area);
		
		System.out.println("-------------------------------------------------");
		
		/*
		 * 12-->For you to do: Add num1 and num2 Divide the result by num3 Subtract num4
		 * from that result Instructions: Please use variables to assign the result of
		 * arithmetic operations
		 * 
		 * Output: The result of arithmetic operations is equal to ___
		 */
		int num1 = 3;
		int num2 = 7;
		int num3 = 5;
		int num4 = 1;
		int sum;
		sum = num1 + num2;
		int div;
		div = sum / num3;
		int sub;
		sub = div - num4;

		System.out.println("The result of arithmetic operations is equal to " + sub);
		
		System.out.println("-------------------------------------------------");

		/*
		 * 13-->Math Magic In this project, you will become a magician and write a small
		 * program that performs a mathematical magic trick! It will involve performing
		 * arithmetic operations on an integer that you created.
		 * 
		 * For you to do:
		 * 
		 * Create an int variable called myNumber. Set it equal to any number other than
		 * 0. We will refer to myNumber as the original number from now on. Create an
		 * int variable called stepOne. Set it equal to the original number (myNumber)
		 * multiplied by itself. Create an int variable called stepTwo. Set it equal to
		 * the previous result (stepOne) plus the original number (myNumber). Create an
		 * int variable called stepThree. Set it equal to the previous result (stepTwo)
		 * divided by the original number. Create an int variable called stepFour. Set
		 * it equal to the previous result (stepThree) plus 17. Create an int variable
		 * called stepFive. Set it equal to the previous result (stepFour) minus the
		 * original number. Create an int variable called stepSix.Set it equal to the
		 * previous result (stepFive) divided by 6. Let's print out the value of the
		 * last step as: "The magic number is _ !" Now try running your code! What
		 * number is printed to the console?
		 * 
		 * Now, go back to your code and change myNumber to any other integer.
		 * 
		 * Run your program again.
		 * 
		 * Is the output the same?
		 * 
		 * It's math magic!
		 * 
		 * Output:
		 * 
		 * The magic number is _!
		 */
		int myNumber = 7;
		int stepOne = myNumber * myNumber;
		int stepTwo = stepOne + myNumber;
		int stepThree = stepTwo / myNumber;
		int stepFour = stepThree + 17;
		int stepFive = stepFour - myNumber;
		int stepSix = stepFive / 6;
		int result = stepSix;
		
		System.out.println("The magic number is " + result + "!");
		
		System.out.println("-------------------------------------------------");
		
		/*
		 * 14-->For you to do
		 * 
		 * Add the values of num1 and num2 and then subtract num3 from the result and
		 * store it in result1 variable Multiply num4 and num5 together and then divide
		 * num6 from the result and store it in result2 variable 
		 * 
		 * Print the following
		 * statement: _______ modded by _______ is ______** result2 result1 blank3 where
		 * blank3 is the remainder of result1 into result2
		 */
		int nuM1 = 5;
		int nuM2 = 4;
		int nuM3 = 3;

		int nuM4 = 7;
		int nuM5 = 10;
		int nuM6 = 5;

		int suM;
		suM = nuM1 + nuM2;
		int suB;
		suB = suM - nuM3;
		int resulT1 = suB;
		int mulT;
		mulT = nuM4 * nuM5;
		int diV;
		diV = mulT / nuM6;
		int resulT2 = diV;
		int resulT3;
		resulT3 = resulT2 % resulT1;
		System.out.println(resulT2 + " modded by " + resulT1 + " is " + resulT3);
		
		System.out.println("-------------------------------------------------");
		
		/*
		 * 15-->For you to do: Print the results of 14 mod 2.
		 * 
		 * Expected Output:
		 * 
		 * 0
		 */
		int num = 14 % 2;

		System.out.println(num);
		
		System.out.println("-------------------------------------------------");
		
		/*
		 * 16-->For you to do:
		 * Print the result of 29 mod 4
		 * 
		 * Output:
		 * 
		 * 1
		 */
		int nUm = 29 % 4;
		System.out.println(nUm);
		
		System.out.println("-------------------------------------------------");
		
		
		/*
		 * 17-->For you to do: Print result of -21 mod 4?
		 * 
		 * Expected Output:
		 * 
		 * -1
		 */
		int Num = -21 % 4;
		System.out.println(Num);
		
	}

}
