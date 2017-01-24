package com.sk.learn.inheritance;

/**
 * 
 * @author Shankar Modi
 *
 *
 *         Instance variables are not overridden, they are hidden.
 */
public class HiddenInstancVar {

	String name = "Instance Var.";

	void print() {
		String name = "Local Var.";
		System.out.println(name); // Local Var.
		System.out.println(this.name); // Instance Var.
	}

	public static void main(String[] args) {
		HiddenInstancVar obj = new HiddenInstancVar();
		obj.print();
	}
	//
	// OUTPUT
	// Local Var.
	// Instance Var.
}
