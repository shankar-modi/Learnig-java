package com.sk.learn.arrays;

/**
 * 
 * @author Shankar Modi
 *
 */

public class ArrayApp1 {

	public static void main(String[] args) {
		int [] x = new int[2];
		int [] y = x;
		/*
		 * both references x & y pointing to same array object.
		 */
		x[0] = 10;
		x[1] = 20;
		
		System.out.println("Y[0] " + y[0] );

		//upcasting y to Object
		Object obj = y;
		System.out.println(obj);
		//obj is not an array so below line will give CE
		//System.out.println(obj[0]);
		
		//now down casting obj to int array and assiging to ref variable z
		int [] z = (int[]) obj;
		System.out.println("Z[0] "+z[0]);
		
		//double [] obj1 = x;  // CE
		//integer [] obj1 = x;  // CE
		
	}
}
