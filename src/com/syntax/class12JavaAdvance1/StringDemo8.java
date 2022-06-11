package com.syntax.class12JavaAdvance1;

public class StringDemo8 {

	public static void main(String[] args) {
		//Extracting part of the string 
		String extract="Java is easy";
		
		String doneExtr=extract.substring(0,4);//java-->provide the starting point 0 and ending point 4 of elements, 
		                                   //to find the end point select the word and check below in eclipse writable [4]
		System.out.println(doneExtr);
		
		//direct way
		System.out.println(extract.substring(8,12));//easy-->find the starting point and the ending point of the word
		//select everything before the word to find the start point and select everything till the end of the word you want to know the ending point
		
		

	}

}
