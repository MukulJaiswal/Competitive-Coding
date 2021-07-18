package com.leetcode.practice.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BringElementToFirstLocation {
	
	static int[] bringFirst(int a[], int position){
		
		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
		int element = list.get(position);	
		
		list.remove(position);//It will remove element by index.
		list.add(0, element);
		
		System.out.println(list);
		
		return new int[] {1,3};
	}
	
	public static void main(String[] args) {
		int a[] = {2,4,1,5,7,9,6};
		bringFirst(a, 4);
	}
}
