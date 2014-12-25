package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;

// TODO: Auto-generated Javadoc
/**
 * The class <code>Problem017Test</code> contains tests for the class {@link <code>Problem017</code>}
 * .
 *
 * @author icteas
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 19/12/14 2:40 PM
 */
public class Problem017Test extends EulerTest {

	/** The expected. */
	private final String expected = "1366";

	/**
	 * Construct new test instance.
	 */
	public Problem017Test() {
		super(new Problem017());
	}

	/**
	 * Run the Object executeSoultion() method test.
	 */
	@Test(timeout = TIME_OUT)
	public void testExecuteSoultion() {
		String actual = (String) eulerProblem.executeSoultion();
		this.result = actual;
		assertEquals(expected, actual);
	}

}
