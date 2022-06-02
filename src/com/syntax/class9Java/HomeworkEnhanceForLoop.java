package com.syntax.class9Java;

public class HomeworkEnhanceForLoop {

	public static void main(String[] args) {
// Create an array of cars and store 6 elements into it. Using 2 different loops
// PRINT ALL values from the array.

		String[] car = { "Lamborghini", "Bugatti", "Ferrari", "Audi", "Toyota", "Hunday" };
		for (int total = 0; total < car.length; total++) {
			System.out.print(car[total] + " ");
		}
		
System.out.println();
		
		//ENHANCE WAY

		String[] cars = { "Lamborghini", "Bugatti", "Ferrari", "Audi", "Toyota", "Hunday" };
		for (String sum : cars) {
			System.out.print(sum + " ");
		}
		
		
System.out.println();


//Create an array of animals and store 5 elements into it. Using 2 different loops PRINT ALL elements from the array.
		
		String[] animals= {"dog","cat","goose","panda","deer"};
		for(int total = 0; total < animals.length; total++) {
			System.out.print(animals[total]+" ");
		}
		
System.out.println();		

		//ENHANCE WAY
		
		String[] animal= {"dog","cat","goose","panda","deer"};
		for(String sum : animal) {
			System.out.print(sum+ " ");
		}
		
System.out.println();

//Create an array to store double values and then PRINT ALL elements using 2 different loops 
		
		double[] price = { 9.99, 10.56, 45, 67 };
		for (int total = 0; total < price.length; total++) {
			System.out.print(price[total]+ " ");
		}
		
System.out.println();

       // ENHANCE WAY
       double[] money = { 9.99, 10.56, 45, 67 };
       for (double total: money) {
	   System.out.print(total + " ");
       }
       
System.out.println();

//1.  Create an array on integers and calculate the SUM OF ALL ELEMENTS in an array
       int[] num = { 1, 2, 3, 4, 5, 6, 7 };
       int sum = 0;
       for (int i = 0; i < num.length; i++) 
       {
	    sum += num[i];
       }
       System.out.println("Sum of all elements"+sum);
       
System.out.println();

       // ENHANCE WAY
		int sum1 = 0;
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
		for (int total1 : numbers) {
			sum1 += total1;

		}
		System.out.println("Sum of all elements" + sum1);

	}

}
