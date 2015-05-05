package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;


/**
 * The class <code>Problem008Test</code> contains tests for the class {@link <code>Problem008</code>}
 * .
 *
 * @author Suman Pal
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 19/12/14 2:40 PM
 */
public class Problem008Test extends EulerTest {

	/** The expected. */
	private final long expected = 23514624000L;

	/**
	 * Construct new test instance.
	 */
	public Problem008Test() {
		super(new Problem008());
	}

	/**
	 * Run the Object executeSoultion() method test.
	 */
	@Test(timeout = TIME_OUT)
	public void testExecuteSoultion() {
		long actual = (long) eulerProblem.executeSoultion();
		this.result = actual;
		assertEquals(expected, actual);
	}

}
