package com.sonata.two;

public class Bank {
	int accNo;
	String accName;
	double balance;
	Bank(int a, String n, double b){
		this.accNo = a;
		this.accName = n;
		this.balance = b;
	}
	
	public double deposit(double amount) {
		double totalBalance = balance + amount;
		System.out.println(totalBalance);
		return totalBalance;
		
	}
	
	public double withDraw(double amount) {
		double totalBalance = balance - amount;
		System.out.println(totalBalance);
		return totalBalance;
	}
	
	Bank(){}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
