/**
 * Problem: Lattice paths
 * 
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the 
 * right and down, there are exactly 6 routes to the bottom right corner.
 * 
 * How many such routes are there through a 20×20 grid?
 */

package com.suman.euler.solution;

import java.math.BigInteger;

import com.suman.euler.function.Function;
import com.suman.euler.problem.EulerProblem;

public class Problem015 implements EulerProblem {

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		int gridSize = 20;
		int rowSize = 2 * gridSize;
		BigInteger latticePath = Function.getCombinations(
				BigInteger.valueOf(rowSize), BigInteger.valueOf(gridSize));
		return latticePath.toString();
	}
}
