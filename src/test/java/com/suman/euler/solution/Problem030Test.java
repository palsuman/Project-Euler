package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;


/**
 * The class <code>Problem030Test</code> contains tests for the class {@link <code>Problem030</code>}.
 *
 * @author Suman Pal
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 19/12/14 2:40 PM
 */
public class Problem030Test extends EulerTest {
	
	/** The expected. */
	private final Long expected = 443839L;

	/**
	 * Construct new test instance.
	 */
	public Problem030Test() {
		super(new Problem030());
	}

	/**
	 * Run the Object executeSoultion() method test.
	 */
	@Test(timeout=TIME_OUT)
	public void testExecuteSoultion() {
		Long actual = (Long) eulerProblem.executeSoultion();
		this.result = actual;
		assertEquals(expected, actual);
	}

}
