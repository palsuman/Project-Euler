package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;


/**
 * The class <code>Problem025Test</code> contains tests for the class {@link <code>Problem025</code>}.
 *
 * @author Suman Pal
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 19/12/14 2:40 PM
 */
public class Problem025Test extends EulerTest {
	
	/** The expected. */
	private final int expected = 4782;

	/**
	 * Construct new test instance.
	 */
	public Problem025Test() {
		super(new Problem025());
	}

	/**
	 * Run the Object executeSoultion() method test.
	 */
	@Test(timeout=TIME_OUT)
	public void testExecuteSoultion() {
		int actual = (int) eulerProblem.executeSoultion();
		this.result = actual;
		assertEquals(expected, actual);
	}

}
