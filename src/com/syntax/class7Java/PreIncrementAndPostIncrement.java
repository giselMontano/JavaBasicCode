package com.syntax.class7Java;

public class PreIncrementAndPostIncrement {

	public static void main(String[] args) {
		
		
		
		//POST INCREMENT
		int num = 10;
		//FIRST USE THEN INCREMENT
		int result = num++;//ONLY NUM IS USE OR EXECUTED BEFORE THE INCREMENT IS ADD TO RESULT AND EXCECUTED 
		
		
		System.out.println("Value of num = " + num);//11
		System.out.println("Value of result = " + result);//10
		
		
        //PRE INCREMENT
		//FIRST INCREMENT THEN USE 
		int num1 = 10;
        
		int result1 = ++num1;//HERE GOT INCREMENT AND ADD TO THE RESULT BEFORE IS EXCECUTED OR USE
		
		System.out.println("Value of num1 = " + num1);//11
		System.out.println("Value of result1 = " + result1);//11

	}

}
