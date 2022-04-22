package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddString {

	@Test
	public void test() {
		JUnitFunction JUnit = new JUnitFunction();
		String result= JUnit.Concate("Ayush", "Dhyani");
		assertEquals(result,"AyushDhyani");
	}
}
