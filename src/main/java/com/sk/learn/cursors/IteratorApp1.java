package com.sk.learn.cursors;

/**
 * @author Shankar Modi
 * 
 * Iterator example
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorApp1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int t = 5;
		while(t > 0){
			list.add(t*10);
			t--;
		}
		System.out.println("List");
		System.out.println("---------------");
		System.out.println(list);
		
		/**
		 * Creating Iterator object from collection class
		 */
		Iterator<Integer> itr = list.iterator();
		System.out.println("\nIterator");
		System.out.println("---------------");
		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println("\nList After iterator");
		System.out.println("---------------");
		System.out.println(list);
	}
}
