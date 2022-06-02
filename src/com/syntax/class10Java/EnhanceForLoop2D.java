package com.syntax.class10Java;

public class EnhanceForLoop2D {

	public static void main(String[] args) {
		// 
		String [][] usa= {
				{"New York", "Manhattan", "Westchester", "Long Island"},
				{"Los Angeles", "San Francisco","San Diego"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmound", "Leesburg"}
		};
		//OUTER LOOP ITERATES OVER ROWS
		//INNER LOOP ITERATES OVER COLUMNS
		
		for(int row=0; row<usa.length; row++) {
			for(int col=0; col<usa[row].length; col++) {
				System.out.print(usa[row][col]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println(usa[1][2]);//San Jose
		
	}

}
