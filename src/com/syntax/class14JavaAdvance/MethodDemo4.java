package com.syntax.class14JavaAdvance;

public class MethodDemo4 {
	//IT IS POSIBLE TO PUT MORE THAN ONE VARIABLE INSIDE ()
	int sumNumbers(int num1,int num2) {
		return num1+num2;
}
	//WRITE A METHOD THAT TAKES A STRING AND AN INT AND PRINT OUT THAT STRING ON THE CONSOLE 
	//THAT MANY TIMES THAT VALUE THAT WE  CAN IN INT
	void printManyTimes(String str, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		
		MethodDemo4 create =new MethodDemo4();
		System.out.println(create.sumNumbers(5, 7));
		
		System.out.println("--------------------");
		
		create.printManyTimes("hello", 7);//TRING YOU ENTER IT WILL BE REPEATED AS MANY TIMES AS YOU SPECIFY 
	}

}
