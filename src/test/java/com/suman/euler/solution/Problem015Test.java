package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;


/**
 * The class <code>Problem015Test</code> contains tests for the class {@link <code>Problem015</code>}
 * .
 *
 * @author Suman Pal
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 19/12/14 2:40 PM
 */
public class Problem015Test extends EulerTest {

	/** The expected. */
	private final String expected = "137846528820";

	/**
	 * Construct new test instance.
	 */
	public Problem015Test() {
		super(new Problem015());
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
