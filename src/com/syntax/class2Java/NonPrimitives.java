package com.syntax.class2Java;

public class NonPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Oleg";
		String lastName = "Smith";
		long phone = 123456789;

		System.out.println(phone);

		String phoneNumber = "123-456-7890";
		System.out.println(phoneNumber);
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		String adress = "123 Washington str";
		System.out.println(adress);
		int age = 10;
		String city = "Miami";

		System.out.println(name + lastName);
		System.out.println(name + " " + lastName);
		System.out.println(name + " lives in " + city);
		System.out.println(name + " is " + age + " years old ");

	}

}
