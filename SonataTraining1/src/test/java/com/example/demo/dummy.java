package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sonata.two.Calculator;

class dummy {

	@Test
	void test() {
		fail("Not yet implemented");
	}
Calculator c1 = new Calculator();
	
	@Test
	public void addTest() {
		Assertions.assertEquals(4, c1.add(2, 2));
	}

	@Test
	public void divTest() {
		//int x = c1.div(1, 1);
		assertThrows(ArithmeticException.class,()->c1.div(1,0),"error");
	}
	
	@Test
	public void divTest1() {
		//int x = c1.div(1, 1);
		assertThrows(ArithmeticException.class,()->c1.div(1,1),"error");
	}
}
