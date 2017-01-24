package com.sk.learn.collection;

import java.util.Stack;

import com.sk.learn.util.PrintUtil;

/**
 * 
 * @author Shankar Modi
 *
 */
public class StackApp1 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);

		PrintUtil.print("Stack", s);
		PrintUtil.print("Empty", s.empty());
		PrintUtil.print("Search", s.search(2));
		PrintUtil.print("Search", s.search(10));
		/**
		 * peek() return Top element.
		 */
		PrintUtil.print("Peek", s.peek());
		/**
		 * pop() return and remove Top element.
		 * If we Pop empty stack then we'll get 
		 * RTE :  java.util.EmptyStackException
		 */
		PrintUtil.print("Pop", s.pop());
		PrintUtil.print("After Pop", s);
	}

	/**
	 * OUTPUT
	 * 
	 * Stack : [1, 2, 3] 
	 * ------------------------- 
	 * Empty : false
	 * ------------------------- 
	 * Search : 2 
	 * ------------------------- 
	 * Search : -1 
	 * ------------------------- 
	 * Peek : 3 
	 * ------------------------- 
	 * Pop : 3
	 * ------------------------- 
	 * After Pop : [1, 2] 
	 * -------------------------
	 * 
	 */
}
