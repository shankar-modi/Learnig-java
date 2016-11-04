package com.sk.learn.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 * @author Shankar Modi
 *
 */
public class ListIteratorApp1 {

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
		 * Creating ListIterator object from List class
		 */
		ListIterator<Integer> ltr = list.listIterator();
		/**
		 * We can add object to List using ListIterators' add method. 
		 * add() method will add new object to left side wherever iterator is pointing.
		 * 
		 * E.g.
		 * here Listiterator is pointing to 50 , so add() will add 100
		 * to left side of 50.
		 * 
		 * so our output will be
		 * 
		 * List --------------- [50, 40, 30, 20, 10]
		 * 
		 * listIterator --------------- 50 40 30 20 10 -- here 100 is not
		 * printing because listIterator reference pointing to 50 and we listIterator added
		 * new Object before 50.
		 * 
		 * List After iterator --------------- [100, 50, 40, 30, 20, 10]
		 * 
		 * listIterator previous --------------- 10 20 30 40 50 100
		 * 
		 */
		ltr.add(100);
		System.out.println("\nlistIterator");
		System.out.println("---------------");
		while (ltr.hasNext()) {
			System.out.print(ltr.next() + " ");
		}
		System.out.println();
		System.out.println("\nList After iterator");
		System.out.println("---------------");
		System.out.println(list);
		System.out.println("\nlistIterator previous");
		System.out.println("---------------");
		while (ltr.hasPrevious()) {
			System.out.print(ltr.previous() + " ");
		}

	}
}
