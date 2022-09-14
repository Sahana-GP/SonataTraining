package com.sonata.two;

public class SavingsAccount {
	int accNo;
	String accName;
	double balance;
	
	SavingsAccount(){}
	SavingsAccount(int n, String name, double b){
		this.accNo = n;
		this.accName = name;
		this.balance = b;
	}
	
	public void deposit() {
		System.out.println(this.accNo);
	}
	
	public void withDraw() {}
	

	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount();
		s1.accNo = 123;
		s1.accName = "Sahana";
		s1.balance = 15000;
		s1.deposit();
		
		SavingsAccount s2 = new SavingsAccount(456, "Ram", 1234);
		s2.deposit();
	}

}
