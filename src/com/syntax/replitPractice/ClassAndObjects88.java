package com.syntax.replitPractice;

public class ClassAndObjects88 {
	String breed, name, color;

	void bark() {
		System.out.println("can bark");
	}

	void run() {
		System.out.println("can run");
	}

	void play() {
		System.out.println("can play");
	}

	public static void main(String[] args) {
		/*
		 * Create a Class Main
		 * 
		 * In this class, you should specify the following attributes:
		 * 
		 * breed, name, color.
		 * 
		 * and following behaviors: 
		 * 
		 * bark(), run(), play().
		 * 
		 * Create 3 different objects of it: 
		 * 
		 * Husky, Bulldog, Labrador 
		 * with specific attributes and behaviors.
		 * 
		 * The output of the program should be as following:
		 * 
		 * Husky can bark 
		 * Husky can run 
		 * Husky can play 
		 * Bulldog can bark 
		 * Bulldog can run
		 * Bulldog can play 
		 * Labrador can bark 
		 * Labrador can run 
		 * Labrador can play
		 */
		ClassAndObjects88 Husky = new ClassAndObjects88();
		Husky.breed = "Husky";

		System.out.print(Husky.breed + " ");
		Husky.bark();
		System.out.print(Husky.breed + " ");
		Husky.run();
		System.out.print(Husky.breed + " ");
		Husky.play();
		ClassAndObjects88 Bulldog = new ClassAndObjects88();
		Bulldog.breed = "Bulldog";
		System.out.print(Bulldog.breed + " ");
		Bulldog.bark();
		System.out.print(Bulldog.breed + " ");
		Bulldog.run();
		System.out.print(Bulldog.breed + " ");
		Bulldog.play();
		ClassAndObjects88 Labrador = new ClassAndObjects88();
		Labrador.breed = "Labrador";
		System.out.print(Labrador.breed + " ");
		Labrador.bark();
		System.out.print(Labrador.breed + " ");

		Labrador.run();
		System.out.print(Labrador.breed + " ");
		Labrador.play();

	}

}
