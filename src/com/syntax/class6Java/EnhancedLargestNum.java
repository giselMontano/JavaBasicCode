package com.syntax.class6Java;

public class EnhancedLargestNum {

	public static void main(String[] args) {
		// 
		int num1 = 65;
		int num2 = 66;
		int num3 = 23;
		if (num1 > num2 && num1 > num3) {
			System.out.println("The largest number is " + num1);
		}else if (num3>num1 && num3>num2) {
			System.out.println("The largest number is " + num3);
		}else if (num2>num1 && num2>num3) {
			System.out.println("The largest number is " + num2);

		} else {
			System.out.println("All the numbers are equal");
		}
		
		System.out.println("-----------------------------------------------------------");
		
		// ENHANCED
		int a = 20;
		int b = 20;
		int c = 20;
		/*compiler can initialize variables to it's default value 
		 * int-->
		 * double-->0.0
		 * boolean-->false
		 * String-->null
		 */
		int largest=0;
		
		if (a > b && a > c) {
			largest = a;
		} else if (c > a && c > b) {
			largest = c;
		} else if (b > a && b > c) {
			largest = b;
		} else {
			System.out.println("All numbers are equal");//you should always have a variable in else block when using enhance 
			//largest=nim4;     --->one way to use a variable in else block 
			//Another one way is at the beginning (int largest=0;)
		}
		    if(largest!=0) {
			System.out.println("The largest number is " + largest);}
			// if all the numbers are the same or all the conditions are false COMPILER will
			// complain "the variable largest may not have been initialized" we do not have
			// [else block]
         
		    
		    System.out.println("---------------------------------------------------------------------");
          
          
		    //HOMEWORK HOW TO FIX IF TWO NUMBERS ARE EQUAL 
		    int x = 20;
			int y = 20;
			int z = 2;
			int largest2 = 0;
			
			if (x > y || x > z) {
				largest2 = x;
			} else if (z > x || z > y) {
				largest2 = z;
			} else if (y > x || y > z) {
				largest2 = y;
			} else {
				System.out.println("All numbers are equal");}
				
			    if(largest2!=0) {
				System.out.println("The largest number is " + largest2);}
				
			
			
			
		}
	}


