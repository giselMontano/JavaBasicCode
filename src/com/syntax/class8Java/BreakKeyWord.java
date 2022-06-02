package com.syntax.class8Java;

public class BreakKeyWord {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Hello ");
		}
		
		
		
		
System.out.println();
		// INFINITE LOOP UNTILL WE ADD BREAK
		boolean summer = true;
		while (summer) {
			System.out.print("It is hot");
			break;
		}
		
		
		
System.out.println();
		// example of using BREAK
		for (int i = 1; i <= 5; i++) {
			System.out.print("Hello ");
			if (i == 3) {
				break;
			}
		}
		
		
		
System.out.println();

          // Another example
          boolean summer1 = true;
          int temp = 95;
          
          while (summer1)
        	  
          {System.out.print("It is hot ");
          
	      if (temp < 70) {
		        System.out.println("It is not hot anymore");
		  break;
	         }
	      temp-=10;//THIS IS DICREASIMG THE TEMPERATURE
          
	    		  
	      
          }
	} 
}