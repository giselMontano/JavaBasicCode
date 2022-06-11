package com.syntax.class9Java;

public class ArrayExamples {

	public static void main(String[] args) {
		// I want to store prices in array 
		
		double[] price=new double[4];
		
		price[1]=1.99;
		price[2]=2.99;
		price[3]=3.99;
		
		System.out.println(price[0]);//0.0 this is by default when you don't store anything in "0"

		//[]CAN ALSO BE PLACED AFTER VARIABLE NAME
		int numbers[]=new int[3];//[3] ONLY FOR 3 ELEMENTS INDEX GO UP TO 2-->0,1,2 AND STORED 4 ELEMENTS (0,1,2,3,)//THERE IS NO SPACE
		numbers[0]=10;
		numbers[1]=11;
		numbers[2]=12;
		numbers[3]=13;//INDEX OUT OF BOUND,//ERROR->java.lang.ArrayIndexOutOfBoundsException: 3
		
		System.out.println(numbers[3]);
		
		
		//ARRAY ARE FIXED IN SIZE FROM[3] TO[4]
		//DURING RUNTIME JAVA CANNOT INCREASE OR DECREASE A SIZE OF AN ARRAY[]
	}
	 

}
