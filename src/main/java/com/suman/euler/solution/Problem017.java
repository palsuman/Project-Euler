/**
 * Problem: Number letter counts
 * 
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then 
 * there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total. 
 * 
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, 
 * how many letters would be used?
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) 
 * contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use 
 * of "and" when writing out numbers is in compliance with British usage.
 */

package com.suman.euler.solution;

import com.suman.euler.problem.EulerProblem;

public class Problem017 implements EulerProblem {
	private final String SPACE = " ";
	private final String HYPHEN = "-";
	private final String AND = "and";
	private final String THOUSAND = "Thousand";
	private final String HUNDRED = "Hundred";
	private final int RANGE = 1000;

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		long sumOfLetters = 0;
		for (int index = 1; index <= RANGE; index++) {
			String numberInWord = convertNumberInWord(index);
			int noOfLetters = getNoOfLetters(numberInWord);
			sumOfLetters += noOfLetters;
		}
		return sumOfLetters;
	}

	private String convertNumberInWord(int number) {
		StringBuilder numberStr = new StringBuilder();
		int quotient = number / 1000;
		if (quotient != 0) {
			numberStr.append(numberToWord(quotient));
			numberStr.append(SPACE);
			numberStr.append(THOUSAND);
			number = number % 1000;
			if (number != 0) {
				appendAnd(numberStr);
			}
		}
		if (number != 0) {
			quotient = number / 100;
			number = number % 100;
			if (quotient != 0) {
				numberStr.append(numberToWord(quotient));
				numberStr.append(SPACE);
				numberStr.append(HUNDRED);
				if (number != 0) {
					appendAnd(numberStr);
				}
			}
			numberStr.append(numberToWord(number));
		}

		return numberStr.toString();
	}

	private void appendAnd(StringBuilder numberStr) {
		numberStr.append(SPACE);
		numberStr.append(AND);
		numberStr.append(SPACE);
	}

	private int getNoOfLetters(String numberInWord) {
		String cleanWord = numberInWord.replaceAll(" ", "");
		cleanWord = cleanWord.replaceAll("-", "");
		return cleanWord.trim().length();
	}

	private String numberToWord(int number) {
		StringBuilder word = new StringBuilder();
		if (number > 19) {
			switch (number / 10) {
			case 2:
				word.append("Twenty");
				break;
			case 3:
				word.append("Thirty");
				break;
			case 4:
				word.append("Forty");
				break;
			case 5:
				word.append("Fifty");
				break;
			case 6:
				word.append("Sixty");
				break;
			case 7:
				word.append("Seventy");
				break;
			case 8:
				word.append("Eighty");
				break;
			case 9:
				word.append("Ninety");
				break;
			}
		}
		if (number > 20 && number % 10 > 0) {
			word.append(HYPHEN);
		}
		if (number > 19) {
			number %= 10;
		}
		if (number > 0) {
			switch (number) {
			case 1:
				word.append("One");
				break;
			case 2:
				word.append("Two");
				break;
			case 3:
				word.append("Three");
				break;
			case 4:
				word.append("Four");
				break;
			case 5:
				word.append("Five");
				break;
			case 6:
				word.append("Six");
				break;
			case 7:
				word.append("Seven");
				break;
			case 8:
				word.append("Eight");
				break;
			case 9:
				word.append("Nine");
				break;
			case 10:
				word.append("Ten");
				break;
			case 11:
				word.append("Eleven");
				break;
			case 12:
				word.append("Twelve");              
				break;                              
			case 13:                                
				word.append("Thirteen");            
				break;                              
			case 14:                                
				word.append("Fourteen");            
				break;                              
			case 15:                                
				word.append("Fifteen");             
				break;
			case 16:
				word.append("Sixteen");
				break;
			case 17:
				word.append("Seventeen");
				break;
			case 18:
				word.append("Eighteen");
				break;
			case 19:
				word.append("Nineteen");
				break;
			}
		}

		return word.toString();
	}
}
