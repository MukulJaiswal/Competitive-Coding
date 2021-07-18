package com.placement.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncrementArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];

		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < size - 1; i++) {

			if (a[i + 1] - a[i] == 1) {
				list.add(a[i]);
			} else {
				int diff = a[i + 1] - a[i];

				while (diff-- != 0) {
					list.add(a[i]++);
				}
			}
		}
		list.add(a[size - 1]);
		list.add(++a[size - 1]);

		for (Integer val : list) {
			System.out.print(val + " ");
		}

	}
}
