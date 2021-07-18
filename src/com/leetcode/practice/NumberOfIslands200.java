package com.leetcode.practice;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/number-of-islands/
 * 
 * @author Mukul
 *
 */
public class NumberOfIslands200 {
	public static int numIslands(char[][] grid) {
		int count = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {

				if (grid[i][j] == '1') {
					count = count + 1;
					callDFS(grid, i, j);
				}
			}
		}

		return count;
	}

	public static void callDFS(char[][] grid, int i, int j) {

		if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
			return;
		}

		grid[i][j] = '0';
		callDFS(grid, i + 1, j);
		callDFS(grid, i - 1, j);
		callDFS(grid, i, j - 1);
		callDFS(grid, i, j + 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int size = sc.nextInt();
		char grid[][] = new char[4][5];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] =  sc.next().charAt(0);
			}
		}
		
		int count = numIslands(grid);
		System.out.println(count);

	}
}










