package com.leetcode.practice;

import java.util.ArrayList;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
	TreeNode(){
		
	}
}

public class BTreeInorder94 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new LinkedList<Integer>();

		if (root != null) {
			list.addAll(inorderTraversal(root.left));
			list.add(root.val);
			list.addAll(inorderTraversal(root.right));
		}
		return list;
	}

	public static List<Integer> inorderTraversalIteration(TreeNode root) {

		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack();

		while (!stack.isEmpty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}

			root = stack.pop();
			list.add(root.val);
			root = root.right;
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		int a[] = {};
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(null);

	}
}














