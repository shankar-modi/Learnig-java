package com.sk.learn.inheritance;

/**
 * 
 * @author Shankar Modi
 *
 *         Inheritance Child class
 * 
 *         When an instance variable in a subclass has the same name as an
 *         instance variable in a super class, then the instance variable is
 *         chosen in the class that is the reference type.
 */
public class Child extends Parent {

	public String name = "Child";

	public String getName() {
		return name;
	}
}
