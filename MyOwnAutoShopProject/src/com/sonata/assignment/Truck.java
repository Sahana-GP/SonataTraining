package com.sonata.assignment;

public class Truck extends Car {
	int weight;

	public Truck(int speed, double regularPrice, String colour, int weight) {
		super(speed, regularPrice, colour);
		this.weight = weight;
	}

	public double getSalePrice() {
		if (weight > 2000) {
			double discountPrice = super.regularPrice * 0.10; 
																
			return (super.regularPrice - discountPrice);

		} else {
			double discountPrice = super.regularPrice * 0.20; 
																
			return (super.regularPrice - discountPrice);
		}
	}
}
