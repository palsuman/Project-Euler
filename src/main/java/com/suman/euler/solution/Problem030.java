/**
 * Problem: Digit fifth powers
 * 
 * Surprisingly there are only three numbers that can be written as the sum of 
 * fourth powers of their digits:
 * 
 * 1634 = 14 + 64 + 34 + 44
 * 8208 = 84 + 24 + 04 + 84
 * 9474 = 94 + 44 + 74 + 44
 * As 1 = 14 is not a sum it is not included.
 * 
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 * 
 * Find the sum of all the numbers that can be written as the sum of fifth powers 
 * of their digits.
 */

package com.suman.euler.solution;

import com.suman.euler.problem.EulerProblem;

public class Problem030 implements EulerProblem {
	/*
	 * So lets determine the upper bound. We need to find a number x*95 which
	 * gives us an x digit number. We can do this by hand. Since 95 = 59049, we
	 * need at least 5 digits. 5*95 = 295245, so with 5 digits we can make a 6
	 * digit number. 6*95 = 354294. So 355000 seems like a reasonable upper
	 * bound to use. We could probably tighten is even further if we wanted.
	 */
	private long MAX_RANGE = 355000L;

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		long total = 0L;

		for (long index = 5; index < MAX_RANGE; index++) {
			long sumOfPowers = 0L;
			long number = index;
			while (number > 0L) {
				long rem = number % 10;
				number = number / 10;
				sumOfPowers += Math.pow(rem, 5);
			}
			if (index == sumOfPowers) {
				total += index;
			}
		}
		return total;
	}
}
