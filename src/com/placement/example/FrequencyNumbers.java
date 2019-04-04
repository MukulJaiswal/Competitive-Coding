package com.placement.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FrequencyNumbers {

	public static void main(String[] args) {

		int a[] = { 2, 2, 2, 2, 4, 4, 5, 5, 5, 6, 7, 7, 8 };

		List<Integer> list = new ArrayList<Integer>();

		/***
		 * This code explains the use of asList(). This code can be made working by
		 * declaring a[] array as Integer(wrapper class)
		 * 
		 * List<Integer> list1 = Arrays.asList(a); for(int i : list) {
		 * System.out.println(i); }
		 * 
		 */

		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}

		Set<Integer> set = new HashSet<Integer>(list);

		for (int i : set)
			System.out.println(i + " -> " + Collections.frequency(list, i));

	}
}
