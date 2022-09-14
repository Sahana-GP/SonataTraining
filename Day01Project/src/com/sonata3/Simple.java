package com.sonata3;

public class Simple {
	
	private int add(int a, int b) {
		return a+b;
	}
	
	 int sub(int a, int b) {
		return a-b;
	}
	 
	 protected int mul(int a, int b) {
			return a*b;
		}

	 public int div(int a, int b) {
			return a/b;
		}
	 
	public static void main(String[] args) {
		Simple s1 = new Simple();
		System.out.println(s1.add(2,2));
		System.out.println(s1.sub(2,2));
		System.out.println(s1.mul(2,2));
		System.out.println(s1.div(2,2));

	}

}
