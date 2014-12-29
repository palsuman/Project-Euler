/**
 * Problem: Non-abundant sums
 * 
 * A perfect number is a number for which the sum of its proper divisors is exactly equal 
 * to the number. For example, the sum of the proper divisors of 28 would be 
 * 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 * 
 * A number n is called deficient if the sum of its proper divisors is less than n and 
 * it is called abundant if this sum exceeds n.
 * 
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number 
 * that can be written as the sum of two abundant numbers is 24. By mathematical analysis, 
 * it can be shown that all integers greater than 28123 can be written as the sum of two 
 * abundant numbers. However, this upper limit cannot be reduced any further by analysis 
 * even though it is known that the greatest number that cannot be expressed as the sum of 
 * two abundant numbers is less than this limit.
 *
 * Find the sum of all the positive integers which cannot be written as the sum of two 
 * abundant numbers.
 */

package com.suman.euler.solution;

import com.suman.euler.function.Function;
import com.suman.euler.problem.EulerProblem;

public class Problem023 implements EulerProblem {

	private final int GREATEST_ABUNDANT_NO = 28123;
	boolean[] isAbundant = new boolean[GREATEST_ABUNDANT_NO + 1];

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		int sumOfNonAbundantNo = 0;
		for (int index = 1; index <= GREATEST_ABUNDANT_NO; index++) {
			isAbundant[index] = Function.isAbundantNumber(index);
			System.out.println(index + " -> " + isAbundant[index]);
		}
		for (int index = 1; index <= GREATEST_ABUNDANT_NO; index++) {
			if (!isSumOf2Abundant(index)) {
				sumOfNonAbundantNo += index;
			}
		}
		return sumOfNonAbundantNo;
	}

	private boolean isSumOf2Abundant(int number) {
		boolean status = false;
		for (int index = 0; index <= number; index++) {
			if (isAbundant[index] && isAbundant[number - index]) {
				status = true;
				break;
			}
		}
		return status;
	}
}
