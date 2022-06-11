package com.syntax.class12JavaAdvance1;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "kat";
		String name2 = "kat";
		System.out.println(name.equals(name2));// TRUE
		name2 = "KAT";
		System.out.println(name.equalsIgnoreCase(name2));// TRUE

		
	}
}