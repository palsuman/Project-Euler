package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;

/**
 * The class <code>Problem001Test</code> contains tests for the class {@link <code>Problem001</code>}
 *
 * @pattern JUnit Test Case
 *
 * @generatedBy CodePro at 19/12/14 2:40 PM
 *
 * @author icteas
 *
 * @version $Revision$
 */
public class Problem001Test extends EulerTest {
	
	/** The expected. */
	private final int expected = 233168;

	/**
	 * Construct new test instance.
	 */
	public Problem001Test() {
		super(new Problem001());
	}

	/**
	 * Run the Object executeSoultion() method test
	 */
	@Test(timeout=TIME_OUT)
	public void testExecuteSoultion() {
		int actual = (int) eulerProblem.executeSoultion();
		assertEquals(expected, actual);
	}

}
