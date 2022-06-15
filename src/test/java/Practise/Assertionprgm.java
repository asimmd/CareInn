package Practise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionprgm {
	
	
	@Test
	public void m1() {
		
		System.out.println("test1");
		System.out.println("test2");
		Assert.assertEquals("A", "B");
		System.out.println("test3");
		System.out.println("test4");
		
	}

	@Test
	public void m2() {
		
		System.out.println("test5");
		System.out.println("test6");
		
	}

}
