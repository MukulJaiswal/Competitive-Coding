package com.leetcode.practice;

import java.util.LinkedList;
import java.util.List;

public class NaryTreePreorderTravsl589 {
	
    public List<Integer> preorder(Node root) {   
    	
        LinkedList<Integer> list = new LinkedList<Integer>();
    	return preorderHelper(root, list);		
    }

	public List<Integer> preorderHelper(Node root, LinkedList<Integer> list) {
		
		if(root == null) return list;
		list.add(root.val);
		for(Node child : root.children) {
			
			preorderHelper(child,list);
		}
		return list;	
	}
}