package com.leetcode.practice;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Input: students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1] Output: 3
 * 
 * @author Mukul
 *
 */
public class NumberStudentsLunch1500 {

	public int countStudents(int[] students, int[] sandwiches) {

		int countZerosAndOnes[] = new int[2];

		for (int i : students) {
			countZerosAndOnes[i]++;
		}

		for (int i = 0; i < sandwiches.length; i++) {
			if (--countZerosAndOnes[sandwiches[i]] < 0) {
				return sandwiches.length - i;
			}
		}
		return 0;
	}

	public int countStudents1(int[] students, int[] sandwiches) {

		// Make queue of student and sandwich
		Queue<Integer> sand = new LinkedList<>();
		Queue<Integer> stud = new LinkedList<>();

		for (int sw : sandwiches)
			sand.add(sw);
		for (int std : students)
			stud.add(std);
		int count = 0; // Number of students who move to the end of queue

		while (!sand.isEmpty()) {
			int student = stud.peek();
			int sandwich = sand.peek();

			if (sandwich == student) {
				stud.poll();
				sand.poll();

				// Reset : Because one of the student(who may have moved to backward earlier)
				// got the sandwich
				// and there is probablity that all students after this student may also got
				// their sandwiches
				count = 0;

			}
			if (student != sandwich) {
				student = stud.poll();
				stud.add(student);
				count++;

				// Loop breaking statement : For example, when we reach to this condition
				/*
				 * Sandwiches : 0 1 1 Students : 1 1 1
				 * 
				 * Here, we can see that all the three students will not be able to take any
				 * sandwiches and we will keep moving students to back-wards and if count ==
				 * stud.size(), then break and return the size of stud Queue.
				 * 
				 * And if you won't apply this check-mark, then at this point of time, your loop
				 * will become never ending loop.
				 * 
				 */

				if (count == stud.size())
					return stud.size();
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int students[] = { 1, 1, 0, 0 };
		int sandwiches[] = { 0, 1, 0, 1 };
		NumberStudentsLunch1500 ob = new NumberStudentsLunch1500();

		System.out.println(ob.countStudents(students, sandwiches));
	}
}
