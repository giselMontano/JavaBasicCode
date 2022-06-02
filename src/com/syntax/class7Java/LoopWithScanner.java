package com.syntax.class7Java;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) 
	{
		/*
		 * we are going to ask you if you got a job we will continuously asking if you
		 * get a job till you say yes!
		 * 
		 * once you say yes -->CONGRATS
		 */

		Scanner scan = new Scanner(System.in);
		
		String job;
		do {
			System.out.println("Did you get a job?");
			job = scan.next();
			
		} while (!job.equalsIgnoreCase("yes"));// we need ! in order for JAVA to see a false statement and exit the loop
		System.out.println("Congrats");
		
		
		System.out.println("-----------------------------------------------------------");
		
		//WHILE LOOP
		Scanner input = new Scanner(System.in);
		
		String offer;
		
        System.out.println("Did you get a job");
        offer= input.next();
        
        
        while (!offer.equalsIgnoreCase("yes"))// we need ! in order for JAVA to see a false statement and exit the loop
		{
        	System.out.println("Did you get a job?");
        	offer = input.next();
		}
		System.out.println("Congrats");
		scan.close();
		input.close();

	}

}
