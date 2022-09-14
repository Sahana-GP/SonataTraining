package com.sonata5;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest {

	
	@Test
	public void testAdd() {
		ArrayListdemo arrObj1 = new ArrayListdemo();
		arrObj1.add(1);
		arrObj1.add(2);
		arrObj1.add(3);
		arrObj1.add(4);
		arrObj1.add(5);
		arrObj1.add(6);
		arrObj1.add(7);
		
		int size = arrObj1.getSize();
		System.out.println(size);
		assertEquals(6,size);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
