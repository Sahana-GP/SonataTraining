package com.sonata5;

public interface Machine {
	String speedUp();
	
	String slowDown();
	
	default String turnAlarmOn() {
		return "Alarm ON";
	}
	
	default String turnAlarmOff() {
		return "Alarm OFF";
	}
	
}
