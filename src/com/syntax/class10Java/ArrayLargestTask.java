package com.syntax.class10Java;

public class ArrayLargestTask {

	public static void main(String[] args) {
		//From an array of integer elements find the LARGEST number.
		//IMPORTANT [i] HOLDS INDEXES
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8 };
		
		int max = num[0];//WE SUPOSSED INDEX 0 TO BE THE LARGEST 
		
		for (int i = 1; i < num.length; i++) {//WE INICIATED WITH INDEX 1 IN ORDER TO BE COMPARE WITH INDEX 0/ second run ADD 1 TO i-->1=1=2 second index
			if (num[i] > max) {//2>1=TRUE/ 3>2=true
				max = num[i];//REASsIGN 2 INSIDE MAX GOES BACK// reassign index 3
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
