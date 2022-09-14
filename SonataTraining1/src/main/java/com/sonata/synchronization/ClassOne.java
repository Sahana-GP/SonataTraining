package com.sonata.synchronization;

public class ClassOne extends Thread{
	
	public synchronized void print(int n) {
		for (int i=1; i<5; i++) {
			System.out.println(n*i);
		try {Thread.sleep(500);	
		}catch(Exception e) {System.out.println(e);
	}

}}}
