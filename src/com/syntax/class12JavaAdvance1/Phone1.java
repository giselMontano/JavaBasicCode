package com.syntax.class12JavaAdvance1;

public class Phone1 {
	
	String model;
	String make;
	double screenSize;
	int RAM;
	int ROM;
	int storage;
	int camera;
	
	void call() {
		System.out.println("calling someone");
		
	}
	void takePicture(){	
		System.out.println("use my camera app to take pictures");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone1 iphone=new Phone1();
		iphone.make="apple";
		iphone.model="13";
		iphone.screenSize=6.8;
		iphone.RAM=12;
		iphone.camera=108;
		iphone.storage=512;
		System.out.println(iphone.storage);
		iphone.call();
		
		
	}

}
