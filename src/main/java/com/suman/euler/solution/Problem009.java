/**
 * Problem: Special Pythagorean triplet
 * 
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * 	
 * 							a<sup>2</sup> + b<sup>2</sup> = c<sup>2</sup>
 * 
 * For example, 3<sup>2</sup> + 4<sup>2</sup> = 9 + 16 = 25 = 5<sup>2</sup>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000
 * Find the product abc
 */

package com.suman.euler.solution;

import com.suman.euler.problem.EulerProblem;

public class Problem009 implements EulerProblem {

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		long product = 0;
		boolean isProduct = false;
		for (long a = 3; a < 1000; a++) {
			for (long b = a + 1; b < 500; b++) {
				double cSquare = Math.pow(a, 2) + Math.pow(b, 2);
				double c = Math.sqrt(cSquare);
				if (c == (double) (1000 - (a + b))) {
					product = a * b * (long) c;
					isProduct = true;
					break;
				}
			}
			if (isProduct) {
				break;
			}
		}
		return product;
	}

}
