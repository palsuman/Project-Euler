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

import java.util.ArrayList;
import java.util.List;

import com.suman.euler.function.Function;
import com.suman.euler.problem.EulerProblem;

public class Problem023 implements EulerProblem {

	private final int GREATEST_ABUNDANT_NO = 28123;
	boolean[] isSumOf2Abundant = new boolean[GREATEST_ABUNDANT_NO + 1];
	List<Integer> abundants = new ArrayList<>();

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		int sumOfNonAbundantNo = 0;
		for (int index = 1; index <= GREATEST_ABUNDANT_NO; index++) {
			if (Function.isAbundantNumber(index)) {
				abundants.add(index);
			}
		}
		int abundantSize = abundants.size();
		for (int iIndex=0;iIndex<abundantSize;iIndex++ ) {
			for (int jIndex =0;jIndex<abundantSize;jIndex++) {
				int sumOf2Abundant = abundants.get(iIndex) + abundants.get(jIndex);
				if (sumOf2Abundant <= GREATEST_ABUNDANT_NO) {
					isSumOf2Abundant[sumOf2Abundant] = true;
				}
			}
		}
		for (int index = 0; index <= GREATEST_ABUNDANT_NO; index++) {
			if (!isSumOf2Abundant[index]) {
				sumOfNonAbundantNo += index;
			}
		}
		return sumOfNonAbundantNo;
	}

}
