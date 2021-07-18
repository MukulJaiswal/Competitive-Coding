package com.leetcode.practice;

public class SpecialArray5531 {
    public int specialArray(int[] nums) {
        
        int length = nums.length;
        int count = 0, check;
        int flag =0;

        for( check =length ; check > 0  ; check--){
            
            for(int itr = 0; itr < length ; itr++){
                if(nums[itr] >= check){
                    count++;
                }
            }
            if(count == check){
                flag = 1;
                break;
            } else {
                count = 0 ;
                flag = 0;
            }
        }
        if(flag == 1)
            return check;
        else
            return -1;
    }
}
