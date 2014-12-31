/**
 * Problem: Longest Collatz sequence
 * 
 * The following iterative sequence is defined for the set of positive integers:
 * 
 *          n → n/2 (n is even)
 *          n → 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following sequence:
 * 
 *         13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * 
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers 
 * finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */

package com.suman.euler.solution;

import com.suman.euler.problem.EulerProblem;

public class Problem014 implements EulerProblem {

	private final int COLLATZ_RANGE = 1000000;

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		int[] collatzTerms = new int[COLLATZ_RANGE];
		int maxTerms = 1;
		int finalCollatzNo = 2;
		collatzTerms[2] = 1;
		START_LOOP: for (int index = 3; index < COLLATZ_RANGE; index++) {
			long collatzNo = index;
			int terms = 0;
			boolean infinite = false;
			while (collatzNo != 1) {
				if (collatzNo % 2 == 0) {
					collatzNo = forEvenCollatz(collatzNo);
				} else {
					collatzNo = forOddCollatz(collatzNo);
				}
				++terms;
				if (collatzNo < COLLATZ_RANGE && collatzTerms[(int) collatzNo] != 0) {
					terms += collatzTerms[(int) collatzNo];
					collatzNo = 1;
				}
			}
			if (infinite) {
				continue START_LOOP;
			}
			collatzTerms[index] = terms;
			if (terms > maxTerms) {
				maxTerms = terms;
				finalCollatzNo = index;
			}
		}
		return finalCollatzNo;
	}

	private long forEvenCollatz(long number) {
		return number / 2;
	}

	private long forOddCollatz(long number) {
		return ((3 * number) + 1);
	}
}
