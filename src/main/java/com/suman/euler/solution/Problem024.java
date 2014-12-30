/**
 * Problem: Lexicographic permutations
 * 
 * A permutation is an ordered arrangement of objects. For example, 
 * 3124 is one possible permutation of the digits 1, 2, 3 and 4. 
 * If all of the permutations are listed numerically or alphabetically, 
 * we call it lexicographic order. The lexicographic permutations of 0, 1 
 * and 2 are:
 * 
 *                  012   021   102   120   201   210
 *                  
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 
 * 4, 5, 6, 7, 8 and 9?
 */

package com.suman.euler.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.suman.euler.function.Function;
import com.suman.euler.problem.EulerProblem;

public class Problem024 implements EulerProblem {
	private int position = 1000000;

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		List<String> numbers = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
		String lexicographic = "";
		while (numbers.size() != 0) {
			int noOfSymbol = numbers.size() - 1;
			int factorialOfSymbol = Function.getFactorial(noOfSymbol);
			int multiplyer = 0;
			if (position % factorialOfSymbol == 0) {
				multiplyer = position / factorialOfSymbol - 1;
			} else {
				multiplyer = position / factorialOfSymbol;
			}
			position = position - (factorialOfSymbol * multiplyer);
			lexicographic += numbers.remove(multiplyer);
		}
		return lexicographic;
	}
}
