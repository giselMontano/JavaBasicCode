package com.syntax.class6Java;

public class SwitchIntro {

	public static void main(String[] args) {
		// 
		int day = 7;

		if (day == 1) {
			System.out.println("Monday}");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("sunday");
		}
		

		System.out.println("---------------------------------------------------------------------------------------------------");
		
		// ENHANCED
		int day1 = 6;
		String name;
		
		if(day ==1) {
			name = "Monday";
		} else if (day1 == 2) {
			name = "Tuesday";
		} else if (day1 == 3) {
			name = "Wednesday";
		} else if (day1 == 4) {
			name = "Thursday";
		} else if (day1 == 5) {
			name = "Friday";
		} else if (day1 == 6) {
			name = "Saturday";
		} else if (day1 == 7) {
			name = "sunday";
		}else {
			name= "Invalid";
		}
		System.out.println(name);
		
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		//SWITCH
		int day2= 4;//this is int type
		String name2;
		
		switch(day2) {
		case 1://Has to be int type
			name2 = "Monday";
			break;
		case 2:
			name2 = "Tuesday";
			break;
		case 3:
			name2 = "Wednesday";
			break;
		case 4:
			name2 = "Thursday";
			break;
		case 5:
			name2 = "Friday";
			break;
		case 6:
			name2 = "Saturday";
			break;
		case 7:
			name2 = "Sunday";
			break;
		default:
			name2 = "Invalid";
			break;	
		}
		System.out.println(name2);
	} 

}
