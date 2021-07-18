package algorithms;

import java.util.Scanner;

/**
 * 
 * @author Mukul
 * @see Rabin Karp algorithm matches the hash value of the pattern with the hash
 *      value of current substring of text, and if the hash values match then
 *      only it starts matching individual characters
 */
public class RabinKarp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();
		String pattern = sc.nextLine();

		// d is the number of characters in the input alphabet
		int d = 256;

		int M = pattern.length();
		int N = string.length();
		int i, j;
		int p = 0; // hash value for pattern
		int t = 0; // hash value for string
		int h = 1;
		int q = 13; // any prime number.

		// The value of h would be "pow(d, M-1)%q"
		for (i = 0; i < M - 1; i++)
			h = (h * d) % q;

		// Calculate the hash value of pattern and first
		// window of text
		for (i = 0; i < M; i++) {
			p = (d * p + pattern.charAt(i)) % q;
			t = (d * t + string.charAt(i)) % q;
		}

		// Slide the pattern over text one by one
		for (i = 0; i <= N - M; i++) {

			// Check the hash values of current window of text
			// and pattern. If the hash values match then only
			// check for characters on by one
			if (p == t) {
				/* Check for characters one by one */
				for (j = 0; j < M; j++) {
					if (string.charAt(i + j) != pattern.charAt(j))
						break;
				}

				// if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
				if (j == M)
					System.out.println("Pattern found at index " + i);
			}

			// Calculate hash value for next window of text: Remove
			// leading digit, add trailing digit
			if (i < N - M) {
				t = (d * (t - string.charAt(i) * h) + string.charAt(i + M)) % q;

				// We might get negative value of t, converting it
				// to positive
				if (t < 0)
					t = (t + q);
			}
		}
	}
}
