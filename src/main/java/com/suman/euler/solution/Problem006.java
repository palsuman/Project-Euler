/**
 * Problem: Sum square difference
 * 
 * The sum of the squares of the first ten natural numbers is,
 *                1<sup>2</sup> + 2<sup>2</sup> + ... + 10<sup>2</sup> = 385
 * The square of the sum of the first ten natural numbers is,
 *                (1 + 2 + ... + 10)<sup>2</sup> = 55<sup>2</sup> = 3025
 *                
 * Hence the difference between the sum of the squares of the first ten natural 
 * numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred 
 * natural numbers and the square of the sum.
 */

package com.suman.euler.solution;

import com.suman.euler.function.Function;
import com.suman.euler.problem.EulerProblem;

public class Problem006 implements EulerProblem {

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		long nthNumber = 100;
		long difference = 0;
		long sumOfTheNaturalNumbers = Function
				.sumOfTheNaturalNumbers(nthNumber);
		long sumOfTheSquareOfTheNaturalNumbers = Function
				.sumOfTheSquareOfTheNaturalNumbers(nthNumber);
		long squareOfTheSumOfTheNaturalNumbers = (long) Math.pow(
				sumOfTheNaturalNumbers, 2);
		difference = Math.abs(squareOfTheSumOfTheNaturalNumbers
				- sumOfTheSquareOfTheNaturalNumbers);
		return difference;
	}

}
