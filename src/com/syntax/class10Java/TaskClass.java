package com.syntax.class10Java;

public class TaskClass {

	public static void main(String[] args) {
		//From an array of integer elements find the LARGEST number.
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int max = num[0];
		for (int i = 1; i < num.length; i++) {//first one is 1 to be compare to that one first time
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("The largest number is " + max);
		
		//ENHANCE WAY
		max = num[0];
		for(int largest : num) {
			if(largest > max){
				max= largest;
			}
		}
		System.out.println("The largest number is " + max);
				

//Create an array to store char values and then print those in reverse order
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		int size = grades.length;
		System.out.println(size);// 6-1=5 //6 but 0 takes the first one therefore is the size is 5//
		for (char i = 5; i < grades.length; i--) {
			System.out.print(grades[i] + " ");
			
		}
		//ENHANCE FOR LOOP CAN NOT BE DONE IN REVERSE ORDER!!!!
		
	}

}
