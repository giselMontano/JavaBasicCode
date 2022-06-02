package com.syntax.class7Java;

public class Task {

	public static void main(String[] args) {
		// print numbers 1 to 20 but only EVEN numbers
		int e = 2;//in this case you need to fix your starting point
		while (e <= 20) {
			System.out.print(e + " ");
			e += 2;//e=e+2-->4,6,8...
		}
		System.out.println();
		
		
		// ANOTHER WAY
		int f = 1;
		while (f <= 20) {
			if (f % 2 == 0) {
				System.out.print(f + " ");
			}
			f++;//has to be out of the brackets of IF CONTION because whether the condition is true or false 
			    //we want the loop to keep increasing or decreasing as we needed to. 
			    //this way at some point condition will be false and loop will stop to jump to another block
			    //otherwise we will be stuck in a infinite loop.
		}
		System.out.println();
		

		// print EVEN numbers from 20 to 100
		int a = 20;
		while (a <= 100) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
			}
			a++;//always at the end outside of any condition 
		}
		System.out.println();
		

		// print only ODD numbers from 100 to 1
		int b = 100;
		while (b >= 1) {
			if (b % 2 != 0) {
				System.out.print(b + " ");
			}
			b--;
		}
		System.out.println();
		
		
		// another way OOD NUMBERS
		int c = 99;//fix starting point
		while (c >= 1) {
			System.out.print(c + " ");
			c -= 2;
			
		}
	}

}
