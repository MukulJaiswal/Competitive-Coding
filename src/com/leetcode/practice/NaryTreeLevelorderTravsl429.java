package com.leetcode.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class NaryTreeLevelorderTravsl429 {

	List<List<Integer>> list = new ArrayList<>();

	public List<List<Integer>> levelOrder(Node root) {
		if (root == null)
			return list;
		levelOrderHelper(root, 0);
		return list;
	}

	private void levelOrderHelper(Node root, int level) {
		if (root != null) {
			if (list.size() <= level)
				list.add(new ArrayList<Integer>());
			List<Integer> p = list.get(level);
			p.add(root.val);

			level++;
			for (Node node : root.children) {
				levelOrderHelper(node, level);
			}
		}
	}

	// BFS technique for implementation of Level Order traversal.

	public static List<List<Integer>> levelOrder1(Node root) {
		List<List<Integer>> ret = new LinkedList<>();

		if (root == null)
			return ret;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root); // 1 is added.

		while (!queue.isEmpty()) {

			List<Integer> curLevel = new LinkedList<>();
			int len = queue.size();
			for (int i = 0; i < len; i++) {
				Node curr = queue.poll(); // returns the head of the queue.
				curLevel.add(curr.val); // prints or storation part of BFS
				for (Node c : curr.children) // add the adjacent nodes of the tree
					queue.add(c);
			}
			ret.add(curLevel);
		}
		return ret;
	}
}









