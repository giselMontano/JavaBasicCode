package com.syntax.class12JavaAdvance1;

public class StringDemo {

	public static void main(String[] args) {
		
		String name= new String("Ale");//PROPER WAY TO CREATE AN OBJECT FOR A CLASS
		 
		String name2="Ale";//shortcut same as String name= new String("Ale");
		
		//ALL THE CLASSES IN JAVA CAN BE TREATED AS DATATYPE
		//if a class is present inside the same package or if a class belong to java.lan package
		
		
		name.length();//method () when the parenthesis are present at the end of the method 
		
name2="Zameer";
System.out.println(name2.length());//count every letter from name2; Zammer-->6 if you have space it count too

String name3="Oleg";
System.out.println(name3.length());//4 Characters/ letters 

String capitan="LILIA";
System.out.println(capitan.toLowerCase());//convert into lower case 
capitan="I love java";
System.out.println(capitan.toUpperCase());//convert into upper case


	}

}
