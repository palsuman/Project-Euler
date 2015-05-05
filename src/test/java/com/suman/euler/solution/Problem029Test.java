package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;


/**
 * The class <code>Problem029Test</code> contains tests for the class {@link <code>Problem029</code>}.
 *
 * @author Suman Pal
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 19/12/14 2:40 PM
 */
public class Problem029Test extends EulerTest {
	
	/** The expected. */
	private final Integer expected = 9183;

	/**
	 * Construct new test instance.
	 */
	public Problem029Test() {
		super(new Problem029());
	}

	/**
	 * Run the Object executeSoultion() method test.
	 */
	@Test(timeout=TIME_OUT)
	public void testExecuteSoultion() {
		Integer actual = (Integer) eulerProblem.executeSoultion();
		this.result = actual;
		assertEquals(expected, actual);
	}

}
