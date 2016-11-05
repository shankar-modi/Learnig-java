package com.sk.learn.collection;

import java.util.LinkedList;

import com.sk.learn.util.PrintUtil;

/**
 * 
 * @author Shankar Modi
 *
 */
public class LinkedListApp1 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.add("C");

		PrintUtil.print("Initial LL", ll);

		PrintUtil.print("Get from LL", ll.get(1));

		/**
		 * remove() method always removes first element. IF we call remove
		 * method on Empty LL then we'll get RTE:
		 * java.util.NoSuchElementException.
		 */
		ll.remove();
		PrintUtil.print("After Remove from LL", ll);

		ll.remove(1);
		PrintUtil.print("After Remove By Index from LL", ll);

		ll.addFirst("Z");
		PrintUtil.print("After Add first to LL", ll);

		ll.addLast("X");
		PrintUtil.print("After Add Last to LL", ll);

		ll.removeFirst();
		PrintUtil.print("After Remove first from LL", ll);

		ll.removeLast();
		PrintUtil.print("After Remove Last from LL", ll);
	}

	/**
	 * OUTPUT
	 * 
	 * Initial LL 
	 * [A, B, C] 
	 * ------------------------- 
	 * Get from LL 
	 * B
	 * ------------------------- 
	 * After Remove from LL 
	 * [B, C]
	 * ------------------------- 
	 * After Remove By Index from LL 
	 * [B]
	 * ------------------------- 
	 * After Add first to LL 
	 * [Z, B]
	 * ------------------------- 
	 * After Add Last to LL 
	 * [Z, B, X]
	 * ------------------------- 
	 * After Remove first from LL 
	 * [B, X]
	 * ------------------------- 
	 * After Remove Last from LL 
	 * [B]
	 * -------------------------
s	 * 
	 */
}
