package com.sonata.threadexamples;

class Hi extends Thread{
	public void run() {
		try {
			for(int i=1; i<5; i++){
				System.out.println("Hi");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {System.out.println(e);}}
	}


class Hello extends Thread{
	public void run() {
		try {
			for(int i=1; i<5; i++){
				System.out.println("Hello");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {System.out.println(e);}}
	}

public class ThreadTest {

	public static void main(String[] args) throws Exception{
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		obj1.start();
		obj2.start();

	}

}
