package classprogs.util;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class BasiCalcTest4 {
	BasicCalc calc = null;
	@Before
	public void beforeTest(){
		calc = new BasicCalc();
	}
	@Test
	public void testAdd() {
		int sum = calc.add(4, 3);
		Assert.assertEquals(6, sum);
	}
	
}
