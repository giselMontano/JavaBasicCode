package com.syntax.class13JavaAdnvance2;

public class HomeWorkStringDemo2 {

	public static void main(String[] args) {
		/*
		 * Create a String that will hold a sentence. 
		 * 
		 * Write a program to get a new String without any spaces. 
		 */
		
		String str="Olegs building is on fire";
		System.out.println(str.replace(" ", ""));
		
		
System.out.println("------------------------------------------");
		 /* Create a String that should be combination of letters, numbers and special characters. 
		 * Find out how many Alphanumeric characters are there in the String. 
		 */
		//IS POSSIBLE TO CONVINE TWO OF STRING METHOD 
		
		String str1="aasfdghf!@#";
		System.out.println(str1.replaceAll("[^A-Za-z0-9]","").length());
		
System.out.println("-------------------------------------------");
		 /* You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today? I love Java. we are learning!” 
		 * 
		 * How would you find out how many
		 * sentences are in that String?
		 */
		//FINDING CUT POINT WITH SPLIT AND CHECKS LENGTH
		String a= "Is it saturday? Is it raining? Do we have a Java Class today? I love Java. we are learning!";
		System.out.println(a.split("[?.!]").length);
		
System.out.println("--------------------------------------------");		
		/*
		 * How would you reverse a String word by word? for example 
		 * // input=>This is sentence i want to reverse 
		 * // output=>sihT si ecnetnes i tnaw ot esrever
		 */
          //REVERSE EVERITHING WITHOUT CHANGING THE POSITION 
         String str3="This is sentence i want to reverse";
        	String[] arr=str3.split(" ");//{THIS} BECOME FIRST ARRAY THEN {IS} SECOND {SENTENCE} THIRD AND SO ON SPACE IS THE CUT POINT
        	for(String s:arr) {
        		System.out.print(new StringBuilder(s).reverse()+" ");
        	}
        	System.out.println();
 System.out.println("--------------------------------------------");
		/* How would you check if String is palindrome or not? 
		 * aba=> true Abbc =>false//PALINDROME MENAS THAT IN REVERSE DOES NOT CHANGE THE MEANING LIKE--> ABA 
		 */
		
	
		String original = "mom";
		String reverse ="";
		
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse += original.charAt(i);}
			
			if (original.equals(reverse)) {
				System.out.println("It is a palidrome");
			}else {
				
				System.out.println("It is not palimore");
			}
		
		
System.out.println("--------------------------------------------");
		 /* How would you swap 2 strings without a temporary variable?
		 */
		String z= "Hello";
		String x = "hola";
		System.out.println(z.replace(z, x));
		System.out.println(z.replace(x, z));


		
	}
}
