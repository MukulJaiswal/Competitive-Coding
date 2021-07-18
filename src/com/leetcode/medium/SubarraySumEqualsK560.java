package com.leetcode.medium;

import java.util.HashMap;

public class SubarraySumEqualsK560 {
	
	/**
	 * 
	 * @param nums
	 * @param k
	 * @return
	 * 
	 * [3, 4, 7 ,2 , -3, 1, 4, 2] and k = 7
	 * 
	 * The concept here is ::
	 * 
	 * Here 1 + 4 + 2 = 7 so
	 * (3 + 4 + 7 + 2 + -3 + 1 + 4 + 2) - (3 + 4 + 7 + 2 + -3 + 1)   = 7 
	 * The cumulative sum between Sum[j] - sum[i] = k
	 * 
	 * 
	 */
	//https://www.youtube.com/watch?v=20v8zSo2v18
    public int subarraySum3(int[] nums, int k) {
        
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap <> ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            
        	sum += nums[i];
            
        	if (map.containsKey(sum - k))
                count += map.get(sum - k);
            
        	map.put(sum, map.getOrDefault(sum, 0) + 1);
            //getOrDefault -> Returns value based on key received from variable sum,
            //if no key found then it returns 0(default value)
        	
        	
        	//Alternative of map.getOrDefault()
//            if(map.containsKey(sum)){
//                map.put(sum , map.get(sum) + 1);
//            }else{
//                map.put(sum , 1);
//            }
        	
        }
        System.out.println(map);
        return count;
    }
	
    public int subarraySum2(int[] nums, int k) {
        
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum=0;
            for (int end = start; end < nums.length; end++) {
                sum+=nums[end];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

	/**
	 * Input: nums = [1,2,3], k = 3 Output: 2 -[1+2], [3] 
	 * Input: nums = [1,1,1], k =2 Output: 2 -[1,1], [1,1] 
	 * [-1,-1,1] k = 0 --
	 * 
	 * [1,-1,0] k = 0
	 * 
	 * @param nums
	 * @param k
	 * @return
	 * 
	 * Below is the iterative approach for generating all the sub array of an array.
	 * In general there are n*(n+1)/2 sub arrays can be generated from array.
	 */
	public int subarraySum1(int[] nums, int k) {

        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end <= nums.length; end++) {
                int sum = 0;
                for (int i = start; i < end; i++) {
                	System.out.print(nums[i] + " ");//Printing Sub array
                    sum += nums[i];
                }
                System.out.println();//Printing Subarray
                if (sum == k)
                    count++;
            }
        }
        return count;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3,-1, 1,2};
		int k = 3;
		SubarraySumEqualsK560 ob = new SubarraySumEqualsK560();
		System.out.println(ob.subarraySum2(nums, k));
	}
}
