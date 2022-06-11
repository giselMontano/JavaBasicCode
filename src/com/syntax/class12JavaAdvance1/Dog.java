package com.syntax.class12JavaAdvance1;

public class Dog {
	String breed;
	String color;
	int age;

	void happyDog() {
		System.out.println("tail wags");
	}

	void sadDog() {
		System.out.println("whimper");
	}

	void guardDog() {
		System.out.println("bark");
	}

	public static void main(String[] args) {
		Dog husky = new Dog();
		husky.breed = "husky";
		husky.color = "white";
		husky.age = 2;
		System.out.print("My dog is " + husky.age + " years old and when he is happy his ");
		husky.happyDog();

		Dog bulldog = new Dog();
		bulldog.breed = "bulldog";
		bulldog.color = "brown";
		bulldog.age = 5;
		System.out.print("My " + bulldog.breed + " loves to ");
		bulldog.guardDog();

		Dog labrador = new Dog();
		labrador.breed = "labrador";
		labrador.color = "tan";
		labrador.age = 3;
		System.out.print("My " + labrador.breed + " hates when I have to leave him at home and will ");
		labrador.sadDog();

	}

}
