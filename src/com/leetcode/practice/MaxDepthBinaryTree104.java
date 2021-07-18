package com.leetcode.practice;

public class MaxDepthBinaryTree104 {

	// Function to count the number of nodes in a BT.
	// Not of use here.
	public int countNodes(TreeNode root) {
		int count = 1;
		if (root == null)
			return 0;
		else {
			count = count + countNodes(root.left);
			count = count + countNodes(root.right);
		}
		return count;
	}

	public int maxDepth(TreeNode root) {

		if (root == null) {
			return 0;
		}
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		return Math.max(left, right) + 1;
	}
}
