package com.syntax.replitPractice;

public class TESTARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 12, 15, 16, 17, 19 };

		for (int i = nums.length - 1; i > 0; i--) {

			System.out.println(nums[i]);

		}

System.out.println("---------------1------------------");
		
        int i = 50;

		int[] a = new int[10];

		System.out.println(a.length);

		a = new int[100];

		System.out.println(a.length);

		a = new int[i];

		System.out.println(a.length);

System.out.println("----------------2-----------------");


		int[] v = { 12, 15, 11, 13, 9, 25 };
		int[] a2 = { 12, 15, 11, 13, 9, 25 };
		int sum = 0;
		for (int c = 0; c < v.length; c++) {
			if (v[c] % 2 == a2[c] % 5) {
				sum += c * c;
			}
		}
        System.out.println("sum = " + sum);

System.out.println("----------------3-----------------");

		int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

		for (int index = 0; index < 5; index++) {
			System.out.print(egArray[index] + " ");
		}
		
		System.out.println();

System.out.println("---------------4------------------");

        char array_variable[] = new char[10];
		for (int y = 0; y < 10; ++y) {
			array_variable[y] = 'i';
			System.out.print(array_variable[y] + " ");
		}
        System.out.println();
		
         
System.out.println("---------------5-------------------");
		
        int arrayVariable[][] = { 
        		                 { 1, 2, 3 }, 
        		                 { 4, 5, 6 }, 
        		                 { 7, 8, 9 } 
        		                 };

		int sum1 = 0;

		for (int Z = 0; Z < 3; ++Z) {

			for (int j = 0; j < 3; ++j) {

				sum1 = sum1 + arrayVariable[Z][j];

			}
		}
		System.out.print(sum / 5);
		System.out.println();
		
System.out.println("----------------6-----------------");
		
        int[] array = { 1, 4, 3, 6, 8, 2, 5 };

		int what = array[0];

		for (int index = 0; index < array.length; index++) {

			if (array[index] > what) {

				what = array[index];

			}

		}

		System.out.println(what);
		
System.out.println("-----------------7----------------");
		

        int[] zip = new int[5];

		zip[0] = 7;
		zip[1] = 3;
		zip[2] = 4;
		zip[3] = 1;
		zip[4] = 9;

		System.out.println(zip[2 + 1]);

System.out.println("-----------------8----------------");
		
        for (int B = 1; B < 15; B = B + 3) {

			System.out.print(B);
			System.out.println();
			
			
System.out.println("-----------------9----------------");
			int x = 1;

			while (x < 5) {

				x++;

		    System.out.print(x);}
  			System.out.println();
  			
System.out.println("----------------10-----------------");
 
	
			int count = 0;
			while (count++ < 10) {
				System.out.println("Welcome to Java");
			}
			
System.out.println("-----------------11----------------");

			int p = 0;
			for (int K = 0; K < 10; ++K) {
				p += 1;
			}
            
			System.out.println(p);
			
			
System.out.println("------------------12---------------");
		

       for (int u = 0; u <= 5; u++) {
			System.out.println("i = " + u);
		}

		System.out.println("i after the loop = " + i);
		
System.out.println("---------------13------------------");

		for (int t = 0; t <= 5; t++) {
			System.out.println("i = " + t);
		}
		
System.out.println("----------------14-----------------");

		int k = 3, tot = 0;

		do {

			tot = tot + k;

			k++;

		} while (k < 11);

		System.out.print(tot);
		System.out.println();
		
		
System.out.println("----------------15-----------------");

		int n = 1;

		do {

			n++;

			System.out.print(n);

		} while (n < 5);
		System.out.println();
		
System.out.println("--------------16-------------------");

		int z = 2, sum5 = 0;

		while (z < 9) {

			z++;

			sum5 = sum5 + z;

		}

		System.out.print(sum5);
		System.out.println();
		
System.out.println("--------------17-------------------");

		int m = 2, total = 0;

		while (m < 6) {

			total = total + m;

			m++;

		}

		System.out.print(total);
	}

}
}
