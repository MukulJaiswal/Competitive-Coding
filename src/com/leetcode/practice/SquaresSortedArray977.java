package com.leetcode.practice;

import java.util.Arrays;

/**
 * Input: [-4,-1,0,3,10] Output: [0,1,9,16,100]
 *
 */
public class SquaresSortedArray977 {
    public int[] sortedSquares(int[] a) {
    	
    	int res[] = new int[a.length];
    	
    	for(int i=0;i<a.length;i++) {
    		res[i] = a[i]*a[i];
    	}
    	Arrays.sort(res);
		return res;
    }
}
