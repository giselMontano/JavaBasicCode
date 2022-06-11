package com.syntax.class9Java;

public class ArraySize {

	public static void main(String[] args) {
		//Another way to store elements in Array
		//you can keep adding elements here and "length" will let you know how many you have
		
		//Maximum size depends of the data type is the same 
		//it can not have negative elements 
		
		
		String[] fruits= {"Mango","Apple", "Kiwi", "Pear", "Lime"};
		System.out.println(fruits[2]);
		//fruits [4]="peach"; EROOR OUTOFBOUND can not be done 
		
		
		System.out.println("My favorite fruit is "+fruits[0]);//mango
		
		//I want to find a size of an array/ how many elements?
		int size=fruits.length;
		System.out.println(size);

	}

}
