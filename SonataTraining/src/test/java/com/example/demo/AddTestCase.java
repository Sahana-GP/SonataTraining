package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTestCase {

	@Test
	void addTest1() {
		AddInterface add = new DefaultAddition();
		assertEquals(20, add.add(10, 10));
	}
	
	@Test
	void addTest2() {
		AddInterface add = new DefaultAddition();
		assertEquals(0, add.add(1, -1));
	}
	
	@Test
	void addTest3() {
		AddInterface add = new DefaultAddition();
		assertEquals(1, add.add(2, -1));
	}
	
	@Test
	void addTest4() {
		AddInterface add = new DefaultAddition();
		assertEquals(10, add.add(5, 5));
	}

}
