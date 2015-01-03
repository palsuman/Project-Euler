/**
 * Problem: Self powers
 * 
 * The series, 1<sup>1</sup> + 2<sup>2</sup> + 3<sup>3</sup> + ... + 10<sup>10</sup> = 10405071317.
 * 
 * Find the last ten digits of the series, 1<sup>1</sup> + 2<sup>2</sup> + 3<sup>3</sup> + ... + 1000<sup>1000</sup>.
 */

package com.suman.euler.solution;

import java.math.BigInteger;

import com.suman.euler.problem.EulerProblem;

public class Problem048 implements EulerProblem {

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		int range = 1000;
		BigInteger sumOfPower = BigInteger.ZERO;
		for (int index = 1; index <= range; index++) {
			sumOfPower = sumOfPower.add(BigInteger.valueOf(index).pow(index));
		}
		String sumOfPowStr = sumOfPower.toString();
		int sumOfPowStrLength = sumOfPowStr.length();
		String last10OfSumOfPow = sumOfPowStr.substring(sumOfPowStrLength - 10,
				sumOfPowStrLength);
		return last10OfSumOfPow;
	}
}
