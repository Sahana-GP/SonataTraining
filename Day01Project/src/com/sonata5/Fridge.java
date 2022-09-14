package com.sonata5;

public class Fridge implements Machine{

	private String brand1;
	

	public String getBrand1() {
		return brand1;
	}

	public void setBrand1(String brand1) {
		this.brand1 = brand1;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "cools fast";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "if it is not ON the work will slow down";
	}

	public static void main(String[] args) {
		Fridge f1 = new Fridge();
		System.out.println(f1.turnAlarmOn());
		System.out.println(f1.turnAlarmOff());
	}
	
}
