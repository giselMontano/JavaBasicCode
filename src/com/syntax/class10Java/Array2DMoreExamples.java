package com.syntax.class10Java;

public class Array2DMoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = {
			    { 1, 2, 3, 4, 5 },        //1 row
				{ 199, 300, 588, 700 },   //2 row
				{ 1900, 4578, 98787 }     //3 row
				};
		
				// NESTED LOOP TO PRINT ALL THE VALUES INSIDE THE BLOCK OF CODE
				// num.length # of rows inside 2D array = 3

				for (int i = 0; i < num.length; i++) {
					for (int j = 0; j < num[i].length; j++) {
						System.out.print(num[i][j] + " ");

					}
					System.out.println();
				}

				// ENHANCE FOR LOOP USES VARIABLES TO ACCESS ELEMENTS FROM AN ARRAY
				// OUTER FOR LOOPS--->ITERATES OVER 1D ARRAY [] that is why you just have one square brackets goes one by one for the arrays
				// INNER LOPP-->ITERATES OVER ELEMENTS OF EACH 1D ARRAY
                 //INSIDE AN ENHANCE MUST BE INICIALIZED THE DATA TYPE YOU ARE WORKING ON 
				for (int[] a : num) {
					for (int total : a) {
						System.out.print(total + " ");
					}
					System.out.println();
				}

			}

		}
