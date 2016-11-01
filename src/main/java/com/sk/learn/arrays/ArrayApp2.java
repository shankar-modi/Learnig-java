package com.sk.learn.arrays;

import java.util.Arrays;

/**
 * 
 * @author Shankar Modi
 *
 *Using Arrays.sort()
 */
public class ArrayApp2 {

	public static void main(String[] args) {
		//bnelow both declaration and initialization are legal
		//int [] x = new int []{10,2,7,1,40,50};
		int [] x = {10,2,7,1,40,50};
		System.out.println(Arrays.toString(x));
		
		//This will sort array in natural order
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}
