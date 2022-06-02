package com.syntax.class7Java;

public class DoWhileClass {

	public static void main(String[] args) {
// WHILE LOOP--> FIRST CHEKCS CONDITION
// AND ONLY THEN EXECUTE THE CODE
		int a = 1;
		while (a <= 3) {
			System.out.print(a + " ");
			a++;
		}

System.out.println();

		int num = 10;// NO EXCECUTION BECAUSE JAVA CAN NOT ACCCESS TO THE CODE SINCE THE CONDITION IS
						// FALSE
		while (num <= 3) {
			System.out.print(num + " ");
			num++;
		}
System.out.println();

//DO WHILE---> FIRST EXECUTE THE CODE 
//AND ONLY THEN CHEKS THE CONDITION 
		int b = 1;
		do {
			System.out.print(b + " ");
			b++;
		} while (b <= 3);
		
System.out.println();

		int num1 = 10;
		do {
			System.out.print(num1 + " ");// THIS IS 10 AND GOT EXCECUTED
			num1++;// 10+1=11-->this comes after the execution of 10
		} while (num1 <= 3);// CONDITION IS FALSE 11 IS NOT SMALL OR EQUAL TO 3,but 10 got executed already.
System.out.println();

//PRINT NUMBERS 1 TO 30 USING DO WHILE 
		int c = 1;
		do {
			System.out.print(c + " ");
			c++;
		} while (c <= 30);

System.out.println();

//PRINT "EVEN" NUMBERS FROM 70 TO 30
		int d = 70;
		do {
			System.out.print(d + " ");
			d -= 2;// 68,66,64 etc
		} while (d >= 30);

	}
}
