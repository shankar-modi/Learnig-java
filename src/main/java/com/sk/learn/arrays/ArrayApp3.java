package com.sk.learn.arrays;

import java.util.Arrays;

/**
 * 
 * @author Shankar Modi
 *Array sorting using comprable
 */

class A implements Comparable<A>{
	int i ;
	A (int i){
		this.i = i;
	}
	
	public int compareTo(A o) {
		return this.i - o.i;
	}
	
	@Override
	public String toString() {
		return "i = "+this.i;
	}
}
public class ArrayApp3 {

	public static void main(String[] args) {
		A[] arr = new A[4];
		arr[0] = new A(30);
		arr[1] = new A(50);
		arr[2] = new A(2);
		arr[3] = new A(9);
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("---------------------");
		System.out.println("Sorted array");
		System.out.println(Arrays.toString(arr));
	}
}
