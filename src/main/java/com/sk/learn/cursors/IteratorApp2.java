package com.sk.learn.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Shankar Modi
 *
 */
public class IteratorApp2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int t = 5;
		while (t > 0) {
			list.add(t * 10);
			t--;
		}
		System.out.println("List");
		System.out.println("---------------");
		System.out.println(list);

		/**
		 * Creating Iterator object from collection class
		 */
		Iterator<Integer> itr = list.iterator();

		/**
		 * We can not add new Object in Collection after getting Iterator Object
		 * will get "java.util.ConcurrentModificationException" RTE
		 */
		list.add(100);
		System.out.println("\nIterator");
		System.out.println("---------------");
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
