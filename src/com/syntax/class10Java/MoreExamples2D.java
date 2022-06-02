package com.syntax.class10Java;

public class MoreExamples2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = {
			    { 1, 2, 3, 4, 5 },        //1 row
				{ 199, 300, 588, 700 },   //2 row
				{ 1900, 4578, 98787 }     //3 row
				};
		
				// NESTED LOOP TO PRINT ALL THE VALUES INSIDE THE BLOCK OF CODE
				// num.length # of rows inside 2D array = 3

				for (int row = 0; row < num.length; row++) {
					for (int col = 0; col < num[row].length; col++) {
						System.out.print(num[row][col] + " ");

					}
					System.out.println();
				}

				// ENHANCE FOR LOOP USES VARIABLES TO ACCESS ELEMENTS FROM AN ARRAY
				// OUTER FOR LOOPS--->ITERATES OVER 1D ARRAY
				// INNER LOPP-->ITERATES OVER ELEMENTS OF EACH 1D ARRAY

				for (int[] a : num) {
					for (int total : a) {
						System.out.print(total + " ");
					}
					System.out.println();
				}

			}

		}
