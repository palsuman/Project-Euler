package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;

// TODO: Auto-generated Javadoc
/**
 * The class <code>Problem003Test</code> contains tests for the class {@link <code>Problem003</code>}.
 *
 * @author icteas
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 19/12/14 2:40 PM
 */
public class Problem003Test extends EulerTest {
	
	/** The expected. */
	private final long expected = 6857L;

	/**
	 * Construct new test instance.
	 */
	public Problem003Test() {
		super(new Problem003());
	}

	/**
	 * Run the Object executeSoultion() method test.
	 */
	@Test
	public void testExecuteSoultion() {
		long actual = (long) eulerProblem.executeSoultion();
		System.out.println("result: " + actual);
		assertEquals(expected, actual);
	}

}
