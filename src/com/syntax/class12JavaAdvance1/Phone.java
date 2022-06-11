package com.syntax.class12JavaAdvance1;

public class Phone {
	/*
	 * Create a class "Phone" create 3 objects of it: iphone, Pixel, Samsung with
	 * specific attributes and behaviors
	 */
	String type;
	int storage;
	String color;

	void powerButton() {
		System.out.println("phone turns on or off");
	}

	void swipeUp() {
		System.out.println("shows you the applications opened");
	}

	void volumeButton() {
		System.out.println("turns the volume up and down");
	}

	public static void main(String[] args) {

		Phone iPhone = new Phone();
		iPhone.type = "iPhone";
		iPhone.storage = 128;
		iPhone.color = "rose gold";
		System.out.print("When the power button is pushed ");
		iPhone.powerButton();

		Phone Pixel = new Phone();
		Pixel.type = "pixel";
		Pixel.storage = 256;
		Pixel.color = "blue";
		System.out.println("My " + Pixel.type + " phone's storage space is " + Pixel.storage);

		Phone samsung = new Phone();
		samsung.type = "samsung";
		samsung.storage = 512;
		samsung.color = "white";
		System.out.print("The volume buttons on my " + samsung.type + " ");
		samsung.volumeButton();

	}

}