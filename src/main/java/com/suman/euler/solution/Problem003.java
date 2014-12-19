/**
 * Problem: Largest prime factor
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

package com.suman.euler.solution;

import java.util.List;

import com.suman.euler.function.Function;
import com.suman.euler.problem.EulerProblem;

public class Problem003 implements EulerProblem {

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		long maxNumber = 600851475143L;
		long primefactor = 2;
		List<Long> primeSequence = Function.getPrimeSequence(maxNumber);
		for (int index = primeSequence.size() - 1; index >= 0; index--) {
			long number = primeSequence.get(index);
			if (maxNumber % number == 0) {
				primefactor = number;
				break;
			}
		}
		return primefactor;
	}
}
