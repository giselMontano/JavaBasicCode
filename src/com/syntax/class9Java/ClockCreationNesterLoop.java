 package com.syntax.class9Java;

public class ClockCreationNesterLoop {

	public static void main(String[] args) {
		// USING NESTED LOOP, CREATR A 24 HOUR CLOCK THAT WILL DISPLAY 2 DIGITS FOR AN HOUR AND 2 DIGITS FOR A NIMUTE
		for (int hour = 0; hour < 24; hour++) {
			for (int min = 0; min < 60; min++) {
				
				String time;
				
				if (hour < 10 && min < 10) {
					time = "0" + hour + ":" + "0" + min;
				} else if (hour < 10 && min >= 10) {
					time = "0" + hour + ":" + min;
				} else if (hour >= 10 && min < 10) {
					time = hour + ":" + "0" + min;
				}else {
					time=hour+":"+min;
				}
				System.out.println(time);
			}
		}
		
		//ANOTHER WAY
	System.out.println("-----------------------------------------------------");
		
		for (int hour1Digit = 0; hour1Digit <= 2; hour1Digit++) {// holds the first digit of the hour
			for (int hour2Digit = 0; hour2Digit <= 9; hour2Digit++) {// holds second digit of hour

				if (hour1Digit == 2 && hour2Digit == 4) {// hour just have 24 hours therefore as soon as code reach this
															// point breaks
					break;
				}
				for (int min1Digit = 0; min1Digit <= 5; min1Digit++) {// holds first digit of minutes 5 limit because it goes to 59 before getting to 00
					for (int min2Digit = 0; min2Digit <= 9; min2Digit++) {// holds second digit of minutes
						System.out.println(hour1Digit + "" + hour2Digit + ":" + min1Digit + min2Digit);
					}
				}
			} 

		}
		//ANOTHER EASIER WAY
		
		System.out.println("------------------------------------------------------");
		for (int hour1 = 0; hour1 < 24; hour1++) {

			for (int min1 = 0; min1 <= 5; min1++) {
				for (int min2 = 0; min2 <= 9; min2++) {
					if (hour1 < 10) {
						System.out.println("0" + hour1 + ":" + min1 + min2);
					} else {
						System.out.println(hour1 + ":" + min1 + min2);
					}
				}
			}
		}

	}
}