/**
 * Problem: Largest palindrome product
 * 
 * A palindromic number reads the same both ways. The largest palindrome made 
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

package com.suman.euler.solution;

import com.suman.euler.function.Function;
import com.suman.euler.problem.EulerProblem;

public class Problem004 implements EulerProblem {

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		long possiblePalindromeProduct = 0L;
		for (long firstNumber = 999L; firstNumber > 99L; firstNumber--) {
			for (long secondNumber = firstNumber; secondNumber > 99L; secondNumber--) {
				long palindromeProduct = secondNumber * firstNumber;
				if (Function.isPalindrome(palindromeProduct)) {
					if(palindromeProduct > possiblePalindromeProduct){
						possiblePalindromeProduct = palindromeProduct;
					}
				}
			}
		}
		return possiblePalindromeProduct;
	}
	
}
