package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;


/**
 * The class <code>Problem002Test</code> contains tests for the class {@link <code>Problem002</code>}.
 *
 * @author Suman Pal
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 19/12/14 2:40 PM
 */
public class Problem002Test extends EulerTest {
	
	/** The expected. */
	private final int expected = 4613732;

	/**
	 * Construct new test instance.
	 */
	public Problem002Test() {
		super(new Problem002());
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
