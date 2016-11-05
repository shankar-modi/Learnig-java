package com.sk.learn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sk.learn.util.PrintUtil;

/**
 * 
 * @author Shankar Modi
 *
 */
public class ArrayListApp2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("C");
		list.add("Z");
		list.add("D");
		list.add("M");
		list.add("Q");
		list.add("S");

		PrintUtil.print("List", list);

		/**
		 * Collections.sort() is utility method to sort collection objects. For
		 * Sorting Object should Comparable type and Homogeneous
		 */
		Collections.sort(list);
		PrintUtil.print("List After sorting", list);

		/**
		 * For customized sorting we are passing Comparator type to
		 * Collections.sort()
		 */
		Collections.sort(list, new MyComparator());
		PrintUtil.print("Reverse sorting", list);

	}

	static class MyComparator implements Comparator<String> {
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);
		}
	}
	/**
	 * OUTPUT
	 * 
	 * List [C, Z, D, M, Q, S] 
	 * ------------------------- 
	 * List After sorting [C,D, M, Q, S, Z]
	 * ------------------------- 
	 * Reverse sorting 
	 * [Z, S, Q, M, D,C]
	 * -------------------------
	 */
}
