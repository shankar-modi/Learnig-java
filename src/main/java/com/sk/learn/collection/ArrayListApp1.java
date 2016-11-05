package com.sk.learn.collection;

import java.util.ArrayList;

import com.sk.learn.util.PrintUtil;

/**
 * 
 * @author Shankar Modi
 *
 */
public class ArrayListApp1 {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add("A");
		list.add(false);
		list.add("B");
		PrintUtil.print("Initial list", list);
		PrintUtil.print("Size of list", list.size());
		PrintUtil.print("Get element by index", list.get(2));
		PrintUtil.print("Index of B ", list.indexOf("B"));
		PrintUtil.print("Index of Z ", list.indexOf("Z"));
		/**
		 * We should always pass +ve integer argument to remove() method,
		 * Otherwise we'll get RTE : java.lang.ArrayIndexOutOfBoundsException
		 * 
		 * If we pass integer argument in remove method then it will always
		 * delete element by index.
		 * 
		 * If we pass argument other than integer in remove then it will delete
		 * element by content matching
		 * 
		 * If we pass argument like 2.5 then it will delete element by content
		 * matching
		 * 
		 * 
		 */
		list.remove(2);
		PrintUtil.print("After remove list", list);

	}

	/*
	 * OUTPUT
	 * 
	 * Initial list [1, A, false, B]
	 * ------------------------- 
	 * Size of list 
	 * 4
	 * ------------------------- 
	 * Get element by index 
	 * false
	 * ------------------------- 
	 * Index of B 
	 * 3 
	 * ------------------------- 
	 * Index of Z 
	 * -1 
	 * ------------------------- 
	 * After remove list 
	 * [1, A, B]
	 * -------------------------
	 */

}
