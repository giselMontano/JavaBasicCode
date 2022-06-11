package com.syntax.class9Java;

public class ArrayTaskAllValuesPrinted {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F. Then print A
		// grade B (use 2 different ways of creating an array).

		char grade[] = new char[6];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';
		System.out.println(grade[0]);
		
System.out.println("-------------------------");
		
		//SHORT WAY

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };
		System.out.println(grades[0]);
		
System.out.println("------------------------");
		
		//HOW TO PRINT EVERITHYNG WITH FOR LOOP
		
		for(int i=0; i<grade.length; i++) {
			System.out.print(grade[i]+" ");
		}

		
System.out.println();
		

        // 2. Create an array of words: Java, Saturday, day, coding, is.
		// Print the following sentence using elements of array: “Saturday is Java
		// coding Day”.

		String word[] = new String[5];
		word[0] = "Java";
		word[1] = "Saturday";
		word[2] = "day";
		word[3] = "coding";
		word[4] = "is";
		System.out.println(word[1] + " " + word[4] + " " + word[0] + " " + word[3] + " " + word[2]);
		
System.out.println("--------------------------");
		
		//SHORT WAY

		String[] words = { "Java", "Saturday", "day", "coding", "is" };
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);
        
System.out.println("---------------------------");

		//CHECKING SIZE
		int size=words.length;
		System.out.println(size);//5
		
System.out.println("---------------------------");
		
		
		//PRINTNIG ALL THE ELEMENTS IN THE ORDER THAT WAS PLACED //we can not use <= because the index you are trying to get is 6 and we only declared 5
		//Do Not use <= JUST < //because in loop will try to print next index and you don't have it 
		
        for (int i = 0; i <words.length; i++) {
			System.out.print(words[i] + " ");
		}
	}
}