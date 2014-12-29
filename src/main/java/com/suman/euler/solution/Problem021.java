/**
 * Problem: Amicable numbers
 * 
 * Let d(n) be defined as the sum of proper divisors of n 
 * (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair 
 * and each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; 
 * therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000.
 */

package com.suman.euler.solution;

import java.util.ArrayList;
import java.util.List;

import com.suman.euler.problem.EulerProblem;

public class Problem021 implements EulerProblem {
	private final int AMICABLE_RANGE = 10000;

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		int sumOfAmicableNumbers = 0;
		boolean[] amicableNumbers = new boolean[AMICABLE_RANGE];
		for (int number = 2; number < AMICABLE_RANGE; number++) {
			if (amicableNumbers[number] == true) {
				continue;
			}
			List<Integer> properDivisor = getProperDivisors(number);
			int amicableNo = getSumOfNumbers(properDivisor);
			properDivisor = getProperDivisors(amicableNo);
			int sumOfDivisors = getSumOfNumbers(properDivisor);
			if (sumOfDivisors == number && amicableNo != number) {
				amicableNumbers[number] = true;
				amicableNumbers[amicableNo] = true;
				sumOfAmicableNumbers += number + amicableNo;
			}
		}
		return sumOfAmicableNumbers;
	}

	private int getSumOfNumbers(List<Integer> properDivisor) {
		int sum = 0;
		for (Integer value : properDivisor) {
			sum += value;
		}
		return sum;
	}

	private List<Integer> getProperDivisors(int number) {
		int limit = (int) Math.floor(Math.sqrt(number));
		List<Integer> properDivisor = new ArrayList<>(limit);
		for (int index = 1; index <= limit; index++) {
			// Checking proper divisible or not
			if (number % index == 0) {
				if (properDivisor.contains(index)) {
					break;
				}
				properDivisor.add(index);
				int another = number / index;
				if (another != number) {
					properDivisor.add(another);
				}
			}
		}
		return properDivisor;
	}
}
