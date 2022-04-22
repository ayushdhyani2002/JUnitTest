package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNum {

	@Test
	public void test() {
		JUnitFunction JUnit = new JUnitFunction();
		int num = JUnit.sum(100, 200);
		assertEquals(num,300);
	}
}
