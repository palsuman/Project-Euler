/**
 * Problem: Summation of primes
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17
 * Find the sum of all the primes below two million
 */

package com.suman.euler.solution;

import java.util.List;

import com.suman.euler.function.Function;
import com.suman.euler.problem.EulerProblem;

public class Problem010 implements EulerProblem {

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		long sumOfPrime = 2;

		for (long index = 3; index < 2000000; index += Function.MAX_DIFFERENCE + 1) {
			long range = index + Function.MAX_DIFFERENCE;
			if (range >= 2000000) {
				range = 2000000;
			}
			List<Long> primeSequence = Function.getPrimeSequence(index, range);
			for (Long prime : primeSequence) {
				sumOfPrime += prime;
			}
		}
		return sumOfPrime;
	}

}
