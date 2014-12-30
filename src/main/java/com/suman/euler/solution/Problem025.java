/**
 * Problem: 1000-digit Fibonacci number
 * 
 * The Fibonacci sequence is defined by the recurrence relation:
 * 
 * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 * Hence the first 12 terms will be:
 * 
 * F1 = 1
 * F2 = 1
 * F3 = 2
 * F4 = 3
 * F5 = 5
 * F6 = 8
 * F7 = 13
 * F8 = 21
 * F9 = 34
 * F10 = 55
 * F11 = 89
 * F12 = 144
 * The 12th term, F12, is the first term to contain three digits.
 * 
 * What is the first term in the Fibonacci sequence to contain 1000 digits?
 */

package com.suman.euler.solution;

import com.suman.euler.problem.EulerProblem;

public class Problem025 implements EulerProblem {
	private final double PHI = (1 + Math.sqrt(5)) / 2;

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		/*
		 * n > (999 + 1/2*log10(5)) / log10(PHI) where PHI = (1 + sqrt(5)) / 2
		 */
		double nthTerm = Math.ceil((999 + (.5 * Math.log10(5))) / (Math.log10(PHI)));
		return (int) nthTerm;
	}

}
