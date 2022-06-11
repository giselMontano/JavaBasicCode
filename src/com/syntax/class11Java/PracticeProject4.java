package com.syntax.class11Java;

import java.util.Arrays;

public class PracticeProject4 {

	public static void main(String[] args) {
		//Write a java program to find the second largest number in the array
		
		int [] arr= {10,20,5,6,8,200};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]); // THIS IS USE BECAUSE OF THE SIZE OF INDEX last index is always size -1//OTHERWHISE OUT OF BOND ERROR
		System.out.println(arr[arr.length-2]);

//ANOTHET WAY
		














	}

}
