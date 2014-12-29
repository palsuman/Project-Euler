/**
 * Problem: Counting Sundays
 * 
 * You are given the following information, but you may prefer to do some research for 
 * yourself.
 * 
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it 
 * is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century 
 * (1 Jan 1901 to 31 Dec 2000)?
 */

package com.suman.euler.solution;

import java.util.Calendar;

import com.suman.euler.problem.EulerProblem;

public class Problem019 implements EulerProblem {

	/**
	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()
	 */
	public Object executeSoultion() {
		long totalSundays = 0;
		final int centuryStartYear = 1901;
		final int centuryEndYear = 2000;
		Calendar calendar = Calendar.getInstance();
		for (int year = centuryStartYear; year <= centuryEndYear; year++) {
			for (int month = Calendar.JANUARY; month <= Calendar.DECEMBER; month++) {
				calendar.set(year, month, 1);
				int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
				switch (dayOfWeek) {
				case Calendar.SUNDAY:
					totalSundays++;
				}
			}
		}
		return totalSundays;
	}

}
