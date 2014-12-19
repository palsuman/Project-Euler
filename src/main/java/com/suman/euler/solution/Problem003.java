/**
 * Problem: Largest prime factor
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
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
		long possibleMaxFactor = (long) Math.sqrt(maxNumber);
		long primeFactor = 1;
		boolean gotPrimeFactor = false;
		for (long number = possibleMaxFactor; number >= 2; number -= Function.MAX_DIFFERENCE) {
			long endRange = number;
			long startRange = endRange - Function.MAX_DIFFERENCE;
			startRange = startRange < 2 ? 2 : startRange;
			try {
				List<Long> primeSequence = Function.getPrimeSequence(
						startRange, endRange);
				int startIndex = primeSequence.size() - 1;
				for (int index = startIndex; index >= 0; index--) {
					long primeNumber = primeSequence.get(index);
					if (maxNumber % primeNumber == 0) {
						primeFactor = primeNumber;
						gotPrimeFactor = true;
						break;
					}
				}
				if(gotPrimeFactor){
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return primeFactor;
	}
}
