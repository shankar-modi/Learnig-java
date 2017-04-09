package com.sk.learn.concurrency;

/**
 * Creating thread using Runnable interface.
 * 
 * @author Shankar Modi
 *
 */

public class App2 {

	public static void main(String[] args) {
		
		Task task = new Task();
		
		Thread t = new Thread(task);
		t.setName("RunnableThread");
		
		t.start();
		
	}
}

class Task implements Runnable {

	public void run() {
		System.out.println("First Thread Program with Runnable, with thread name " + Thread.currentThread().getName());
	}
}
