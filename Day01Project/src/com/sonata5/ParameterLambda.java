package com.sonata5;

public class ParameterLambda {
	

	public static void main(String[] args) {
		CalTor c2 = (i1,i2) -> {return i1 - i2;};
		CalTor c3 = (i1,i2) -> {
			if(i2<i1) {
				throw new RuntimeException("messsage");}
			else {return i2 - i1;}
			};
			
			System.out.println(c2.subtract(20, 10));
			System.out.println(c3.subtract(20, 10));
			
			MyFunctionalInterface mf1 = () -> { System.out.println("hi");};
			//System.out.println(mf1.text());
			
			
			
		}
		
	}


