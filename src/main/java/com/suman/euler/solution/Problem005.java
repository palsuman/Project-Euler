/**
 * Problem: Smallest multiple
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 
 * without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers 
 * from 1 to 20?
 */

package com.suman.euler.solution;

import java.util.ArrayList;
import java.util.List;

import com.suman.euler.function.Function;
import com.suman.euler.problem.EulerProblem;

public class Problem005 implements EulerProblem {

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		List<Long> factors = new ArrayList<>();
		long smallestPositiveNumber = 0;
		for (long index = 1L; index <= 20L; index++) {
			factors.add(index);
		}
		smallestPositiveNumber = Function.getLCM(factors);
		return smallestPositiveNumber;
	}

}
