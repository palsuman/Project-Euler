package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;

// TODO: Auto-generated Javadoc
/**
 * The class <code>Problem005Test</code> contains tests for the class {@link <code>Problem005</code>}
 * .
 *
 * @author icteas
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 19/12/14 2:40 PM
 */
public class Problem005Test extends EulerTest {

	/** The expected. */
	private final long expected = 232792560L;

	/**
	 * Construct new test instance.
	 */
	public Problem005Test() {
		super(new Problem005());
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
