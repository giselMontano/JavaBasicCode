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
				} else if (hour > 10 && min <= 10) {
					time = hour + ":" + "0" + min;
				}else {
					time=hour+":"+min;
				}
				System.out.println(time);
			}
		}

	}
}
