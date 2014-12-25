package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;

// TODO: Auto-generated Javadoc
/**
 * The class <code>Problem014Test</code> contains tests for the class {@link <code>Problem014</code>}
 * .
 *
 * @author icteas
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 19/12/14 2:40 PM
 */
public class Problem014Test extends EulerTest {

	/** The expected. */
	private final int expected = 837799;

	/**
	 * Construct new test instance.
	 */
	public Problem014Test() {
		super(new Problem014());
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
