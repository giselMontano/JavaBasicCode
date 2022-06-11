package com.syntax.class13JavaAdnvance2;

public class StringDemo1 {

	public static void main(String[] args) {
		
		//REPLACING WORDS AND LETTERS
		String str="Batch13 is good actually very good";
		System.out.println(str.replace("good", "GREAT"));
		System.out.println(str.replace("g", "G"));
		
		
		System.out.println("------------------------------------");
		//REPLACING JUST THE FIRST ONE
		System.out.println(str.replaceFirst("g", "G"));
		
		
		System.out.println("-------------------------------------");
		//FINDING GENERIC VARIABLES, PATHERNS AND CHANGE THEM ALL
		
		str="hgvhchFHGFHgcbjkjhlkjkljJFDGFDDhkhj12///[]3335kh#@$#@$#@$#";
		System.out.println(str.replaceAll("[0-9]", "#"));//replaced numbers from 0-9 into #
		System.out.println(str.replaceAll("[a-z]", "#"));//replaced lower cases into #
		System.out.println(str.replaceAll("[A-Z]", "#"));//replaced upper cases into #
		System.out.println(str.replaceAll("[A-Za-z]", "#"));//replaced upper and lower cases into #
		System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));//replaces upper, lower case and numbers into #
		
		System.out.println("--------------------------------------");
		//REPLACE EVERYTHING EXCEPT SOMETHING INSIDE[]
		System.out.println(str.replaceAll("[^a-z]", "#"));//this is use as not 
		System.out.println(str.replaceAll("[^0-9]", "#"));
		System.out.println(str.replaceAll("[^A-Z]", "#"));
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "#"));
		
		System.out.println("---------------------------------------");
		//THIS IS ALSO POSSIBLE BECAUSE AFTER UPPER CASES BEHIND SCENES IT COMES LOWER CASES
		System.out.println(str.replaceAll("[^A-z]", "#"));
		
		System.out.println("----------------------------------------");
		//REPLACING FROM A RANGE OF NUMBERS 
		System.out.println(str.replaceAll("[a-f]", "#"));
		
		System.out.println("-----------------------------------------");
		//REMOVING 
		System.out.println(str.replaceAll("[^A-Za-z0-9]",""));//REMOVING ALL THE SPECIAL CHARACTERS WITH "" EMPTY		
	}

}
