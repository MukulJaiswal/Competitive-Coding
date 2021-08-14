package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram49 {
    
    //https://www.youtube.com/watch?v=NNBQik4phMI&ab_channel=Pepcoding
    //Here we are creating a frequency Map and using as a key in hashmap
    //logic is for anagram string, frequency map is same always 
    /*
    for example : eat : a1e1t1 
                  ate : a1e1t1
    We are finding a freq map with the help of Hashmap.
    */
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length == 0)
            return null;
        
        HashMap<HashMap<Character, Integer> , List<String>> bmap = new HashMap();
        
        for(String str :  strs){
            
            HashMap<Character, Integer> fmap = new HashMap<Character, Integer>();
            
            for(int i = 0 ; i < str.length(); i++){
                fmap.put(str.charAt(i) , fmap.getOrDefault(str.charAt(i) , 0 ) + 1);    
            }
            
            if(bmap.containsKey(fmap)){
                bmap.get(fmap).add(str);
            }
            else{
            	List<String > currList = new ArrayList();
            	currList.add(str);
                bmap.put(fmap, currList);
            }
        }
        
        List<List<String>> result = new ArrayList<List<String>>();
        
        for( List<String> value :  bmap.values()){
        	result.add(value);
        }
        return result;
    }
}

