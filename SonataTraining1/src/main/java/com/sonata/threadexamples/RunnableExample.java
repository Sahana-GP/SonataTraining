package com.sonata.threadexamples;

public class RunnableExample implements Runnable {

	
	
	//@Override
	public void run() {
		try {
			System.out.println("Thread "+ Thread.currentThread().getId()+" is running");
		}catch(Exception e) {System.out.println(e);}
		
	}
	
	public static void main(String[] args) {
		RunnableExample r1 = new RunnableExample();
		Thread t1 = new Thread(r1);
		t1.start();
		t1.setName("first");
		System.out.println(t1.getName());

	}

}
