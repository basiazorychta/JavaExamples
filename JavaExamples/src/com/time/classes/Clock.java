package com.time.classes;

public class Clock {

	private int hours;
	private int minutes;
	private int seconds;

	Clock(int hr, int min, int sec) {

		hours = hr;
		minutes = min;
		seconds = sec;

	}

	Clock() {

		hours = 0;
		minutes = 0;
		seconds = 0;

	}

	public int getHours() {
		return hours;
	}

	/*
	 * public void setHours(int hours) { this.hours = hours; }
	 */
	
	public int getMinutes() {
		return minutes;
	}

	/*
	 * public void setMinutes(int minutes) { this.minutes = minutes; }
	 */
	
	public int getSeconds() {
		return seconds;
	}

	/*
	 * public void setSeconds(int seconds) { this.seconds = seconds; }
	 */
	
	public void setTime(int hr, int min, int sec) {

		hours = hr;
		minutes = min;
		seconds = sec;

	}
	
	public void incrementHours () {
		hours ++;
	}
	
	public void incrementMinutes () {
		minutes += 1;
	}
	
	public void incrementSeconds () {
		seconds = seconds + 1;
	}
	
	public boolean equals (Clock c1) {
		
		if (c1.hours == hours && c1.minutes == minutes && c1.seconds == seconds) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public String toString () {
		
		String setTime = hours + ":" + minutes + ":" + seconds;

		return setTime;
	}

	public String info() {

		String setTime = "Time is: " + hours + " hr :" + minutes + " min : " + seconds + " sec";

		return setTime;
	}
}
