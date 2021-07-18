package com.leetcode.practice;

import java.util.*;

class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
}

public class NaryTreePostorderTravsl590 {

    public List<Integer> postorder(Node root) {
        return postorderHelper(root, new LinkedList<Integer>());
    }
    public List<Integer> postorderHelper(Node root, List<Integer> list){
        if(root == null) return list;
        for(Node child: root.children)
            postorderHelper(child, list);
        list.add(root.val);
        return list;
    }   
}
