package com.sonata4;

public class CallCustomException {

	public static void main(String[] args) throws MyOwnException{
		int age = 2;
		if(age<18) {
			throw new MyOwnException("Age is less than 18");
		}
		else {
				System.out.println("Welcome to Vote");
			}
	}
}
