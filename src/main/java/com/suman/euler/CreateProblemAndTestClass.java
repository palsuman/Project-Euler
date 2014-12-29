package com.suman.euler;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateProblemAndTestClass {
	private static final String PROBLEM_NO = "021";

	public static void main(String[] args) {
		try {
			CreateProblemAndTestClass.execute(PROBLEM_NO);
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		}
	}

	public static void execute(String problemNo) throws IOException {
		final String srcPath = getSrcPath();
		final String mainPath = srcPath + "main/java/com/suman/euler/solution/";
		final String testPath = srcPath + "test/java/com/suman/euler/solution/";
		String mainClassName = PRE_CLASS_NAME + problemNo;
		String testClassName = PRE_CLASS_NAME + problemNo + POST_CLASS_NAME;
		String mainClassPath = mainPath + mainClassName + DOT_JAVA;
		String testClassPath = testPath + testClassName + DOT_JAVA;
		String mainData = PROBLEM_TEMPLATE.replaceAll(PROBLEM_NAME, mainClassName);
		String testData = TEST_TEMPLATE.replaceAll(PROBLEM_NAME, mainClassName).replaceAll(PROBLEM_TEST_NAME,
				testClassName);
		createFile(mainClassPath, mainData.getBytes());
		createFile(testClassPath, testData.getBytes());
		System.out.println("Class created successfully !!!");
	}

	private static void createFile(String path, byte[] data) throws IOException {
		File file = new File(path);
		if (file.exists()) {
			throw new IOException("file already exists");
		}
		try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file))) {
			outputStream.write(data);
		}
	}

	private static String getSrcPath() {
		String path = CreateProblemAndTestClass.class.getClassLoader()
				.getResource("com/suman/euler/problem/EulerProblem.class").getPath();
		path = path.substring(0, path.indexOf("target")) + "src/";
		return path;
	}

	private static final String PROBLEM_NAME = "<@PROBLEM_NAME@>";
	private static final String PROBLEM_TEST_NAME = "<@PROBLEM_TEST_NAME@>";
	private static final String DOT_JAVA = ".java";
	private static final String PRE_CLASS_NAME = "Problem";
	private static final String POST_CLASS_NAME = "Test";

	private static final String PROBLEM_TEMPLATE = "/**\n" + " * Problem: <Problem Title>\n" + " * \n"
			+ " * <Problem Defination>\n" + " */\n" + "\n" + "package com.suman.euler.solution;\n" + "\n"
			+ "import com.suman.euler.problem.EulerProblem;\n" + "\n"
			+ "public class <@PROBLEM_NAME@> implements EulerProblem {\n" + "\n" + "	/**\n"
			+ "	 * @see com.suman.euler.problem.EulerProblem#executeSoultion()\n" + "	 */\n"
			+ "	public Object executeSoultion() {\n" + "		return null;\n" + "	}\n" + "}\n";

	private static final String TEST_TEMPLATE = "package com.suman.euler.solution;\n"
			+ "\n"
			+ "import static org.junit.Assert.assertEquals;\n"
			+ "\n"
			+ "import org.junit.Test;\n"
			+ "\n"
			+ "import com.suman.euler.problem.EulerTest;\n"
			+ "\n"
			+ "// TODO: Auto-generated Javadoc\n"
			+ "/**\n"
			+ " * The class <code><@PROBLEM_TEST_NAME@></code> contains tests for the class {@link <code><@PROBLEM_NAME@></code>}.\n"
			+ " *\n" + " * @author icteas\n" + " * @version $Revision$\n" + " * @pattern JUnit Test Case\n"
			+ " * @generatedBy CodePro at 19/12/14 2:40 PM\n" + " */\n"
			+ "public class <@PROBLEM_TEST_NAME@> extends EulerTest {\n" + "	\n" + "	/** The expected. */\n"
			+ "	private final Object expected = new Object();\n" + "\n" + "	/**\n"
			+ "	 * Construct new test instance.\n" + "	 */\n" + "	public <@PROBLEM_TEST_NAME@>() {\n"
			+ "		super(new <@PROBLEM_NAME@>());\n" + "	}\n" + "\n" + "	/**\n"
			+ "	 * Run the Object executeSoultion() method test.\n" + "	 */\n" + "	@Test(timeout=TIME_OUT)\n"
			+ "	public void testExecuteSoultion() {\n" + "		Object actual = eulerProblem.executeSoultion();\n"
			+ "		this.result = actual;\n" + "		assertEquals(expected, actual);\n" + "	}\n" + "\n" + "}\n";
}
