package com.sonata5;

public interface MyFunctionalInterface {
	
	void text();
	
	default void m2() { System.out.println("Default method 1");}
	static void m3() { System.out.println("Default method 2");}

}
