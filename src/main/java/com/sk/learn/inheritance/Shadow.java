package com.sk.learn.inheritance;

/**
 * 
 * @author Shankar Modi
 *
 *Inside a class method, when a local variable have the same name as one of the instance variable,
 * the local variable shadows the instance variable inside the method block.
 */

public class Shadow {

	int a;
	
	public void setA(int a){
		 a = a; //here, the local variable has closer scope than the instance 
		 		// variable, so the expression set parameter equal to itself
		 
		 System.out.println(a);
		 System.out.println("-----------------------");
		  // this.a = a ,this is the correct way to set the parameter to the 
		 //instance variable.
		 System.out.println(this.a);
		System.out.println("-----------------------");
		this.a = a;
		// this.a = a ,this is the correct way to set the parameter to the
		 //instance variable.
		 System.out.println(this.a);
		 
	}
	
	public static void main(String[] args) {
		Shadow s = new Shadow();
		s.a = 20;
		s.setA(10);
	}
	
	// OUTPUT
	// 10
	// -----------------------
	// 20
	// -----------------------
	// 10
}
