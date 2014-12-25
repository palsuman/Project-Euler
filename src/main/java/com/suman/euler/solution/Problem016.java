/**
 * Problem: Power digit sum
 * 
 * 2<sup>15</sup> = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2<sup>1000</sup>?
 */

package com.suman.euler.solution;

import java.math.BigInteger;

import com.suman.euler.problem.EulerProblem;

public class Problem016 implements EulerProblem {

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		BigInteger sumOfDigit = BigInteger.ZERO;
		BigInteger two = BigInteger.valueOf(2);
		int power = 1000;
		BigInteger calculatedValue = two.pow(power);
		String stringValue = calculatedValue.toString();
		int stringValueLength = stringValue.length();
		for(int index = 0; index < stringValueLength; index++) {
			String value = stringValue.substring(index, index + 1);
			sumOfDigit = sumOfDigit.add(new BigInteger(value));
		}
		return sumOfDigit.toString();
	}
}
