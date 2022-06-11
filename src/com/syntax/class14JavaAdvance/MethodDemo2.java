package com.syntax.class14JavaAdvance;

public class MethodDemo2 {
//WRITE A MOTHOD WHEN CALLED IT, IT SHOULD PRINT 5 TIMES "Tara is great"
	//void means nothing is written and we write the statement 
	void print() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Tara is great");
		}
	}
	void printManyTimes(int times) {//THIS TIMES WILL BE TAKEN WHEN YOU ARE CALLING IT DOWN BELLOW
		for (int i = 0; i < times; i++) {
			System.out.println("Tara is great");
		}
	}
	
	public static void main(String[] args) {
		
		MethodDemo2 create = new MethodDemo2();
		create.print();
		
		System.out.println("-----------------------------------");
		
		create.printManyTimes(2);//CALLING HOW MANY TIMES 2 CAN BE ANY NUMBERS 
	}

}
