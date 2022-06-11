package com.syntax.class14JavaAdvance;

public class Recap {

	public static void main(String[] args) {
		// CHANGING TWO WORDS FROM A STRING
		String str = "I never forget about recording";
		System.out.println(str.replace("never", "always").replace("I", "Ashgar"));

		str = "112324566436534BGNBJKDNGNBGNBkdjbnjknbjngfbjngj$^%$^%$^&%&%}{[]";
		System.out.println(str.replaceAll("[0-9]", ""));
		
		//CREATING AN ARRAY OF STRINGS THE CUTTING POINT IS WHATWEVER IS INSIDE SPLIT.("[]")
		String str2="Batch 13 is Great.Batch 13 is the best.Batch 13 is excellent";
		String[] arr=str2.split(" ");//THE SPACE  INSIDE [] IS THE END OF THE FIRST ARRAY THEN SECOND AND SO ON
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
		String str3="Batch 13 is Great.Batch 13 is the best.Batch 13 is excellent";
		String[]  array=str3.split("[.]");//THE POINT  INSIDE [] IS THE END OF THE FIRST ARRAY THEN SECOND AND SO ON
		System.out.println( array[0]);
		System.out.println( array[1]);
		System.out.println( array[2]);
		
		
		str="WE #love# Java";
		String[] arr2=str.split("[#]");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
	}

}
