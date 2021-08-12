package com.leetcode.medium;

import java.util.PriorityQueue;

public class ReorganizeString767 {

	public static String reorganizeString(String s) {

		int size = s.length();

		int hash[] = new int[26];

		for (char c : s.toCharArray()) {
			hash[c - 'a']++;
		}
//		System.out.println(Arrays.toString(hash));
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> hash[b] - hash[a]);

		for (int i = 0; i < hash.length; i++) {

			if (hash[i] > (size + 1) / 2) {
				return "";
			}
			if (hash[i] != 0) {
				pq.add(i);
			}
		}
		
		System.out.println(pq);
		StringBuilder sb = new StringBuilder();

		while (pq.size() >= 2) {
			int id1 = pq.poll();
			int id2 = pq.poll();
			char ch1 = (char) (id1 + 'a');
			char ch2 = (char) (id2 + 'a');
			sb.append(ch1);
			sb.append(ch2);
			hash[id1]--;
			hash[id2]--;

			if (hash[id1] > 0) {
				pq.add(id1);
			}

			if (hash[id2] > 0) {
				pq.add(id2);
			}
		}
		
		if(pq.size() != 0) {
			int id = pq.poll();
			char ch = (char)(id + 'a');
			sb.append(ch);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reorganizeString("vvvlo"));
	}
}




