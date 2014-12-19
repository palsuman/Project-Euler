package com.suman.euler.function;

import java.util.ArrayList;
import java.util.List;

public class Function {

	/**
	 * Gets the fibonacci sequence.
	 *
	 * @param maximum
	 *            the maximum number of the fibonacci sequence
	 * @return the fibonacci sequence
	 */
	public static List<Integer> getFibonacciSequence(int maximum) {
		List<Integer> fibonacciSequence = new ArrayList<>();
		int firstOne = 1;
		int secondOne = 2;
		fibonacciSequence.add(firstOne);
		fibonacciSequence.add(secondOne);
		while (secondOne < maximum) {
			int nextOne = firstOne + secondOne;
			firstOne = secondOne;
			secondOne = nextOne;
			fibonacciSequence.add(nextOne);
		}
		return fibonacciSequence;
	}

	/**
	 * Checks if number is even or not.
	 *
	 * @param number
	 *            the number to be checked
	 * @return true, if is even
	 */
	public static boolean isEven(int number) {
		boolean even = false;
		if (number % 2 == 0) {
			even = true;
		}
		return even;
	}

	/**
	 * Checks if number is odd or not.
	 *
	 * @param number
	 *            the number to be checked
	 * @return true, if is odd
	 */
	public static boolean isOdd(int number) {
		boolean odd = false;
		if (number % 2 != 0) {
			odd = true;
		}
		return odd;
	}

	/**
	 * Gets the prime sequence.
	 *
	 * @param maximum
	 *            the maximum prime number of the prime sequence
	 * @return the prime sequence
	 */
	public static List<Long> getPrimeSequence(long maximum) {
		List<Long> primeSequence = new ArrayList<>();
		List<Long> oddNumberSequence = new ArrayList<>();
		primeSequence.add(2L);
		for (long index = 3L; index < maximum; index += 2) {
			oddNumberSequence.add(index);
		}
		while (oddNumberSequence.size() != 0) {
			long expectedPrimeNumber = oddNumberSequence.remove(0);
			List<Long> workingNaturalNumberSequence = new ArrayList<>(oddNumberSequence);
			for (long number : workingNaturalNumberSequence) {
				if (number % expectedPrimeNumber == 0) {
					oddNumberSequence.remove(number);
				}
			}
			primeSequence.add(expectedPrimeNumber);
		}
		return primeSequence;
	}

}
