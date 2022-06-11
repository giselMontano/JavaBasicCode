package com.syntax.class10Java;

public class Array2DEnhanceForLoop {

	public static void main(String[] args) {
		// create 2d array of states
		/*
		 * 1 array ->NY -->all the cities of NY state
		 * 2 array ->CA -->all the cities of CA state
		 * 3 array ->FL -->all the cities of FL state
		 * 4 array ->VA -->all the cities of VA state
		 *  
		 * */
		String [][] usa= {
				{"New York", "Manhattan", "Westchester", "Long Island"},
				{"Los Angeles", "San Francisco","San Diego"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmound", "Leesburg"}
		};
		
		System.out.println(usa[1][2]);//San Diego//this is the location of San Diego
		System.out.println("I want to go to "+usa[2][0]);

System.out.println();
		
		System.out.println("Total of # 1D array in array 2D usa = "+usa.length);//4 array stored inside 2D array
		
System.out.println();
		
		//I WANT TO FIND HOW MANY ELEMENTS INSIDE MY 1 ARRAY
		int elements1Array=usa[0].length;
		System.out.println("# of elements inside 1 array inside usa 2D array = "+elements1Array);//4 elements stored inside 1 Array
		
System.out.println();

		//I WANT TO FIND HOW MANY ELEMENTS INSIDE MY 2 ARRAY
		int elements2Array=usa[1].length;
		System.out.println("# of elements inside 2 array inside usa 2D array = "+elements2Array);//3 elements stored inside 2  Array
		
System.out.println();

		//OUTER LOOP ITERATES OVER ROWS OR ARRAYS 
		//INNER LOOP ITERATES OVER COLUMNS OR ELEMENTS 

		for (int row = 0; row < usa.length; row++) {
			for (int col = 0; col < usa[row].length; col++) {
				System.out.print(usa[row][col] + " ");
			}
			System.out.println();
		}
		
		
System.out.println();

       //ENHENCE WAY TO PRINT ALL THE ELEMENTS 

		for (String[] a : usa) {
			for (String total : a) {
				System.out.print(total + " ");
			}
			System.out.println();
		}

	}

}
