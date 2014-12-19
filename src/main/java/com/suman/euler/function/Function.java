package com.suman.euler.function;

import java.util.ArrayList;
import java.util.List;

public class Function {
	/** The maximum difference between two range */
	public static final long MAX_DIFFERENCE = 10000L;

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
	public static List<Integer> getPrimeSequence(int maximum) {
		List<Integer> primeSequence = new ArrayList<>();
		List<Integer> oddNumberSequence = new ArrayList<>();
		primeSequence.add(2);
		for (int index = 3; index < maximum; index += 2) {
			oddNumberSequence.add(index);
		}
		while (oddNumberSequence.size() != 0) {
			int expectedPrimeNumber = oddNumberSequence.remove(0);
			List<Integer> workingNaturalNumberSequence = new ArrayList<>(
					oddNumberSequence);
			for (int number : workingNaturalNumberSequence) {
				if (number % expectedPrimeNumber == 0) {
					oddNumberSequence.remove(number);
				}
			}
			primeSequence.add(expectedPrimeNumber);
		}
		return primeSequence;
	}

	/**
	 * Check the number is prime or not.
	 *
	 * @param number
	 *            the number to be checked
	 * @return the true if the number is prime, false otherwise
	 */
	public static boolean isPrime(long number) {
		boolean prime = true;
		for (long index = 2; index <= Math.sqrt(number); index++) {
			if (number % index == 0) {
				prime = false;
				break;
			}
		}

		return prime;
	}

	/**
	 * Gets the prime sequence between the range. The difference between start
	 * range and end range should be less than or equal to {@link Function}
	 * .MAX_DIFFERENCE
	 *
	 * @param startRange
	 *            the start range
	 * @param endRange
	 *            the end range
	 * @return the prime sequence
	 * @throws Exception
	 *             if the difference between start range and end range should be
	 *             less than or equal to {@link Function}.MAX_DIFFERENCE
	 */
	public static List<Long> getPrimeSequence(long startRange, long endRange)
			throws Exception {
		if (endRange - startRange > MAX_DIFFERENCE) {
			throw new Exception(
					"The difference between start range and end range should be less than or equlal to "
							+ MAX_DIFFERENCE);
		}
		List<Long> primeSequence = new ArrayList<>();
		if (startRange < 3L) {
			primeSequence.add(2L);
			startRange = 3L;
		}
		long offset = 0L;
		if (startRange % 2L == 0) {
			offset = 1L;
		}
		for (long number = startRange + offset; number <= endRange; number += 2) {
			boolean prime = true;
			for (int index = 2; index <= Math.sqrt(number); index++) {
				if (number % index == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				primeSequence.add(number);
			}
		}
		return primeSequence;
	}

}
