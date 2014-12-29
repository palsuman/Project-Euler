package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;

// TODO: Auto-generated Javadoc
/**
 * The class <code>Problem067Test</code> contains tests for the class {@link <code>Problem067</code>}
 * .
 *
 * @author icteas
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 19/12/14 2:40 PM
 */
public class Problem067Test extends EulerTest {

	/** The expected. */
	private final int expected = 7273;

	/**
	 * Construct new test instance.
	 */
	public Problem067Test() {
		super(new Problem067());
	}

	/**
	 * Run the Object executeSoultion() method test.
	 */
	@Test(timeout = TIME_OUT)
	public void testExecuteSoultion() {
		int actual = (int) eulerProblem.executeSoultion();
		this.result = actual;
		assertEquals(expected, actual);
	}

}
