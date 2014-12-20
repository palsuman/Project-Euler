/**
 * Problem: 10001st prime
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that 
 * the 6th prime is 13.
 * What is the 10001st prime number?
 */

package com.suman.euler.solution;

import com.suman.euler.function.Function;
import com.suman.euler.problem.EulerProblem;

public class Problem007 implements EulerProblem {

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		long nthNumber = 10001;
		long primeNumber = 1;
		while(nthNumber > 1){
			if(Function.isPrime(++primeNumber)){
				--nthNumber;
			}
		}
		return primeNumber;
	}

}
