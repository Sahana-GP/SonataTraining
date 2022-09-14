package com.sonata.synchronization;

public class SynchronizeExample {
	public static void main (String args[]) {
	ClassOne obj1 = new ClassOne();
	ClassTwo obj2 = new ClassTwo(obj1);
	ClassThree obj3 = new ClassThree(obj1);
	obj2.start();
	obj3.start();


}}
