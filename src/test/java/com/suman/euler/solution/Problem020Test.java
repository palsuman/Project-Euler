package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;


/**
 * The class <code>Problem020Test</code> contains tests for the class {@link <code>Problem020</code>}
 * .
 *
 * @author Suman Pal
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 19/12/14 2:40 PM
 */
public class Problem020Test extends EulerTest {

	/** The expected. */
	private final String expected = "648";

	/**
	 * Construct new test instance.
	 */
	public Problem020Test() {
		super(new Problem020());
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
