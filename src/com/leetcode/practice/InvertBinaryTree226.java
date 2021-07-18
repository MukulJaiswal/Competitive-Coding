package com.leetcode.practice;

public class InvertBinaryTree226 {

	public TreeNode invertTree(TreeNode root) {

		TreeNode temp;

		if (root == null)
			return root;

		temp = root.left;
		root.left = root.right;
		root.right = temp;

		root.left = invertTree(root.left);
		root.right = invertTree(root.right);

		return root;
	}
}
