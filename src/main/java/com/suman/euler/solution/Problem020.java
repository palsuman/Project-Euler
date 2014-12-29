/**
 * Problem: Factorial digit sum
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * 
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * 
 * Find the sum of the digits in the number 100!
 */

package com.suman.euler.solution;

import java.math.BigInteger;

import com.suman.euler.function.Function;
import com.suman.euler.problem.EulerProblem;

public class Problem020 implements EulerProblem {
	

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		BigInteger sumOfDigit = BigInteger.ZERO;
		BigInteger number = BigInteger.valueOf(100);
		BigInteger factorial = Function.getFactorial(number);
		String factorialStr = factorial.toString();
		int factorialLength = factorialStr.length();
		for(int index = 0; index < factorialLength; index++) {
			BigInteger digit = new BigInteger(factorialStr.substring(index, index+1));
			sumOfDigit = sumOfDigit.add(digit);
		}
		return sumOfDigit.toString();
	}

	
}
