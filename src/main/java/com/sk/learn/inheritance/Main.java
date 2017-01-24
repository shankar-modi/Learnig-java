package com.sk.learn.inheritance;

/**
 * 
 * @author Shankar Modi
 *
 *         Main class to create object of Parent and child class.
 */
public class Main {

	public static void main(String[] args) {

		Child c = new Child();
		System.out.println(c.name);

		Parent p = c;
		System.out.println(p.name);

		/*
		 * Even though the variable p refers an instance of class child, the
		 * p.name still evaluates to "Parent". Because variables names in Java
		 * are resolved by the reference type, not the object they are
		 * referencing.
		 */

	}
	
	// OUTPUT
	// Child
	// Parent
}
