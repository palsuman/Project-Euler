package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;

// TODO: Auto-generated Javadoc
/**
 * The class <code>Problem028Test</code> contains tests for the class {@link <code>Problem028</code>}.
 *
 * @author icteas
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 19/12/14 2:40 PM
 */
public class Problem028Test extends EulerTest {
	
	/** The expected. */
	private final long expected = 669171001L;

	/**
	 * Construct new test instance.
	 */
	public Problem028Test() {
		super(new Problem028());
	}

	/**
	 * Run the Object executeSoultion() method test.
	 */
	@Test(timeout=TIME_OUT)
	public void testExecuteSoultion() {
		long actual = (long) eulerProblem.executeSoultion();
		this.result = actual;
		assertEquals(expected, actual);
	}

}
