package com.syntax.class14JavaAdvance;

import java.util.Scanner;

public class MethodsDemo {
	// What is a method? Method is a block of code a group of java statements that
	// are grouped together and
	// we can execute those statements by just creating an object of the class that
	// contains
	// how? that methods and by writing/calling the objects name .method(); 
	
	
	
	//METHOD THAT RETURNS SOMETHING AND METHODS THAT DO NOT RETURN SOMETHING 
	void printHello() {//OBJECT CREATED no written we create 
		System.out.println("How are you guys");
	}
    boolean returnTrue() {
    	return true;//when not using void you must use return keyword
    }
    int returnInt(){
    	return 10;
    }
	public static void main(String[] args) {
		MethodsDemo create = new MethodsDemo();//OBJECT OF THE CLASS MethodsDemo-->name of the class
		create.printHello();// CALLING THE OBJECT NAME-->create// in this case ,this how you call a method

		boolean xs=create.returnTrue();
		System.out.println(xs);
		
		int num=create.returnInt();
		System.out.println(num);//USING A VARIBALE TO STORE
		System.out.println(create.returnInt());//NOT USING THE VARIABLE 
		
		
		Scanner scan = new Scanner(System.in);
	    int x= scan.nextInt();//this takes input and store
	    System.out.println(x);
	    scan.close();
	}

}
