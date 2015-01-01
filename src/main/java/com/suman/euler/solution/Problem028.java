/**
 * Problem: Number spiral diagonals
 * 
 * Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 
 * spiral is formed as follows:
 * 
 *                 21 22 23 24 25
 *                 20  7  8  9 10
 *                 19  6  1  2 11
 *                 18  5  4  3 12
 *                 17 16 15 14 13
 * 
 * It can be verified that the sum of the numbers on the diagonals is 101.
 * 
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed 
 * in the same way?
 */

package com.suman.euler.solution;

import com.suman.euler.problem.EulerProblem;

public class Problem028 implements EulerProblem {

	private final int SIZE = 1001;

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		long NE, NW, SE, SW;
		long NEDiff = 8L, NWDiff = 6L, SEDiff = 2L, SWDiff = 4L;
		NE = NW = SE = SW = 1L;
		long sum = 1;
		long diffStep = 8L;
		for (int index = 0; index < (SIZE - 1) / 2; index++) {
			NE += NEDiff;
			NW += NWDiff;
			SE += SEDiff;
			SW += SWDiff;
			sum += (NE + NW + SE + SW);
			
			NEDiff += diffStep;
			NWDiff += diffStep;
			SEDiff += diffStep;
			SWDiff += diffStep;
		}
		return sum;
	}
}
