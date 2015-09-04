package classprogs;

import classprogs.util.PackageTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for classprogs");
		//$JUnit-BEGIN$
		suite.addTest(PackageTestSuite.suite());
		//$JUnit-END$
		return suite;
	}

}
