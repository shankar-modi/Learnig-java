package com.sk.learn.arrays.geeksforgeeks;

/**
 * 
 * @author Shankar Modi
 *
 */

public class MajorityElementInArrayUsingTwoLoops {

	public static void main(String[] args) {
		int[] arr = {3 ,3 ,4,2, 4, 4, 2, 4, 4};
		
		int hc = (arr.length/2);
		System.out.println(hc);
		int val = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]){
					count++;
				}
				
				if(count > hc){
					val = arr[i];
					break;
				}
			}
			
		}
		System.out.println(val);
		
	}
}
