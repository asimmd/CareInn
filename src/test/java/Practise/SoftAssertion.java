package Practise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	
	@Test
	public void m1() {
		
		System.out.println("test1");
		System.out.println("test2");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("a", "c");
		System.out.println("test3");
		System.out.println("test4");
		sa.assertAll();
		
	}

	@Test
    public void m2() {
		
		System.out.println("test5");
		System.out.println("test6");
		
	}

}
