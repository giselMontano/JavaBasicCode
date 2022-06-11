package com.syntax.class8Java;

public class ContinueKeyWord {

	public static void main(String[] args) {
		// CONTINUE KEYWORD
		// SKIPS CURRENT EXECUTIO/ITERATION AND GO BACK TO THE BEGINNING
		//IN ORDER TO USE CONTINUE YOU MUST HAVE A CONDITON 
		
		for (int i = 1; i <= 5; i++) {
			if (i == 2) {
				continue;
			}
			System.out.print(i + " ");// 1 3 4 5 //DOES NOT SHOW 2 BECAUSE OF THE IF CONDITION
			
		}

		//print numbers from 1 to 10 except number 5 and 7
		for(int i=1; i<=10; i++) {
			if(i==5 || i==7) {
				continue;
			}
		System.out.print(i+" ");
		}
	}

}
