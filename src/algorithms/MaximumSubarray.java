package algorithms;

import java.util.Scanner;

/**
 * 
 * @author Mukul Link :
 *
 */
public class MaximumSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		// int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		
		/**
		 * Algorithm
		 * Store the value in currentmax. If currentmax becomes negative then it means it is going to decrease
		 * the max value. So sets to 0 again.
		 */

		int max = Integer.MIN_VALUE;
		int currentMax = 0;
		for (int i = 0; i < a.length; i++) {

			currentMax = currentMax + a[i];
			if (currentMax > max)
				max = currentMax;
			if (currentMax < 0)
				currentMax = 0;
		}
		System.out.println(max);

	}
}
