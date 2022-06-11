package com.syntax.class12JavaAdvance1;

public class StringDemo2 {

	public static void main(String[] args) {
		
		
		String firstName="Adem";
		String lastName="Jones";
		String fullName=firstName+lastName;//always prefer this one 
		System.out.println(fullName);
		
		
		String fullName2=firstName.concat(lastName);// never use this because it can lead you to null pointer exception
		System.out.println(fullName2);
		
		String name="";
		System.out.println(name.isEmpty());//true; tells you if there is something is present inside "name" or not, even if you have a space will tell you that is something inside 
		//System.out.println(name.isBlank());-->this checks if there is blank spaces, only works on latest version of java like 11 and up

		String cut=" never ";//.trim(); remove spaces before and after NOT IN THE MIDDLE
		System.out.println(cut.trim());//never; no spaces even though I have spaces above
	}

}
