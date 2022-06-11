package com.syntax.class12JavaAdvance1;



public class DogPractice {
	//HOW TO CREATE REAL PROJECTS INSIDE PROGRAMMING 
	
	//Attributes/properties how the object will look like, INSIDE CLASS BUT NOT MAIN METHOD 
	String name;
	int age;
	double weight;
	String color;
	double height;
	String breed;
	
	
	// How the object behave
    void bark() {
		System.out.println("Dog barks");
	}

	void walk() {
		System.out.println("Dog walks");
	}

	void eat() {
		System.out.println("Dog like to eat bone");
	}
	void trick() {
		System.out.println("Dog fetch");
	}

public static void main(String[] args) {
		
		//Scanner scan=new Scanner(System.in);
	    //scan.next();
		
		
		DogPractice firulais = new DogPractice();//New dog() how we create an object and storing in a variable
		
		firulais.name="firulais";
		firulais.age=6;
		firulais.weight=16;
		firulais.color="Brown";
		firulais.height=2.6;
		firulais.breed="Greman Sheperd";
		
		System.out.println(firulais.breed);
		firulais.bark();	
		
		DogPractice husky=new DogPractice();
		husky.name="taquito";
		husky.age=1;
		husky.weight=20;
		husky.color="white";
		husky.height=1.7;
		husky.breed="husky";
		
		System.out.println(husky.breed);
		husky.bark();
		husky.trick();

	}

}
