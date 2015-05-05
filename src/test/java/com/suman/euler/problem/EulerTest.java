package com.suman.euler.problem;

import org.junit.After;
import org.junit.Before;


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
	
	protected Object result;

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
		System.out.println("Problem: " + this.eulerProblem.getClass().getSimpleName() + "\tResult: " + result);
		System.out.println("Total exceution time: " + totalTime / 1000.0
				+ " sec");
	}
}
