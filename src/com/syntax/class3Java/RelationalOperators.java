package com.syntax.class3Java;

public class RelationalOperators {

	public static void main(String[] args) {
		// >, <, >=, <=, ==comparing, !=, =Assignment operation

		int num1 = 20;
		int num2 = 22;

		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 != num2);// not equal
		System.out.println(num1 == num2);
		System.out.println(num1 = num2);// it changed the value from num1 to num2
		System.out.println(num1 == num2);
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		boolean result = 100 > 200;// the result of these kind (>,<,>=,<=,==,!=) of values always "boolean"
		System.out.println(result);
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		int result1 = 100 + 200;// different because you are using (+,-,*,/,%)
		System.out.println(result1);
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		String result2 = "liza" + 10;// liza10, because concatenation
		System.out.println(result2);
		
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		int num3 = 10;
		int num4 = 11;
		result = num3 == num4;// if num3 equals to num4//result has been reassignment
		System.out.println(result);

		result = num3 != num4;// check num3 NOT equal to num4//equal has been reassignment// can not be converted because the main box "result" is different type boolean to int
		System.out.println(result);
		// check this something wring view review class
	}

}
