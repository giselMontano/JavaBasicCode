package com.syntax.class10Java;

public class Array2DIntro {

	public static void main(String[] args) {
		// TO CREATE 2D ARRAY WE SPECIFY # OF ROWS AND COLUMS = SIZE
		
		int[][] numbers= new int [3][4];
		//1 ROW
		numbers[0][0] = 10;
		numbers[0][1] = 20;
        numbers[0][2] = 30;
		numbers[0][3] = 40;
		
		//2 ROW
		numbers[1][0] = 1;
		numbers[1][1] = 2;
        numbers[1][2] = 3;
		numbers[1][3] = 4;
		
		//3 ROW
		
		numbers[2][0] = 9;
		numbers[2][1] = 8;
        numbers[2][2] = 7;
		numbers[2][3] = 6;
		
		System.out.println(numbers[1][3]);//4
		System.out.println(numbers[0][1]);//20
		
		
		
		//NUMBERS OF ROWS
		int rows=numbers.length;//gives # of 1 d arrays inside 2d array
		System.out.println("Number of rows "+rows);
		
		int colsOf1row=numbers[0].length;//numbers[0] is entering into first array and gives number of columns starts 0
		System.out.println("Numbers of cols in 1 row ="+colsOf1row);
		
		
		//easy way to check how many arrays is combined into 2D array
		System.out.println(numbers.length);//3
		
		
		
		
		

	}

}
