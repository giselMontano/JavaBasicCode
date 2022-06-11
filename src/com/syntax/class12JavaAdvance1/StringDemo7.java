package com.syntax.class12JavaAdvance1;

public class StringDemo7 {

	public static void main(String[] args) {
		// TO FIND THE INDEX WHERE LETTER C IS LOCATED
		//You can look for a character 'c' or a word "confused"
		String statement = "I am always confused";

		System.out.println(statement.indexOf('c'));//12-->this is the first 'c' inside the string 
		System.out.println(statement.indexOf("always"));//5-->is five because it counts spaces as well, it can also look for words
		
		System.out.println(statement.indexOf(' '));//it is possible to find space as well it takes the first one that in inside the string
		System.out.println(statement.indexOf('z'));//-1-->IF SOMETHING IS NOT PRESENT IN THE STRING IT WILL GET -1
		
		
		System.out.println(statement.indexOf('a'));//2-->there is two spaces before reaching the first 'a' in the string, 
                                            		//this will find the first character 'a' that is inside the string
		System.out.println(statement.indexOf('a',5));//this is the way you find the second 'a'
		// first you need to select everything before the letter you want to find then check below eclipse and write your start point after the character you are looking for.
		
	}

}
