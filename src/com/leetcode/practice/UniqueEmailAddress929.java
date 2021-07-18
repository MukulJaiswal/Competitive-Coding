package com.leetcode.practice;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress929 {
	
    public int numUniqueEmails(String[] emails) {	
    	
    	Set<String> set = new HashSet();
    	for(String email : emails) {
    		
    		int indexRate =email.indexOf('@');
    		
    		String localName = email.substring(0, indexRate);
    		String domainName = email.substring(indexRate + 1 , email.length());
    		
    		
    		
    		
    		
    	}
    	
    	
		return 0;
        
    }
}
