package com.suman.euler.function;

import java.math.BigInteger;
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
			List<Integer> workingNaturalNumberSequence = new ArrayList<>(oddNumberSequence);
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
		if ((number <= 1) || (number != 2 && (number % 2 == 0))) {
			prime = false;
		} else {
			double maxFactor = Math.floor(Math.sqrt(number));
			for (long factor = 3; factor <= maxFactor; factor += 2) {
				if (number % factor == 0) {
					prime = false;
					break;
				}
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
	 * @throws IllegalArgumentException
	 *             if the difference between start range and end range should be
	 *             less than or equal to {@link Function}.MAX_DIFFERENCE
	 */
	public static List<Long> getPrimeSequence(long startRange, long endRange) {
		if (endRange - startRange > MAX_DIFFERENCE) {
			throw new IllegalArgumentException(
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
			if (isPrime(number)) {
				primeSequence.add(number);
			}
		}
		return primeSequence;
	}

	/**
	 * Check the string is palindrome or not
	 * 
	 * @param input
	 *            the string to be checked
	 * @return true if palindrome or false if not
	 */
	public static boolean isPalindrome(String input) {
		int inputLength = input.length();
		if (inputLength == 0 || inputLength == 1) {
			return true;
		} else if (input.charAt(0) == input.charAt(inputLength - 1)) {
			return isPalindrome(input.substring(1, inputLength - 1));
		} else {
			return false;
		}
	}

	/**
	 * Check the number is palindrome or not
	 * 
	 * @param input
	 *            the number to be checked
	 * @return true if palindrome or false if not
	 */
	public static boolean isPalindrome(long input) {
		return isPalindrome(String.valueOf(input));
	}

	/**
	 * Get GCD of two numbers
	 * 
	 * @param numberOne
	 *            the number one
	 * @param numberTwo
	 *            the number two
	 * @return the GCD
	 */
	public static long getGCD(long numberOne, long numberTwo) {
		while (numberTwo > 0) {
			long container = numberTwo;
			numberTwo = numberOne % numberTwo; // % is remainder
			numberOne = container;
		}
		return numberOne;
	}

	/**
	 * Get GCD of array of numbers
	 * 
	 * @param input
	 *            the array number
	 * @return the GCD
	 */
	public static long getGCD(List<Long> input) {
		long result = input.get(0);
		for (int index = 1; index < input.size(); index++) {
			result = getGCD(result, input.get(index));
		}
		return result;
	}

	/**
	 * Get LCM of two numbers
	 * 
	 * @param numberOne
	 *            the number one
	 * @param numberTwo
	 *            the number two
	 * @return the LCM
	 */
	public static long getLCM(long numberOne, long numberTwo) {
		return numberOne * (numberTwo / getGCD(numberOne, numberTwo));
	}

	/**
	 * Get LCM of array of numbers
	 * 
	 * @param input
	 *            the array number
	 * @return the LCM
	 */
	public static long getLCM(List<Long> input) {
		long result = input.get(0);
		for (int index = 1; index < input.size(); index++) {
			result = getLCM(result, input.get(index));
		}
		return result;
	}

	/**
	 * The sum of the first n natural numbers, Sn, is:
	 * 
	 * S<sub>n</sub> = n(n+1) / 2
	 * 
	 * @param number
	 *            the n<sup>th</sup> number
	 * @return the sum of n natural numbers
	 */
	public static long sumOfTheNaturalNumbers(long number) {
		return ((number * (number + 1)) / 2);
	}

	/**
	 * The sum of the square of the first n natural numbers, Sn, is:
	 * 
	 * S<sub>n</sub><sup>2</sup> = n(n+1)(2n+1) / 6
	 * 
	 * @param number
	 *            the n<sup>th</sup> number
	 * @return the sum of n natural numbers
	 */
	public static long sumOfTheSquareOfTheNaturalNumbers(long number) {
		return ((number * (number + 1) * ((number * 2) + 1)) / 6);
	}

	/**
	 * To get the combination of 'r' numbers from 'n' numbers, in mathematics
	 * the equation is: nCr
	 * 
	 * @param n
	 *            the n numbers
	 * @param r
	 *            the r numbers from n
	 * @return the combination of nCr
	 */
	public static BigInteger getCombinations(BigInteger n, BigInteger r) {
		return getFactorial(n).divide(getFactorial(r).multiply(getFactorial(n.subtract(r))));

	}

	/**
	 * To get the factorial of a number
	 * 
	 * @param number
	 *            the number to be calculated
	 * @return the factorial of the number
	 */
	public static BigInteger getFactorial(BigInteger number) {
		BigInteger factorial = BigInteger.ONE;
		while (number.compareTo(BigInteger.ONE) == 1) {
			factorial = factorial.multiply(number);
			number = number.subtract(BigInteger.ONE);
		}
		return factorial;
	}

	/**
	 * To get the factorial of a integer number
	 * 
	 * @param number
	 *            the number to be calculated
	 * @return the factorial of the number
	 */
	public static int getFactorial(int number) {
		int factorial = 1;
		while (number > 1) {
			factorial = factorial * number;
			number = number - 1;
		}
		return factorial;
	}

	/**
	 * Get the list of proper divisor
	 * 
	 * @param number
	 *            the number to be calculated
	 * @return the list of proper divisor
	 */
	public static List<Integer> getProperDivisors(int number) {
		int limit = (int) Math.floor(Math.sqrt(number));
		List<Integer> properDivisor = new ArrayList<>(limit);
		for (int index = 1; index <= limit; index++) {
			// Checking proper divisible or not
			if (number % index == 0) {
				if (properDivisor.contains(index)) {
					continue;
				}
				properDivisor.add(index);
				int another = number / index;
				if (another != number && another != index) {

					properDivisor.add(another);
				}
			}
		}
		return properDivisor;
	}

	/**
	 * Get the sum of integer numbers
	 * 
	 * @param numbers
	 *            the list of integer number
	 * @return the sum of numbers
	 */
	public static int getSumOfIntegerNumbers(List<Integer> numbers) {
		int sum = 0;
		for (Integer value : numbers) {
			sum += value;
		}
		return sum;
	}

	/**
	 * Get the sum of long numbers
	 * 
	 * @param numbers
	 *            the list of long number
	 * @return the sum of numbers
	 */
	public static long getSumOfLongNumbers(List<Long> numbers) {
		long sum = 0L;
		for (Long value : numbers) {
			sum += value;
		}
		return sum;
	}

	/**
	 * Check the number is abundant or not
	 * 
	 * @param number
	 *            the number to be checked
	 * @return true if number is abundant, false otherwise
	 */
	public static boolean isAbundantNumber(int number) {
		boolean status = false;
		List<Integer> divisor = getProperDivisors(number);
		int sumOfDivisor = getSumOfIntegerNumbers(divisor);
		if (sumOfDivisor > number) {
			status = true;
		}
		return status;
	}

	/**
	 * Check the number is perfect number or not
	 * 
	 * @param number
	 *            the number to be checked
	 * @return true if number is perfect number, false otherwise
	 */
	public static boolean isPerfectNumber(int number) {
		boolean status = false;
		List<Integer> divisor = getProperDivisors(number);
		int sumOfDivisor = getSumOfIntegerNumbers(divisor);
		if (sumOfDivisor == number) {
			status = true;
		}
		return status;
	}

	/**
	 * Check the number is deficient number or not
	 * 
	 * @param number
	 *            the number to be checked
	 * @return true if number is deficient number, false otherwise
	 */
	public static boolean isDeficientNumber(int number) {
		boolean status = false;
		List<Integer> divisor = getProperDivisors(number);
		int sumOfDivisor = getSumOfIntegerNumbers(divisor);
		if (sumOfDivisor < number) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {
		// int n = 6;
		double PHI = (1 + Math.sqrt(5)) / 2;
		for (int n = 1; n < 10; n++) {
			double result = Math.ceil(Math.pow(PHI, n) / Math.sqrt(5) + 1 / 2);
			System.out.print(result + ", ");
		}
		System.out.println();
	}
}
