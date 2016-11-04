package com.sk.learn.cursors;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 
 * @author Shankar Modi
 *
 */
public class EnumerationApp1 {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		int t = 5;
		while (t > 0) {
			vector.addElement(t * 10);
			t--;
		}

		System.out.println("Vector");
		System.out.println("----------------");
		System.out.println(vector);

		/**
		 * Enumeration use to iterate Legacy classes like Vector,Stack
		 * 
		 * Output will we
		 * 
		 * Vector ---------------- [50, 40, 30, 20, 10]
		 * 
		 * Enumeration ---------------- 50 40 30 20 10
		 */
		Enumeration<Integer> en = vector.elements();

		System.out.println("\nEnumeration");
		System.out.println("----------------");
		while (en.hasMoreElements()) {
			System.out.print(en.nextElement() + " ");
		}
	}
}
