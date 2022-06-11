package com.syntax.class12JavaAdvance1;

public class StringDemo3Comands {

	public static void main(String[] args) {
		
String hola="Batch 13 is Great";
System.out.println(hola.startsWith("Frozen"));//FALSE ; To find first letter or word from "hola"

System.out.println(hola.endsWith("t"));//TRUE; to find the last letter or word from "hola"
System.out.println(hola.endsWith("Great"));//TRUE 
System.out.println(hola.endsWith("great"));//FALSE; CASE SENSITIVE 
System.out.println("-------------------------------------------------------");
System.out.println(hola.toLowerCase().endsWith("great"));//TRUE ; to change everything into lower case
System.out.println(hola.contains("13"));//TRUE
System.out.println(hola.contains("is"));//TRUE
System.out.println("-------------------------------------------------------");
System.out.println(hola.toLowerCase().contains("batch"));//TRUE

System.out.println("---------------------------------------");
String name="HAMID";
System.out.println(name.toLowerCase());//hamid; changes into lower case 
System.out.println(name);//HAMID

System.out.println("----------------------------------------");
String hi="13";//just a keyword to look for that specific character 
System.out.println(hola.contains(hi));
System.out.println(hola.contains("is"));
System.out.println(hola.toLowerCase().contains("batch"));




	}

}
