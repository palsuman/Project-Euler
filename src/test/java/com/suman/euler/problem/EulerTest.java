package com.suman.euler.problem;

import org.junit.After;
import org.junit.Before;

// TODO: Auto-generated Javadoc
/**
 * The Class EulerTest.
 */
public abstract class EulerTest {

	/** The Constant TIME_OUT. */
	protected final static int TIME_OUT = 60000;
	
	/** The euler problem. */
	protected EulerProblem eulerProblem;

	/** The start time. */
	private long startTime;

	/** The end time. */
	private long endTime;

	/**
	 * Instantiates a new euler test.
	 *
	 * @param eulerProblem
	 *            the euler problem
	 */
	public EulerTest(EulerProblem eulerProblem) {
		this.eulerProblem = eulerProblem;
	}

	@Before
	public void setUp() {
		this.startTime = System.currentTimeMillis();
	}

	@After
	public void tearDown() {
		this.endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total exceution time: " + totalTime + " ms");
	}
}
