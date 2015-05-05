package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;


/**
 * The class <code>Problem013Test</code> contains tests for the class {@link <code>Problem013</code>}.
 *
 * @author Suman Pal
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 19/12/14 2:40 PM
 */
public class Problem013Test extends EulerTest {
	
	/** The expected. */
	private final String expected = "5537376230";

	/**
	 * Construct new test instance.
	 */
	public Problem013Test() {
		super(new Problem013());
	}

	/**
	 * Run the Object executeSoultion() method test.
	 */
	@Test(timeout=TIME_OUT)
	public void testExecuteSoultion() {
		String actual = (String) eulerProblem.executeSoultion();
		this.result = actual;
		assertEquals(expected, actual);
	}

}
