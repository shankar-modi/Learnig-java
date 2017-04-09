package com.sk.learn.basics;

/**
 * 
 * @author Shankar Modi
 *
 */

public class Increment{
	
	
	static int j;
	
	public Increment() {
		j = 2;
	}
	
	
	public static void main(String[] args) {
		int i = 0;
		i = i++;
		System.out.println(i);
		System.out.println(j);
		
		Increment inc = new Increment();
		
		System.out.println(j);
	}


}
