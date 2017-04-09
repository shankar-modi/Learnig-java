package com.sk.learn.exceptions;

/**
 * 
 * @author Shankar Modi
 *
 */

public class Exception1 {

	public static void main(String[] args) {

		test(12, 0);
	}
	
	

	public static void test(int num1, int num2) {

		if (num2 == 0) {
			throw new DevideByZeroException("Number should not be zero");
		}

		System.out.println(num1 / num2);
	}
}
