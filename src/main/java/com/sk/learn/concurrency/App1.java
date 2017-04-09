package com.sk.learn.concurrency;

/**
 * Creating thread using Thread class.
 * 
 * @author Shankar Modi
 *
 */

public class App1 {

	public static void main(String[] args) {

		A a = new A();
		a.setName("My Thread");
		a.start();
	}
}

class A extends Thread {

	@Override
	public void run() {
		System.out.println("First Thread Program , with thread name " + Thread.currentThread().getName());
	}
}
