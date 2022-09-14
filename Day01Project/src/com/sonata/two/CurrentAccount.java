package com.sonata.two;

public class CurrentAccount extends Bank{
	CurrentAccount(){}
	CurrentAccount(int a, String n, double b) {
		super(a, n, b);
	}
	CurrentAccount(int a, String s){}
	public static void main(String[] args) {
		CurrentAccount c1 = new CurrentAccount();
		c1.balance = 100;
		//c1.accName = "sahana";
		//c1.deposit(1233);

		//CurrentAccount c2 = new CurrentAccount();
		//c2.deposit(74125);
	}

}
