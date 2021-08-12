package com.trees.example;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.youtube.com/watch?v=thkuu_FWFD8&t=50s&ab_channel=Exponent
 * @author Mukul
 */

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
/**
 *      1               --level 1
 *    
 *   2     3            --level 2
 *          
 *             6        --level 3
 * @return 
 */
public class LeftSubViewOfBT {
	
	int maxLevelCheck = 0;
	
	void leftSubView(Node root, int level ,List<Integer> result) {

		if(root == null) 
			return;

		if(maxLevelCheck < level) {
			result.add(root.data);
			maxLevelCheck = level;
		}
		
		leftSubView(root.left, level + 1, result);
		leftSubView(root.right, level + 1, result);

	}
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2); 
		root.right = new Node(3); 
		root.right.right = new Node(6);
		
		List<Integer> result = new ArrayList<>();
		
		new LeftSubViewOfBT().leftSubView(root, 1 ,result);
		
		System.out.println(result);
		
	}
}


















