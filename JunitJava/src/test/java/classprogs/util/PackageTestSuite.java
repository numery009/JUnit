package classprogs.util;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PackageTestSuite extends TestCase
{
	/**
	 * Constructor for PackageTestSuite
	 */
	public PackageTestSuite(String arg0)
	{
		super(arg0);
	}
	public static Test suite()
	{
		TestSuite suite = new TestSuite();
		suite.addTest(BasicCalcTest.suite());
		//
		return suite;
	}
}
