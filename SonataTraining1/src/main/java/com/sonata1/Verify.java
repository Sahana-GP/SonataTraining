package com.sonata1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class Verify {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
		  System.out.println(i);
		  i++;
		  if (i == 4) {
		    break;
		  }
		}
	}
	
	
	public void testing() {
		int target = -5;
		int num = 3;

		target = -num;  
		target += num; // Noncompliant; target = 3
}
	
public void test2() {
	AtomicInteger aInt1 = new AtomicInteger(0);
	AtomicInteger aInt2 = new AtomicInteger(0);

	if (aInt1.get() == aInt2.get()) {System.out.println("if");}
}

public void test3() {
	AtomicInteger aInt1 = new AtomicInteger(0);
	AtomicInteger aInt2 = new AtomicInteger(0);

	if (aInt1.get() == aInt2.get()) {System.out.println("if");}// Noncompliant
	// Noncompliant
	// Noncompliant
	// Noncompliant
	// Noncompliant
	// Noncompliant
}



	public void  doSomethingWithFile(String fileName) {
		String speech = "Now is the time for all good people to come to the aid of their country.";

		String substr1 = speech; // Closest correct values to original code yield whole string
		String substr2 = new StringBuilder(speech).reverse().toString();
		char ch = speech.charAt(speech.length()-1);
}

}