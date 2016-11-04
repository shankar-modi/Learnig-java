package com.sk.learn.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Shankar Modi Creating List form Array using Arrays.asList()
 */
public class ArrayToList {

	public static void main(String[] args) {
		List<String> list = null;
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "Element_" + i;
		}
		System.out.println("Array");
		System.out.println("--------------------");
		System.out.println(Arrays.toString(arr));
		/**
		 * list = Arrays.asList(arr) list and arr share same (Object) memory on
		 * Heap. list.set(2, "Updated element"); so when we update element from
		 * list or array it will reflect in both array and list.
		 * 
		 * list.add("test") but when we try to add new element in list then also
		 * also gets changed so we will get
		 * "java.lang.UnsupportedOperationException" exception
		 *
		 */
		list = Arrays.asList(arr);
		System.out.println("--------------------");
		System.out.println("List");
		System.out.println("--------------------");
		System.out.println(list);
		System.out.println("--------------------");
		list.set(2, "Updated element");
		System.out.println("Updated List");
		System.out.println("--------------------");
		System.out.println(list);
		System.out.println("--------------------");
		System.out.println("Updated Array");
		System.out.println("--------------------");
		System.out.println(Arrays.toString(arr));

		//list.add("test");
		sc.close();

	}
}
