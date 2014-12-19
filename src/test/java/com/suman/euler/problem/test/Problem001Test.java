/**
 * 
 */
package com.suman.euler.problem.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.suman.euler.problem.EulerProblem;
import com.suman.euler.solution.Problem001;

/**
 * @author icteas
 *
 */
public class Problem001Test {

	/**
	 * Test method for {@link com.suman.euler.solution.Problem001#executeSoultion()}.
	 */
	@Test(timeout=60000)
	public final void testExecuteSoultion() {
		EulerProblem eulerProblem = new Problem001();
		int actual = (Integer)eulerProblem.executeSoultion();
		int expected = 233168;
		assertEquals(expected, actual);
	}

}
