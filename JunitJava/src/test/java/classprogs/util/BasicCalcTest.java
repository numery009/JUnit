package classprogs.util;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BasicCalcTest extends TestCase {
	BasicCalc bCalc;

protected void setUp() throws Exception {
    bCalc = new BasicCalc();
    super.setUp();
}

	public static TestSuite suite() {
		return new TestSuite(BasicCalcTest.class);
	}

	protected void tearDown() throws Exception {
		bCalc = null;
		super.tearDown();
	}
	
	public BasicCalcTest(String myFirstName){
		super(myFirstName);
	}
	
	public void testAddWithNegativeValue(){
		int sum = bCalc.add(4, -1);
		assertEquals(3, sum);
	}
	
	
	public void testAdd(){
		assertEquals("testwith two postive numbers", 9, bCalc.add(4, 5));	
		assertEquals(5, bCalc.add(4, 1));
		assertEquals("FirstName can't be more than 20 characters",  bCalc.validateFirstName("RajuRajuRajuRajuRajuRaju"));
	}
//
//	
//
	public void testAddWithZero(){
		BasicCalc bCalc = new BasicCalc();
		int sum = bCalc.add(4, 0);
		assertEquals(4, sum);	
	}	
//////////////////////////////
	public void testDivWithZeroDenom(){
		BasicCalc bCalc = new BasicCalc();
		int result;
		boolean gotExcecption = false;
		try{
			result = bCalc.division(4, 0);
		} catch (ArithmeticException ae){
			// Success
			gotExcecption = true;
		}	
		assertTrue(gotExcecption);
	}	
}
