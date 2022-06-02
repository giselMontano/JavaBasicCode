package com.syntax.class7Java;

public class WhileClass {

	public static void main(String[] args) {

		int x = 10;
		x = x + 1;
		x += 1;

		System.out.println(x);//12

		System.out.println("----------------------------------------------------");
		
		x++;// increment value of a variable by 1
		System.out.println(x);// 13
		
		
		System.out.println("----------------------------------------------------");
		
		x--;// decrement value of a variable by1
		System.out.println(x);// 12
		
		System.out.println("-----------------------------------------------------");
		
		int time = 10;
		while (time <= 12) {
			System.out.println("Morning");
			time++;
		}

		System.out.println();
		// increment and decrement operators work only with variables

		int num = 100;
		num++;
		{
			System.out.print(num);
		} // 101

		System.out.println();

		// counter variable 1 to 10/ counter should be placed at the end
		int a = 1;
		while (a <= 10) //boolean value always check if is true of false
		{
			System.out.print(a + " ");
			a++;
		}

		System.out.println();
		
		// COUNTER VARIABLE MOVED 1 to 10

		int b = 0;//must change

		while (b < 10) {
			b++;// can be here but relational operator change from "<=" to "<", as well as the start point
			System.out.print(b + " ");
		}

		System.out.println();
		// 10 to 100
		int c = 10;

		while (c <= 100) {
			System.out.print(c + " ");
			c++;
		}

		System.out.println();
		// print numbers from 10 to 1

		int d = 10;

		while (d >= 1) {
			System.out.print(d + " ");
			d--;
		}

		System.out.println();

		// print numbers from 100 to 50
		int e = 100;

		while (e >= 50) {
			System.out.print(e + " ");
			e--;
		}

		System.out.println();

		// print number from -1 to -10
		int f = -1;
		while (f >= -10) {
			System.out.print(f + " ");
			f--;
		}
	}

}
