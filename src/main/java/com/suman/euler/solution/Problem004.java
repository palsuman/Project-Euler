/**
 * Problem: Largest palindrome product
 * 
 * A palindromic number reads the same both ways. The largest palindrome made 
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

package com.suman.euler.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.suman.euler.function.Function;
import com.suman.euler.problem.EulerProblem;

public class Problem004 implements EulerProblem {

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		List<Long> possiblePalindromeProduct = new ArrayList<>();
		for (long firstNumber = 999L; firstNumber > 99L; firstNumber--) {
			for (long secondNumber = firstNumber; secondNumber > 99L; secondNumber--) {
				long palindromeProduct = secondNumber * firstNumber;
				if (Function.isPalindrome(palindromeProduct)) {
					possiblePalindromeProduct.add(palindromeProduct);
				}
			}
		}
		Collections.sort(possiblePalindromeProduct);
		int index = possiblePalindromeProduct.size() - 1;
		return possiblePalindromeProduct.get(index);
	}
	
}
