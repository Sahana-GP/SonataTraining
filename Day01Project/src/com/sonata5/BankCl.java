package com.sonata5;

public class BankCl {

	public static void main(String[] args) {
		BankIntf b1 = (i1,i2) -> {return i1 + i2;};
		BankIntf b2 = (i1,i2) -> {if((i1 + i2)>50) {
			return i1+i2+1;
		}
		else {return i1+i2-1;}
		};
		
		System.out.println(b1.add(45, 6));
		System.out.println(b2.add(45, 5));
		System.out.println(b2.add(40, 6));
	}
}
