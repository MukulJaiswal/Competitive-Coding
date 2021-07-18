package com.placement.example;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String str[] = s.split(" ");
		
		//HashMap<Key, Value> hMap = new HashMap<>();
		
		HashMap<String, Integer> hMap = new HashMap<>();
		for (int i = 0; i < str.length; i++) {
			if (hMap.containsKey(str[i])) {
				int count = hMap.get(str[i]); 
				hMap.put(str[i], count + 1);
			} else
				hMap.put(str[i], 1);
			
		}
		System.out.println(hMap);
		System.out.println(hMap.toString());
		String check =  hMap.toString();
		

	}
}
