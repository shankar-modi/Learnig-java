package com.sk.learn.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * 
 * @author Shankar Modi
 *
 *Array sorting using comparator
 */

class B{
	int i;
	int j;
	public B(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		return "(i = "+this.i +" , j = "+this.j+")";
	}
}

class C implements Comparator<B>{
	public int compare(B o1, B o2) {
		return o1.i - o2.i;
	}
}

class D implements Comparator<B>{
	public int compare(B o1, B o2) {
		return o1.j - o2.j;
	}
} 
public class ArrayApp4 {

	public static void main(String[] args) {
		B [] b = new B[5];
		b[0] = new B(20,30);
		b[1] = new B(2,50);
		b[2] = new B(70,1);
		b[3] = new B(50,99);
		b[4] = new B(32,3);
		System.out.println("Unsorted Array");
		System.out.println("-------------------------");
		System.out.println(Arrays.toString(b));
		Arrays.sort(b, new C());
		System.out.println("Sorted by value of i");
		System.out.println("-------------------------");
		System.out.println(Arrays.toString(b));
		Arrays.sort(b, new D());
		System.out.println("Sorted by value of j");
		System.out.println("-------------------------");
		System.out.println(Arrays.toString(b));
	}
}
