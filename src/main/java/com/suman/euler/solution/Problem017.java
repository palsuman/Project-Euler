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

public class Problem017 implements EulerProblem {

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		BigInteger sumOfDigit = BigInteger.ZERO;
		final int RANGE = 1000;
		for(int index = 0; index < RANGE; index++){
			String numberInWord = getNumberInWord(index);
			int cleanWordLength = getCleanWordLength(numberInWord);
			System.out.println("Word: " + numberInWord + " and the clean length: " + cleanWordLength);
		}
		return sumOfDigit.toString();
	}

	private String getNumberInWord(int number) {
		String numberStr = ""+number;
		if(numberStr.length() == 4){
			
		}
		return null;
	}

	private int getCleanWordLength(String numberInWord) {
		String cleanWord = numberInWord.replaceAll(" ", "").replaceAll("-", "");
		cleanWord = cleanWord.replaceAll("-", "");
		return cleanWord.length();
	}
}
