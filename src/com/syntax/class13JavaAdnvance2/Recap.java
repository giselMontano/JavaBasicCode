package com.syntax.class13JavaAdnvance2;

public class Recap {

	public static void main(String[] args) {
		
		String str = "Batch 13 is great but I say this to every batch, I was kidding";
		int size=str.length();//THIS IS TO SAVE  
		System.out.println(size);
		
		
		System.out.println("-----------------------------");
		System.out.println(str.toUpperCase());//JUST PRINT OUT
		System.out.println(str);//IT DOES NOT  CHANGE VALUES INTO UPPER CASE UNTIL YOU REASIGN VALUE
		//to change the characters inside string it need to be reassign 
		
		
		System.out.println("-----------------------------");
		//REASSIGNING INTO UPPER CASE 
		str=str.toUpperCase();
		System.out.println(str);//IT HAS CHANGED
		
		
		System.out.println("-----------------------------");
		//REASSIGNNING 
		str="";
		System.out.println(str.isEmpty());//true str was reassigned with nothing inside 
		
		
		System.out.println("-----------------------------");
		//REASSIGNNING
		str=" ";
		System.out.println(str.isEmpty());//False str was reassigned with space inside 
		
		System.out.println("-----------------------------");
		//TRIM METHOD TO REMOVE SPACES BEFORE AND AFTER BUT NOT THE MIDDLE ONES 
		str=" Tara";
		System.out.println(str.trim());//it removes spaces in front and at the end of string
		
		System.out.println("-----------------------------");
		//LOOKING FOR A WORD OR LETTER
		str="Batch 13 is great but I say this to every batch, I was kidding";
		System.out.println(str.contains("batch"));//true
		System.out.println(str.contains("b"));//true
		
		System.out.println("-----------------------------");
		//TO FIND FIRST AND LAST WORD OR LETTER 
		System.out.println(str.startsWith("Batch"));//true
		System.out.println(str.endsWith("ing"));//true
		
		System.out.println("-----------------------------");
		//LOOKING FOR A CHARACTER 
		str="Where is sammer";
		System.out.println(str.charAt(3));//r-->index 3 is r
		System.out.println(str.charAt(5));// don't see anything because is a space
		//System.out.println(str.charAt(50));//ERROR
		//System.out.println(str.charAt(-2));//Error-->no numbers negatives
		
		System.out.println("-----------------------------");
		
		//HOW TO FIND INDEX OF A LETTER 
		str="Where are you when I call";
		System.out.println(str.indexOf("a"));//6-->INDEX 
		System.out.println(str.indexOf("e"));//2-->INDEX
		System.out.println(str.indexOf("e",6));//8-->INDEX. START your search of "e" from index 6 ahead
		
		System.out.println("------------------------------");
		//SUBSTRACTING WORDS
		str="I am confused again";
		System.out.println(str.substring(5));//WILL PRINT FROM INDEX 5 AHEAD 
		System.out.println(str.substring(2));//WILL PRINT FROM INDEX 2 AHEAD
		
		//PRINTING THINGS IN THE MIDDLE WITH START POINT (THIS START INDEX  IS INCLUDED) AND END POINT IS NOT, JUST BEFORE END POINT
		str="I am confused";
		System.out.println(str.substring(2,4));//am
		System.out.println(str.substring(0,1));//I
		System.out.println(str.substring(0,5));//I am-->prints everything starting from 0 till before 5
		
	}

}
