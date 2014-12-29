package com.suman.euler.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.suman.euler.problem.EulerTest;

// TODO: Auto-generated Javadoc
/**
 * The class <code>Problem021Test</code> contains tests for the class {@link <code>Problem021</code>}.
 *
 * @author icteas
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 19/12/14 2:40 PM
 */
public class Problem021Test extends EulerTest {
	
	/** The expected. */
	private final int expected = 31626;

	/**
	 * Construct new test instance.
	 */
	public Problem021Test() {
		super(new Problem021());
	}

	/**
	 * Run the Object executeSoultion() method test.
	 */
	@Test//(timeout=TIME_OUT)
	public void testExecuteSoultion() {
		int actual = (int)eulerProblem.executeSoultion();
		this.result = actual;
		assertEquals(expected, actual);
	}

}
